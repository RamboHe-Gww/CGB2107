package cn.tedu.file;

import java.io.*;

/**
 * FileName��TestOut
 * Date��2021/8/16 16:26
 */
/*����������ϰ�ֽ������*/
public class TestOut {
    public static void main(String[] args) {
//        method1();//���������ͨ�ֽ������
        method2();//������ɸ�Ч�ֽ������
    }

    private static void method2() {
        OutputStream out = null;
        try {
//            out = new BufferedOutputStream(new FileOutputStream(new File("D:/Demo/1.txt"), true));
            out = new BufferedOutputStream(new FileOutputStream("D:/Demo/1.txt", true));
            out.write(98);
            out.write(98);
            out.write(98);
        } catch (Exception e) {
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

    private static void method1() {
        OutputStream out = null;
        try {
//            out = new FileOutputStream(new File("D:/Demo/1.txt"));
            /*FOS�Ĺ��캯����һ������append��Ĭ��ֵΪfalse
             * ��ʾ���ǣ��������Ϊtrue��ÿ��������ݻ�׷��
             * ��ԭ���ļ�����֮�󣬲��ٸ���*/
            out = new FileOutputStream("D:/Demo/1.txt", true);
            out.write(97);
            out.write(97);
            out.write(97);
        } catch (Exception e) {
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

}
