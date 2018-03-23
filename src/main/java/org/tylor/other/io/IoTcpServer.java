package org.tylor.other.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

/**
 * Block IO 特点：
 * 1. 连接数：线程数=1：1
 * 2. 线程等待IO操作
 */
public class IoTcpServer {

    public static class SocketHandler implements Runnable {
        Socket clntSocket;
        public SocketHandler(Socket clntSocket) {
            this.clntSocket =clntSocket;
        }

        @Override
        public void run() {
            InputStream in = null;
            OutputStream out = null;
            SocketAddress clientAddress = clntSocket.getRemoteSocketAddress();
            System.out.println("Handling client at " + clientAddress);
            int recvMsgSize = 0;
            byte[] recvBuf = new byte[1024];

            try {
                in = clntSocket.getInputStream();
                while ((recvMsgSize = in.read(recvBuf)) != -1) {
                    byte[] temp = new byte[recvMsgSize];
                    System.arraycopy(recvBuf, 0, temp, 0, recvMsgSize);
                    System.out.println(new String(temp));
                }
                String remoteAddr = clientAddress.toString();
                out = clntSocket.getOutputStream();
                out.write(remoteAddr.getBytes());
                out.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }finally {
                try {
                    if (in != null) {
                        in.close();
                    }
                    if (out != null) {
                        out.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[] args) {
        server();
    }

    public static void server() {
        ServerSocket serverSocket = null;
        //简单的线程池
        ExecutorService threadPoolExecutor = Executors.newCachedThreadPool();
//          ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,50,10, TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1000));
//        threadPoolExecutor.setRejectedExecutionHandler(new AbortPolicy());

        try {
            serverSocket = new ServerSocket(8090);

            while (true) {
                Socket clntSocket = serverSocket.accept();
                //另起一个线程处理该socket连接
                threadPoolExecutor.submit(new SocketHandler(clntSocket));


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (serverSocket != null) {
                    serverSocket.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            threadPoolExecutor.shutdown();
        }
    }
}
