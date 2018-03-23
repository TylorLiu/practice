/**
 * 
 */
package org.tylor.hkp.server;

import java.lang.reflect.ParameterizedType;
import javax.xml.bind.JAXBException;
import org.tylor.util.JaxbUtil;

/**
 * 自带xml序列化、反序列化的vag业务逻辑处理抽象类
 * 
 * @author dengyishi
 *
 *         2017年4月21日 上午9:08:09
 */
public abstract class HkpBizHandlerAdapter<Q> implements HkpBizHandler {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.tylor.vag.io.bizService.VagBizHandler#excute(java.lang.String)
	 */
	@Override
	public String excute(String requestXML) {
		String result;
		try {
			Q request = deserialize(requestXML, getQClass());
			Object response = excuteBiz(request);
			result = serialize(response);
		} catch (JAXBException e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	/**
	 * @param response
	 * @return
	 * @author dengyishi 2017年4月21日 上午9:12:43
	 * @throws JAXBException
	 */
	private String serialize(Object response) throws JAXBException {
		return JaxbUtil.convertToXml(response);
	}

	/**
	 * @param requestXML
	 * @return
	 * @author dengyishi 2017年4月21日 上午9:11:40
	 * @throws JAXBException
	 */
	private Q deserialize(String requestXML, Class<Q> clazz) throws JAXBException {
		return JaxbUtil.convertToJavaBean(requestXML, clazz);
	}

	/**
	 * 已经反序列化后的request，直接处理业务逻辑就行了
	 * 
	 * @param request
	 * @return
	 * @author dengyishi 2017年4月21日 上午10:08:48
	 */
	public abstract Object excuteBiz(Q request);

	@SuppressWarnings("unchecked")
	private Class<Q> getQClass() {
		if (getClass().getGenericSuperclass() == null) {
			throw new RuntimeException("泛型获取失败");
		}
		return (Class<Q>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}
}
