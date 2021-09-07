package cn.tedu.encoding;

import java.io.*;

/**
 * FileName：TestEncode
 * Date：2021/8/17 15:33
 */
/*本类用于测试编码转换流*/
public class TestEncode {
    public static void main(String[] args) {
        f1();
        f2();
    }

    /*测试OutputStreamWriter*/
    private static void f1() {
        //定义本方法的局部变量，手动初始化值为null
        OutputStreamWriter out = null;
        try {
//            out = new OutputStreamWriter(new FileOutputStream("D:/Demo/1.txt"));
//            out = new OutputStreamWriter(new FileOutputStream("D:/Demo/1.txt"),"utf-8");
            //使用流对象输出数据
            out.write("海绵宝宝与派大星");
            System.out.println("执行成功！");
        } catch (Exception e) {
            System.out.println("执行失败！");
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

    /*测试InputStreamReader*/
    private static void f2() {
        //定义本方法局部变量，手动初始化值为null
        InputStreamReader in = null;
        try {
            in = new InputStreamReader(new FileInputStream("D:/Demo/1.txt"),"iso-8859-1");
            /**/
            //需求：读取1.txt中的中文内容，打印到控制台
            char[] ch = new char[8192];//数组动态创建
            int len = in.read(ch);//将数据读到ch数组中，并且读到数据长度是len
            System.out.println(new String(ch, 0,len));//把char[]封装成String
            /**/
            //通过流对象读取
            System.out.println(in.read());//打印编码
            System.out.println("读取成功！");
        } catch (Exception e) {
            System.out.println("读取失败！");
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
