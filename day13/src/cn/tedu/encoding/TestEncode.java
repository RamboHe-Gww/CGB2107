package cn.tedu.encoding;

import java.io.*;

/**
 * FileName��TestEncode
 * Date��2021/8/17 15:33
 */
/*�������ڲ��Ա���ת����*/
public class TestEncode {
    public static void main(String[] args) {
        f1();
        f2();
    }

    /*����OutputStreamWriter*/
    private static void f1() {
        //���屾�����ľֲ��������ֶ���ʼ��ֵΪnull
        OutputStreamWriter out = null;
        try {
//            out = new OutputStreamWriter(new FileOutputStream("D:/Demo/1.txt"));
//            out = new OutputStreamWriter(new FileOutputStream("D:/Demo/1.txt"),"utf-8");
            //ʹ���������������
            out.write("���౦�����ɴ���");
            System.out.println("ִ�гɹ���");
        } catch (Exception e) {
            System.out.println("ִ��ʧ�ܣ�");
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*����InputStreamReader*/
    private static void f2() {
        //���屾�����ֲ��������ֶ���ʼ��ֵΪnull
        InputStreamReader in = null;
        try {
            in = new InputStreamReader(new FileInputStream("D:/Demo/1.txt"),"iso-8859-1");
            /**/
            //���󣺶�ȡ1.txt�е��������ݣ���ӡ������̨
            char[] ch = new char[8192];//���鶯̬����
            int len = in.read(ch);//�����ݶ���ch�����У����Ҷ������ݳ�����len
            System.out.println(new String(ch, 0,len));//��char[]��װ��String
            /**/
            //ͨ���������ȡ
            System.out.println(in.read());//��ӡ����
            System.out.println("��ȡ�ɹ���");
        } catch (Exception e) {
            System.out.println("��ȡʧ�ܣ�");
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
