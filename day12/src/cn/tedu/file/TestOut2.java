package cn.tedu.file;

import java.io.*;

/**
 * FileName：TestOut2
 * Date：2021/8/16 17:21
 */
/*本类用于练习字符输出流*/
public class TestOut2 {
    public static void main(String[] args) {
//        method1();//普通字符输出流
        method2();//高效字符输出流
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
            out = new FileWriter("D:/Demo/1.txt", true);//append：true追加，false不追加
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
