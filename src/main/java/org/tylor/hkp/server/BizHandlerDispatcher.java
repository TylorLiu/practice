package org.tylor.hkp.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import org.tylor.hkp.HkpPackType;
import org.tylor.hkp.HkpRequestMapping;

/**
 * VAG主动请求，分发器
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:20:40
 */
@Service
@Slf4j
public class BizHandlerDispatcher implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	private Map<String, HkpBizHandler> hkpVagBizHandlerMap = new HashMap<>();// 目前只有HKP包类型的VAG主动请求

	public String handle(String xmlMessage) {
		Document doc;
		try {
			doc = DocumentHelper.parseText(xmlMessage);
		} catch (DocumentException e) {
			throw new RuntimeException(e);
		}
		String packType = extractPackType(doc);
		switch (packType) {
		case "HKP":
			String command = extractCommand(doc);
			HkpBizHandler vagBizHandler = getHandlerByCommand(command);
			if (vagBizHandler == null) {
				log.error("VAG报文无法处理：" + xmlMessage);
				throw new RuntimeException("未找到对应VAG请求handler");
			}
			return vagBizHandler.excute(xmlMessage);

		default:
			throw new RuntimeException("VAG报文无法处理");
		}

	}

	/**
	 * @param doc
	 * @return
	 * @author dengyishi 2017年4月21日 上午11:50:31
	 */
	private String extractPackType(Document doc) {
		@SuppressWarnings("unchecked")
		List<Element> list = doc.selectNodes("//Pack");
		if (list != null && !list.isEmpty()) {
			Element element = list.get(0);
			return element.attribute(0).getText();
		}
		throw new RuntimeException("无法提取Pack 节点type属性");
	}

	@PostConstruct
	public void init() {
		Map<String, Object> vagBizHandlers = applicationContext.getBeansWithAnnotation(HkpRequestMapping.class);
		for (Entry<String, Object> entry : vagBizHandlers.entrySet()) {
			if (entry.getValue() instanceof HkpBizHandler) {
				HkpBizHandler vagBizHandler = (HkpBizHandler) entry.getValue();
				HkpRequestMapping requestMapping = vagBizHandler.getClass().getAnnotation(HkpRequestMapping.class);
				if (requestMapping != null && requestMapping.packType().equals(HkpPackType.HKP)) {
					hkpVagBizHandlerMap.put(requestMapping.command().getCommand(), vagBizHandler);
				}
			} else {
				throw new RuntimeException("非Vag 主动请求Handler不适用VagRequestMapping注解！");
			}

		}
	}

	/**
	 * 根据请求xml中的command标签的值获取对应的业务handler
	 * 
	 * @param command
	 * @return
	 * @author dengyishi 2017年4月20日 下午8:24:57
	 */
	private HkpBizHandler getHandlerByCommand(String command) {
    return hkpVagBizHandlerMap.get(command);
	}

	private String extractCommand(Document doc) {
		@SuppressWarnings("unchecked")
		List<Element> list = doc.selectNodes("//Command");
		if (list != null && !list.isEmpty()) {
			Element element = list.get(0);
			return element.getStringValue();
		}
		throw new RuntimeException("无法提取command字段");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.ApplicationContextAware#setApplicationContext
	 * (org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

}
