package cn.tedu.file;

import java.io.*;

/**
 * FileName��TestOut2
 * Date��2021/8/16 17:21
 */
/*����������ϰ�ַ������*/
public class TestOut2 {
    public static void main(String[] args) {
//        method1();//��ͨ�ַ������
        method2();//��Ч�ַ������
    }

    private static void method2() {
        Writer out = null;
        try {
//            out = new BufferedWriter(new FileWriter(new File("D:/Demo/1.txt"), true));
            out = new BufferedWriter(new FileWriter("D:/Demo/1.txt", true));
            out.write(101);
            out.write(101);
            out.write(101);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void method1() {
        Writer out = null;
        try {
//            out = new FileWriter(new File("D:/Demo/1.txt"),true);
            out = new FileWriter("D:/Demo/1.txt", true);//append��true׷�ӣ�false��׷��
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
            out.write(100);
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
