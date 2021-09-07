package cn.tedu.file;

import java.io.*;
import java.util.Scanner;

import cn.tedu.file.GetClose.*;

/**
 * FileName：TestCopyFile
 * Date：2021/8/17 10:05
 */
/*本类用于练习文件复制综合案例*/
public class TestCopyFile {
    public static void main(String[] args) {
        //提示并接收用户输入的源文件路径和目标位置
        System.out.println("请输入源文件路径：");
        String f = new Scanner(System.in).nextLine();
        System.out.println("请输入目标路径：");
        String t = new Scanner(System.in).nextLine();
        //调用方法完成文件的复制
        ZFCopy(f, t);//字符流完成复制案例
//        ZJCopy(f,t);//字节流完成复制案例
    }

    private static void ZFCopy(String f, String t) {
        Reader in = null;
        Writer out = null;
        try {
            //高效/缓冲字符输入流与输出流对象
            in = new BufferedReader(new FileReader(f));
            out = new BufferedWriter(new FileWriter(t));
            //定义变量记录读到的数据
            int b;
            while ((b = in.read()) != -1) {
                /*将本次循环从源文件读到的内容写出到目标文件*/
                out.write(b);
            }
            System.out.println("文件复制成功！");
        } catch (Exception e) {
            System.out.println("文件复制失败！");
            e.printStackTrace();
        } finally {
            GetClose.close(in,out);
            /*关流是有顺序的，如果有多个流，最后创建的流
             * 最先关闭，多条关流语句需要各自try-catch*/
        }
    }

    private static void ZJCopy(String f, String t) {
        InputStream in = null;
        OutputStream out = null;
        try {
            in = new BufferedInputStream(new FileInputStream(f));
            out = new BufferedOutputStream(new FileOutputStream(t));
            int b;
            while((b= in.read())!=-1){
                out.write(b);
            }
            System.out.println("文件复制成功！");
        } catch (Exception e) {
            System.out.println("文件复制失败！");
            e.printStackTrace();
        } finally {
            try {
                assert out != null;
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
