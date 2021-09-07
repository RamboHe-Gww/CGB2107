package cn.tedu.review;

import java.io.*;

/**
 * FileName：TestIOCreate
 * Date：2021/8/17 9:05
 */
/*本类用于IO流对象的创建*/
public class TestIOCreate {
    public static void main(String[] args) throws Exception{
        /*字节输入流-InputStream*/
//        method1();
        FileInputStream in1 = new FileInputStream(new File("D:/Demo/1.txt"));
        FileInputStream in2 = new FileInputStream("D:/Demo/1.txt");
        BufferedInputStream in3 = new BufferedInputStream(new FileInputStream(new File("D:/Demo/1.txt")));
        BufferedInputStream in4 = new BufferedInputStream(new FileInputStream("D:/Demo/1.txt"));
        /*字节输出流-OutputStream*/
        OutputStream out1 = new FileOutputStream(new File("D:/Demo/1.txt"),false);//append:false/true
        OutputStream out2 = new FileOutputStream("D:/Demo/1.txt",false);
        BufferedOutputStream out3 = new BufferedOutputStream(new FileOutputStream(new File("D:/Demo/1.txt"),false));
        BufferedOutputStream out4 = new BufferedOutputStream(new FileOutputStream("D:/Demo/1.txt",false));
        /*字符输入流-Reader*/
        Reader in11 = new FileReader(new File("D:/Demo/1.txt"));
        Reader in22 = new FileReader("D:/Demo/1.txt");
        BufferedReader in33 = new BufferedReader(new FileReader(new File("D:/Demo/1.txt")));
        BufferedReader in44 = new BufferedReader(new FileReader("D:/Demo/1.txt"));
        /*字符输出流-Writer*/
        Writer out11 = new FileWriter(new File("D:/Demo/1.txt"),true);
        Writer out22 = new FileWriter("D:/Demo/1.txt",true);
        BufferedWriter out33 = new BufferedWriter(new FileWriter(new File("D:/Demo/1.txt"),true));
        BufferedWriter out44 = new BufferedWriter(new FileWriter("D:/Demo/1.txt",true));

    }



    private static void method1() {
        InputStream in = null;
        try {
            in = new FileInputStream(new File("D:/Demo/1.txt"));
            in = new FileInputStream("D:/Demo/1.txt");
            int b;
            while((b=in.read())!=-1){
                System.out.println(b+" ");
            }
        } catch (Exception e) {
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
