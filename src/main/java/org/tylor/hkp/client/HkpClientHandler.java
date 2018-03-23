package org.tylor.hkp.client;

import org.tylor.common.ResponseCode;
import org.tylor.common.ServerException;
import org.tylor.hkp.codec.MessagePackage;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import lombok.extern.slf4j.Slf4j;

@Slf4j
/**
 * Vagclient IO事件 handler
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:10:42
 */
public class HkpClientHandler extends SimpleChannelInboundHandler<MessagePackage> {
	private BlockingQueue<Object> response = new ArrayBlockingQueue<Object>(1);

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MessagePackage msg) throws Exception {
		log.debug("Server say : " + msg.getXmlMessage());
		response.add(msg.getXmlMessage());
		ctx.close();
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		log.debug("Client active ");
		super.channelActive(ctx);
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		log.debug("Client close ");
		super.channelInactive(ctx);
	}

	public String getResponse() throws InterruptedException {
		Object result = response.take();
		if (result instanceof Throwable) {
			Throwable cause = (Throwable) result;
			throw new ServerException(ResponseCode.FAIL, cause);
		}
		return (String) result;
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		log.error("VAG调用异常：", cause);
		ctx.close();
		response.add(cause);
	}
}