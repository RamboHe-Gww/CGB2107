package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * FileName：Server
 * Date：2021/9/7 19:55:26
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7788);//启动服务器指定端口7788，等待客户端请求连接
            Socket accept = ss.accept();//接收客户端连接请求，建立数据通信通道
            InputStream in = accept.getInputStream();//使用读取流读取客户端发来的数据
            for (int i=0;i<5;i++){
                int b =in.read();
                System.out.println(b);
            }
            OutputStream out = accept.getOutputStream();//返回数据给客户端
            out.write("world".getBytes());
            out.flush();
            // 释放资源
            ss.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
