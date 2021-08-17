package cn.tedu.file;

import java.io.*;

/**
 * FileName：TestOut
 * Date：2021/8/16 16:26
 */
/*本节用于练习字节输出流*/
public class TestOut {
    public static void main(String[] args) {
//        method1();//用于完成普通字节输出流
        method2();//用于完成高效字节输出流
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
            /*FOS的构造函数有一个参数append，默认值为false
             * 表示覆盖，如果设置为true，每次输出内容会追加
             * 在原来文件内容之后，不再覆盖*/
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
