package cn.tedu.file;

import java.io.*;

/**
 * FileName��TestIn2
 * Date��2021/8/16 14:30
 */
/*����������ϰ�ַ�������*/
public class TestIn2 {
    public static void main(String[] args) {
        String[] t = new String[]{"123"};
        String t1 = "123";
        t1.charAt(0);
        t1.format(t1, "123");


//        method1();//������ͨ�ַ�����ȡ
        method2();//���ڸ�Ч�ַ�����ȡ
    }

    private static void method2() {
        Reader in = null;
        try {
//            in = new BufferedReader(new FileReader(new File("D:/Demo/1.txt")));
            in = new BufferedReader(new FileReader("D:/Demo/1.txt"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("D:/Demo/1.txt"));
            BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(new File("D:/Demo/1.txt")));
            int b;
            while ((b = in.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();//��ջ���٣���ӡ������Ϣ
        } finally {
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        Reader in1 = null;
        try {
            //����������
//            Reader in = new Reader();//Reader��Ϊ�����࣬����ֱ��ʵ��������
//            Reader in = new FileReader(new File("D:/Demo/1.txt"));
            in1 = new FileReader("D:/Demo/1.txt");
            //ʹ��������
            int b;
            while ((b = in1.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //�ر�����Դ
            try {
                assert in1 != null;
                in1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
