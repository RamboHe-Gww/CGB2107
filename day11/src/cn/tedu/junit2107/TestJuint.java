package cn.tedu.junit2107;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileName��TestJuint
 * Date��2021/8/13 11:37
 */
public class TestJuint {
//    public static void main(String[] args) { }

    /*��Ԫ���Է�����java���Ե���С��λ,ʹ�����
    �﷨Ҫ��@Test + void + û�в��� + public
    ע�⣺jUnit��һ����Ԫ���Թ��ߣ�ʹ��ǰ��Ҫ����
    Add jUnit 4 library to the build path��import org.junit.Test
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
