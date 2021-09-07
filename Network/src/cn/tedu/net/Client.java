package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * FileName��Client
 * Date��2021/9/7 20:05:08
 */
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 7788);//���ӷ�������ָ��IP�Ͷ˿�Port
            OutputStream out = socket.getOutputStream();
            out.write("hello".getBytes());//������������hello�ַ�������ת���byte[]��ʽ���
            out.flush();
            InputStream in = socket.getInputStream();//��ȡ�ӷ��������ص�����
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
