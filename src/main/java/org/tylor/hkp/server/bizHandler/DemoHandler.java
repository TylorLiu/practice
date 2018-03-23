/**
 * 
 */
package org.tylor.hkp.server.bizHandler;

import org.tylor.hkp.HkpRequestCommand;
import org.tylor.hkp.HkpRequestMapping;
import org.tylor.hkp.client.bizModel.classData.RhcdCapabilityRequestMessage;
import org.tylor.hkp.client.bizModel.classData.RhcdCapabilityResponseMessage;
import org.tylor.hkp.client.bizModel.classData.RhcdCapabilityResponseMessage.Pack;
import org.tylor.hkp.server.HkpBizHandlerAdapter;
import org.springframework.stereotype.Service;

/**
 * 一个Demo代码，示范如何处理VAG主动请求
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午8:21:14
 */
@Service
@HkpRequestMapping(command = HkpRequestCommand.TRANSSTDCONFIG)
public class DemoHandler extends HkpBizHandlerAdapter<RhcdCapabilityRequestMessage> {

	@Override
	public RhcdCapabilityResponseMessage excuteBiz(RhcdCapabilityRequestMessage request) {
		RhcdCapabilityResponseMessage response = new RhcdCapabilityResponseMessage();
		Pack pack = new Pack();
		pack.setType("PPVSP");
		response.setPack(pack);
		return response;
	}

}
