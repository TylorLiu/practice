/**
 * 处理VAG主动请求，具体业务逻辑
 */
package org.tylor.hkp.server;

/**
 * @author dengyishi
 *
 *         2017年4月20日 下午8:19:11
 */
public interface HkpBizHandler {
	String excute(String requestXML);
}
