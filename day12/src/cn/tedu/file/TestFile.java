package cn.tedu.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * FileName��TestFile
 * Date��2021/8/16 9:38
 */
/*�������ڲ����ļ���File*/
public class TestFile {
    public static void main(String[] args) throws IOException {
        /*1�����캯���Ĳ���������String���������
        Ҫ������·��pathname�����·���������ļ�·����
        Ҳ�������ļ���·�����������ǲ����ڵ�·��*/
        /*2����б��\�ڴ���������������壬��ʾת����ţ�
        ������Ҫ��ʾ·���е�\����Ҫд�������ܱ�ʾ����һ��������\ */
        /*3��ע�⣺��Ҫ�ֶ���D:\DemoĿ¼�´���1.txt�����������*/
        /*4��ע�⣺����1.txtʱ����Ҫ����ϵͳ��ʽ�ļ���׺��
        * ���û��������ʽ��׺��������ʾ�ĵ������ļ���*/
        //����File�����
        File file = new File("D:\\Demo\\1.txt");

        //���÷���
        //�ļ����ļ�������
        System.out.println(file.length());//10����ȡָ���ļ��ֽ���
        System.out.println(file.exists());//true���ж��ļ��Ƿ����
        System.out.println(file.isFile());//true���ж�ָ��·���Ƿ�Ϊ�ļ�
        System.out.println(file.isDirectory());//false���ж�ָ��·���Ƿ�Ϊ�ļ���
        System.out.println(file.getName());//1.txt����ȡ�ļ���
        System.out.println(file.getParent());//D:\\Demo���ϼ�·��
        System.out.println(file.getAbsolutePath());//D:\\Demo\\1.txt������·��

        //������ɾ��
        file = new File("D:\\Demo\\2.txt");
        /*���ָ�������ļ���·�������ڣ��ᱨ��java.io.IOException
        * ϵͳ�Ҳ���ָ��·�����ͻᷢ���쳣�����Ե���ʱ��Ҫ�׳��쳣*/
        System.out.println(file.createNewFile());

        //��D:\DemoĿ¼�´���m�ļ���
        file = new File("D:\\Demo\\m");
        System.out.println(file.mkdir());

        //��Demo�д�������ļ���a\b\c
        file = new File("D:\\Demo\\a\\b\\c");
        System.out.println(file.mkdirs());

        /*delete()ֻ������ɾ���ļ��Ϳ��ļ���*/
        System.out.println(file.delete());//c��ɾ��
        file = new File("D:\\Demo\\a");
        System.out.println(file.delete());//false����Ϊa�ﻹ��b

        file = new File("D:\\Demo\\2.txt");
        System.out.println(file.delete());//true

        //�ļ��б����
        file = new File("D:\\Demo");
        String[] list = file.list();
        System.out.println(Arrays.toString(list));//[1.txt, a, m]��ָ��·���о�

        File[] fs = file.listFiles();
        System.out.println(Arrays.toString(fs));
//        assert fs != null;
        System.out.println(fs[0].length());
    }
}
