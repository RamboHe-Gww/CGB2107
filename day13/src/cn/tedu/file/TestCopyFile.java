package cn.tedu.file;

import java.io.*;
import java.util.Scanner;

import cn.tedu.file.GetClose.*;

/**
 * FileName��TestCopyFile
 * Date��2021/8/17 10:05
 */
/*����������ϰ�ļ������ۺϰ���*/
public class TestCopyFile {
    public static void main(String[] args) {
        //��ʾ�������û������Դ�ļ�·����Ŀ��λ��
        System.out.println("������Դ�ļ�·����");
        String f = new Scanner(System.in).nextLine();
        System.out.println("������Ŀ��·����");
        String t = new Scanner(System.in).nextLine();
        //���÷�������ļ��ĸ���
        ZFCopy(f, t);//�ַ�����ɸ��ư���
//        ZJCopy(f,t);//�ֽ�����ɸ��ư���
    }

    private static void ZFCopy(String f, String t) {
        Reader in = null;
        Writer out = null;
        try {
            //��Ч/�����ַ������������������
            in = new BufferedReader(new FileReader(f));
            out = new BufferedWriter(new FileWriter(t));
            //���������¼����������
            int b;
            while ((b = in.read()) != -1) {
                /*������ѭ����Դ�ļ�����������д����Ŀ���ļ�*/
                out.write(b);
            }
            System.out.println("�ļ����Ƴɹ���");
        } catch (Exception e) {
            System.out.println("�ļ�����ʧ�ܣ�");
            e.printStackTrace();
        } finally {
            GetClose.close(in,out);
            /*��������˳��ģ�����ж��������󴴽�����
             * ���ȹرգ��������������Ҫ����try-catch*/
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
            System.out.println("�ļ����Ƴɹ���");
        } catch (Exception e) {
            System.out.println("�ļ�����ʧ�ܣ�");
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
