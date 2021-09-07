package cn.tedu.file;

import java.io.*;

/**
 * FileName：TestIn2
 * Date：2021/8/16 14:30
 */
/*本类用于练习字符输入流*/
public class TestIn2 {
    public static void main(String[] args) {
        String[] t = new String[]{"123"};
        String t1 = "123";
        t1.charAt(0);
        t1.format(t1, "123");


//        method1();//用于普通字符流读取
        method2();//用于高效字符流读取
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
            e.printStackTrace();//堆栈跟踪，打印错误信息
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
            //创建流对象
//            Reader in = new Reader();//Reader类为抽象类，不可直接实例化对象
//            Reader in = new FileReader(new File("D:/Demo/1.txt"));
            in1 = new FileReader("D:/Demo/1.txt");
            //使用流对象
            int b;
            while ((b = in1.read()) != -1) {
                System.out.print(b + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //关闭流资源
            try {
                assert in1 != null;
                in1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
