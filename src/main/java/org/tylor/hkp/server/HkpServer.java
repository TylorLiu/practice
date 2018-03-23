package org.tylor.hkp.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.tylor.common.NamedThreadFactory;

/**
 * 监听VAG主动请求
 * 
 * @author dengyishi
 *
 *         2017年4月20日 下午7:11:52
 */
//@Service
@Slf4j
public class HkpServer {
	/**
	 * 服务端监听的端口地址
	 */
//	@Value("${vag.listen.port}")
	private int portNumber;
	EventLoopGroup bossGroup;
	EventLoopGroup workerGroup;
	@Autowired
	HkpServerInitializer vagServerInitializer;

	/**
	 * 应用启动时，开启端口监听
	 * 
	 * @throws InterruptedException
	 * @author dengyishi 2017年3月13日 下午4:59:09
	 */
	@PostConstruct
	public void init() throws InterruptedException {
		Thread thread = new Thread(() -> {
      try {
        startListen();
      } catch (InterruptedException e) {
        log.error("VAG服务监听启动失败", e);
      }
    });
		thread.setName("vag服务监听启动线程");
		thread.start();
	}

	private void startListen() throws InterruptedException {

		bossGroup = new NioEventLoopGroup(0, new NamedThreadFactory("vag服务器-boss"));
		workerGroup = new NioEventLoopGroup(0, new NamedThreadFactory("vag服务器-worker"));
		try {
			ServerBootstrap b = new ServerBootstrap();
			b.group(bossGroup, workerGroup);
			b.channel(NioServerSocketChannel.class);
			b.childHandler(vagServerInitializer);

			// 服务器绑定端口监听
			ChannelFuture f = b.bind(portNumber).sync();
			// 监听服务器关闭监听
			f.channel().closeFuture().sync();

			// 可以简写为
			/* b.bind(portNumber).sync().channel().closeFuture().sync(); */
		} finally {
			shutdownGracefully();
		}

	}

	/**
	 * 应用关闭时，关闭netty监听
	 * 
	 * @author dengyishi 2017年3月13日 下午4:59:27
	 */
	@PreDestroy
	private void shutdownGracefully() {
		bossGroup.shutdownGracefully();
		workerGroup.shutdownGracefully();
	}
}
