package org.tylor.hkp.server;

import org.tylor.hkp.codec.MessagePackage;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:12:25
 */
@Slf4j
@Service
public class HkpServerHandler extends SimpleChannelInboundHandler<MessagePackage> {

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		ctx.fireExceptionCaught(cause);
		log.error("VAG通信发生错误", cause);
		ctx.close();
	}

	private BizHandlerDispatcher msgDispatcher;

	/*
	 * 
	 * 覆盖 channelActive 方法 在channel被启用的时候触发 (在建立连接的时候)
	 * 
	 * channelActive 和 channelInActive 在后面的内容中讲述，这里先不做详细的描述
	 */
	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {

		log.debug("RemoteAddress : " + ctx.channel().remoteAddress() + " active !");

		// ctx.writeAndFlush("Welcome to " +
		// InetAddress.getLocalHost().getHostName() + " service!\n");

		super.channelActive(ctx);
	}

	// 服务器主动断开连接
	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) {
		ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
	}

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, MessagePackage msg) throws Exception {
		log.debug(ctx.channel().remoteAddress() + " Say : " + msg.getXmlMessage());
		msg.setXmlMessage(msgDispatcher.handle(msg.getXmlMessage()));
		ctx.write(msg);
	}

	public BizHandlerDispatcher getMsgDispatcher() {
		return msgDispatcher;
	}

	public void setMsgDispatcher(BizHandlerDispatcher msgDispatcher) {
		this.msgDispatcher = msgDispatcher;
	}

}