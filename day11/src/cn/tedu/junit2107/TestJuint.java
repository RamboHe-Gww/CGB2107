package cn.tedu.junit2107;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileName：TestJuint
 * Date：2021/8/13 11:37
 */
public class TestJuint {
//    public static void main(String[] args) { }

    /*单元测试方法：java测试的最小单位,使用灵活
    语法要求：@Test + void + 没有参数 + public
    注意：jUnit是一个单元测试工具，使用前需要导包
    Add jUnit 4 library to the build path：import org.junit.Test
     */
    @Test
    public void testFor(){
        InputStream in = null;
        try {
//            in = new FileInputStream(new File("D:/Demo/1.txt"));
            in = new FileInputStream("D:/Demo/1.txt");
            int b;
            while((b=in.read())!=-1){
                System.out.print(b+" ");
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

    @Test
    public void Test(){
        System.out.println(9);
    }
}
