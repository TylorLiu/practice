package org.tylor.hkp.server;

import org.tylor.hkp.codec.MessagePackageDecoder;
import org.tylor.hkp.codec.MessagePackageEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.logging.LoggingHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:12:31
 */
@Service
public class HkpServerInitializer extends ChannelInitializer<SocketChannel> {
	@Autowired
	BizHandlerDispatcher msgDispatcher;

	@Override
	protected void initChannel(SocketChannel ch) throws Exception {
		ChannelPipeline pipeline = ch.pipeline();
		ch.pipeline().addLast(new LoggingHandler());
		// 海康协议解码 和 编码
		ch.pipeline().addLast("MessageDecoder", new MessagePackageDecoder(1024 * 1024, 4, 4, -8, 0));
		ch.pipeline().addLast("MessageEncoder", new MessagePackageEncoder());
		HkpServerHandler vagServerHandler = new HkpServerHandler();// 必须每次new，因为netty默认每个channel分配一个channelHandler，为防止并发竞争
		vagServerHandler.setMsgDispatcher(msgDispatcher);// MsgDispatcher为并发安全类,无状态
		// 自己的逻辑Handler
		pipeline.addLast("handler", vagServerHandler);
	}

}