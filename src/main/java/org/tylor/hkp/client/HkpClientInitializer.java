package org.tylor.hkp.client;

import org.tylor.hkp.codec.MessagePackageDecoder;
import org.tylor.hkp.codec.MessagePackageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.timeout.ReadTimeoutHandler;

/**
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:11:45
 */
public class HkpClientInitializer extends ChannelInitializer<SocketChannel> {
	private HkpClientHandler vagClientHandler = new HkpClientHandler();

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();

		/*
		 * 这个地方的 必须和服务端对应上。否则无法正常解码和编码
		 * 
		 */
		// 海康协议解码 和 编码
		ch.pipeline().addLast(new LoggingHandler());
		ch.pipeline().addLast("MessageDecoder", new MessagePackageDecoder(1024 * 1024, 4, 4, -8, 0));
		ch.pipeline().addLast("MessageEncoder", new MessagePackageEncoder());
		ch.pipeline().addLast("ReadTimeout", new ReadTimeoutHandler(15));
		// 客户端的逻辑
		pipeline.addLast("handler", vagClientHandler);
	}

	public String getResponse() throws InterruptedException {
		return vagClientHandler.getResponse();
	}
}