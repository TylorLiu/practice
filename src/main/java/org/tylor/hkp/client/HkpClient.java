package org.tylor.hkp.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import java.io.IOException;
import javax.xml.bind.JAXBException;
import lombok.extern.slf4j.Slf4j;
import org.tylor.common.NamedThreadFactory;
import org.tylor.common.ResponseCode;
import org.tylor.common.ServerException;
import org.tylor.hkp.codec.MessagePackage;
import org.tylor.util.JaxbUtil;

/**
 * 用于调用vag,短连接
 *
 * @author dengyishi
 *
 * 2017年4月20日 下午7:01:24
 */
@Slf4j
public class HkpClient {

    private String host = "10.33.32.52";
    private int port = 7302;

    public HkpClient(String host, int port) {
        super();
        this.host = host;
        this.port = port;
    }

    /**
     * 发送请求给vag，同步返回vag response
     *
     * @author dengyishi 2017年4月20日 下午6:58:00
     */
    public <T> T sendRequest(Object request, Class<T> responseClass) {
        EventLoopGroup group = new NioEventLoopGroup(0, new NamedThreadFactory("vag客户端"));
        try {
            Bootstrap b = new Bootstrap();
            HkpClientInitializer initializer = new HkpClientInitializer();
            b.group(group).channel(NioSocketChannel.class).handler(initializer);
            // 连接服务端
            Channel ch = b.connect(host, port).sync().channel();
            String requestString;
            if (request instanceof String) {
                requestString = (String) request;
            } else {
                requestString = JaxbUtil.convertToXml(request);
            }

//      requestString = requestString.replaceAll("<ConfigXML>","<ConfigXML>\t<![CDATA[").replaceAll("</ConfigXML>","]]</ConfigXML>");
//      requestString = requestString.replaceAll("<Terminal ","<TerminalList version=\"2.0\" xmlns=\"http://www.isapi.org/ver20/XMLSchema\" size=\"1\"><Terminal ").replaceAll("<Terminal/>","<Terminal/></TerminalList>");
            MessagePackage messagePackage = new MessagePackage(requestString);
            ch.writeAndFlush(messagePackage);
            ch.closeFuture().sync();
            String responseString = initializer.getResponse();
//			responseString = responseString.replaceAll("<!\\[CDATA\\[","").replaceAll("xmlns=\"http://www.isapi.org/ver20/XMLSchema\"","").replaceAll("]]","");
            log.info(responseString);
            if (responseClass.equals(String.class)) {
                return (T) responseString;
            }
            return JaxbUtil.convertToJavaBean(responseString, responseClass);
        } catch (JAXBException | InterruptedException e) {
            throw new ServerException(ResponseCode.PARAM_ERROR, e);
        } catch (Exception e) {
            throw new ServerException(ResponseCode.FAIL.getValue(), "Vag连接失败", e);
        } finally {
            // The connection is closed automatically on shutdown.
            group.shutdownGracefully();
        }
    }

}