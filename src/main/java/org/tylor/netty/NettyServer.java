package org.tylor.netty;


import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.ServerChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.base64.Base64Decoder;
import io.netty.handler.codec.base64.Base64Encoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
import io.netty.handler.ssl.SslHandler;
import java.net.ServerSocket;
import org.tylor.common.NamedThreadFactory;
import org.tylor.hkp.client.HkpClientHandler;

/**
 * @author liubin10  2018/3/5
 */
public class NettyServer {

    void init() {

    }

    void startUp() {
        ServerBootstrap bootstrap = new ServerBootstrap();

        EventLoopGroup bossGroup =  new NioEventLoopGroup(1, new NamedThreadFactory("Server Boss"));

        EventLoopGroup workerGroup  =    new NioEventLoopGroup(0, new NamedThreadFactory("Server Worker"));
        bootstrap.group(bossGroup,workerGroup).channel(NioServerSocketChannel.class).childHandler(
            new ChannelInitializer<SocketChannel>() {
                @Override
                protected void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new LoggingHandler(LogLevel.INFO),new Base64Decoder(),new Base64Encoder(),new HkpClientHandler());
                }
            });
        bootstrap.bind(7017);
//        bootstrap.handler();


    }
}

