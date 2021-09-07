package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * FileName：Client
 * Date：2021/9/7 20:05:08
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7788);//连接服务器，指定IP和端口Port
            OutputStream out = socket.getOutputStream();
            out.write("hello".getBytes());//给服务器发送hello字符串，且转变成byte[]形式输出
            out.flush();
            InputStream in = socket.getInputStream();//读取从服务器返回的数据
            for (int i=0;i<5;i++){
                char c = (char) in.read();
                System.out.print(c);
            }

//            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
