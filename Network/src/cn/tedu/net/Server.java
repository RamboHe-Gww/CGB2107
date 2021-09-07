package cn.tedu.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * FileName��Server
 * Date��2021/9/7 19:55:26
 */
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(7788);//����������ָ���˿�7788���ȴ��ͻ�����������
            Socket accept = ss.accept();//���տͻ����������󣬽�������ͨ��ͨ��
            InputStream in = accept.getInputStream();//ʹ�ö�ȡ����ȡ�ͻ��˷���������
            for (int i=0;i<5;i++){
                int b =in.read();
                System.out.println(b);
            }
            OutputStream out = accept.getOutputStream();//�������ݸ��ͻ���
            out.write("world".getBytes());
            out.flush();
            // �ͷ���Դ
            ss.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
