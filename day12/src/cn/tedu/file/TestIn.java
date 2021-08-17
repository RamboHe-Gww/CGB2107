package cn.tedu.file;

import java.io.*;

/**
 * FileName：TestIn
 * Date：2021/8/16 11:19
 */
/*本类用于练习字节输入流*/
public class TestIn {
    public static void main(String[] args) {
        method1();//普通字节流读取
        method2();//高效字节流读取
    }

    //高效字节流
    private static void method2() {
        InputStream in = null;
        long t1 = System.currentTimeMillis();
        try {
//            InputStream in = new BufferedInputStream(new FileInputStream(new File("D:/Demo/1.txt")));
            //创建流对象
            in = new BufferedInputStream(new FileInputStream("D:/Demo/1.txt"));
            //使用流对象
            int b;
            while((b = in.read()) != -1){
                System.out.print(b+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //关闭流资源
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

    //普通字节流
    private static void method1() {
        //创建字节输入流对象用于读取
        long t1 = System.currentTimeMillis();
        InputStream in = null;
        try {
            //创建字节输入流对象
//            InputStream in = new InputStream();//报错，因为InputStream类为抽象类不可实例化
//            InputStream in = new FileInputStream(new File("D:/Demo/1.txt"));
            in = new FileInputStream("D:/Demo/1.txt");
//            InputStream in2 = new BufferedInputStream(in);
            //使用字节输入流对象读取
            /*read()每次调用都会读取一个数据字节，如果读到了数据的末尾，则返回-1*/
//            System.out.println(in.read());//效率低
            //循环读取文件内容，直至结束
            int b;
            while((b = in.read()) != -1){//只要没有读到文件末尾，返回值不是-1就继续循环
                System.out.print(b+" ");
            }//int b 的作用是存储判断的字节，保证判断的字节就是打印的字节

            //未定义int b ，会丢失数据
//            while(in.read() != -1){
//                System.out.print(in.read()+" ");
//            }

        } catch (Exception e) {
            e.printStackTrace();//堆栈跟踪
        }finally {
            /*try-catch结构第三部分：finally{ }
            * 无论是否捕获到异常，一定会被执行到的代码块
            * 所以经常用来关闭流资源*/
            //关闭流资源
            try {
                assert in != null;
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
    }

}
