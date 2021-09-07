package cn.tedu.net;

import java.io.*;

/**
 * FileName��TestIO
 * Date��2021/9/7 20:24:57
 */
public class TestIO {
    public static void main(String[] args) {
//        method1();
        method2();
    }

    private static void method2() {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            in = new BufferedReader(new FileReader("D:/TestDemo/demo.txt"));
            String line;
            while ((line=in.readLine())!=null) {
                System.out.println(line);
            }
            out = new PrintWriter(new FileWriter("D:/TestDemo/demo.txt"));
            out.println("Java");
            out.println("Python");
            out.println("Django");
            out.flush();//ˢ�£���ֹ����û����ɹ�
            System.out.println("д��ɹ���");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                assert out != null;
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("D:/TestDemo/demo.txt"));
            String line = in.readLine();
            String line1 = in.readLine();
            String line2 = in.readLine();
            /*
            ԭ��readLine()��ȡ����ʱ���ȡ�����ǣ����з�
            \r\n���������з�����������ۣ�readLine()ֻ���Զ�ȡ
            һ�������ݣ��������������Ҫ��ε���
             * */
            System.out.println(line);
            System.out.println(line1);
            System.out.println(line2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
