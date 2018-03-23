package org.tylor.hkp.server.bizHandler;

import org.tylor.hkp.HkpRequestCommand;
import org.tylor.hkp.HkpRequestMapping;
import org.tylor.hkp.codec.ResponseMessage;
import org.tylor.hkp.server.HkpBizHandlerAdapter;
import org.tylor.hkp.server.message.MessageFactory;
import org.tylor.hkp.server.message.RegisterRequestMessage;
import org.springframework.stereotype.Service;

/**
 * @author liubin10
 *		   2017年5月15日
 */
@Service
@HkpRequestMapping(command = HkpRequestCommand.REGISTER_REQ)
public class RegisterReqHandler extends HkpBizHandlerAdapter<RegisterRequestMessage>{
	
	@Override
	public ResponseMessage excuteBiz(RegisterRequestMessage request) {
		
		return MessageFactory.createResponseMessage(request.getPack().getCommand());
	}

}
