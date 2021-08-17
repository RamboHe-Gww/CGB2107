package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * FileName：TestFile
 * Date：2021/8/16 9:38
 */
/*本类用于测试文件类File*/
public class TestFile {
    public static void main(String[] args) throws IOException {
        /*1》构造函数的参数类型是String，代表的是
        要操作的路径pathname，这个路径可以是文件路径，
        也可以是文件夹路径，还可以是不存在的路径*/
        /*2》反斜杠\在代码中有特殊的意义，表示转义符号，
        所以想要表示路径中的\，需要写两个才能表示这是一个单纯的\ */
        /*3》注意：需要手动在D:\Demo目录下创建1.txt，并添加内容*/
        /*4》注意：创建1.txt时，需要设置系统显式文件后缀名
        * 如果没有设置显式后缀名，则显示的单纯是文件名*/
        //创建File类对象
        File file = new File("D:\\Demo\\1.txt");

        //常用方法
        //文件与文件夹属性
        System.out.println(file.length());//10，获取指定文件字节量
        System.out.println(file.exists());//true，判断文件是否存在
        System.out.println(file.isFile());//true，判断指定路径是否为文件
        System.out.println(file.isDirectory());//false，判断指定路径是否为文件夹
        System.out.println(file.getName());//1.txt，获取文件名
        System.out.println(file.getParent());//D:\\Demo，上级路径
        System.out.println(file.getAbsolutePath());//D:\\Demo\\1.txt，绝对路径

        //创建与删除
        file = new File("D:\\Demo\\2.txt");
        /*如果指定创建文件的路径不存在，会报错：java.io.IOException
        * 系统找不到指定路径，就会发生异常，所以调用时需要抛出异常*/
        System.out.println(file.createNewFile());

        //在D:\Demo目录下创建m文件夹
        file = new File("D:\\Demo\\m");
        System.out.println(file.mkdir());

        //在Demo中创建多层文件夹a\b\c
        file = new File("D:\\Demo\\a\\b\\c");
        System.out.println(file.mkdirs());

        /*delete()只能用于删除文件和空文件夹*/
        System.out.println(file.delete());//c被删除
        file = new File("D:\\Demo\\a");
        System.out.println(file.delete());//false，因为a里还有b

        file = new File("D:\\Demo\\2.txt");
        System.out.println(file.delete());//true

        //文件列表测试
        file = new File("D:\\Demo");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));//[1.txt, a, m]，指定路径列举

        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(fs));
//        assert fs != null;
        System.out.println(fs[0].length());
    }
}
