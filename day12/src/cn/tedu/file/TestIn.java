package cn.tedu.file;

import java.io.*;

/**
 * FileName��TestIn
 * Date��2021/8/16 11:19
 */
/*����������ϰ�ֽ�������*/
public class TestIn {
    public static void main(String[] args) {
        method1();//��ͨ�ֽ�����ȡ
        method2();//��Ч�ֽ�����ȡ
    }

    //��Ч�ֽ���
    private static void method2() {
        InputStream in = null;
        long t1 = System.currentTimeMillis();
        try {
//            InputStream in = new BufferedInputStream(new FileInputStream(new File("D:/Demo/1.txt")));
            //����������
            in = new BufferedInputStream(new FileInputStream("D:/Demo/1.txt"));
            //ʹ��������
            int b;
            while((b = in.read()) != -1){
                System.out.print(b+" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //�ر�����Դ
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

    //��ͨ�ֽ���
    private static void method1() {
        //�����ֽ��������������ڶ�ȡ
        long t1 = System.currentTimeMillis();
        InputStream in = null;
        try {
            //�����ֽ�����������
//            InputStream in = new InputStream();//������ΪInputStream��Ϊ�����಻��ʵ����
//            InputStream in = new FileInputStream(new File("D:/Demo/1.txt"));
            in = new FileInputStream("D:/Demo/1.txt");
//            InputStream in2 = new BufferedInputStream(in);
            //ʹ���ֽ������������ȡ
            /*read()ÿ�ε��ö����ȡһ�������ֽڣ�������������ݵ�ĩβ���򷵻�-1*/
//            System.out.println(in.read());//Ч�ʵ�
            //ѭ����ȡ�ļ����ݣ�ֱ������
            int b;
            while((b = in.read()) != -1){//ֻҪû�ж����ļ�ĩβ������ֵ����-1�ͼ���ѭ��
                System.out.print(b+" ");
            }//int b �������Ǵ洢�жϵ��ֽڣ���֤�жϵ��ֽھ��Ǵ�ӡ���ֽ�

            //δ����int b ���ᶪʧ����
//            while(in.read() != -1){
//                System.out.print(in.read()+" ");
//            }

        } catch (Exception e) {
            e.printStackTrace();//��ջ����
        }finally {
            /*try-catch�ṹ�������֣�finally{ }
            * �����Ƿ񲶻��쳣��һ���ᱻִ�е��Ĵ����
            * ���Ծ��������ر�����Դ*/
            //�ر�����Դ
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
