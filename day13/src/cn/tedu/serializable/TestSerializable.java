package cn.tedu.serializable;

import java.io.*;

/**
 * FileName：TestSerializable
 * Date：2021/8/17 11:54
 */
/*序列化：指把程序中的Java对象永久保存在磁盘中，比如文件
 * 相当于是写出的过程，方向是out，流：ObjectOutputStream，序列化流
 * 反序列化：指把已经序列化在文件中保存的数据，读取/恢复成Java对象的过程，
 * 相当于是读取的过程，方向是in，流：ObjectInputStream，反序列化流*/
public class TestSerializable {
    public static void main(String[] args) {
//        method1();//完成序列化功能
        method2();//完成反序列化功能
    }

    //序列化方法
    private static void method1() {
        //声明局部变量，手动初始化值为null
        ObjectOutputStream out = null;
        //try-catch结构捕获IO操作异常
        try {
            //创建用于序列化的流对象
            out = new ObjectOutputStream(new FileOutputStream("D:/Demo/1.txt"));
            Student obj = new Student("张三", 20, "北京朝阳", '男');
            //使用OOS流将对象输出
            out.writeObject(obj);
            System.out.println("序列化成功！");
        } catch (Exception e) {
            System.out.println("序列化失败！");
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

    //反序列化方法
    private static void method2() {
        ObjectInputStream in = null;
        try {
            //创建用于反序列化的对象
            in = new ObjectInputStream(new FileInputStream("D:/Demo/1.txt"));
            //通过OIS反序列化流对象来读取恢复对象
//            Object o = in.readObject();//多态
//            System.out.println(o);
            System.out.println(in.readObject());
            System.out.println("反序列化成功！");
        } catch (Exception e) {
            System.out.println("反序列化失败！");
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
