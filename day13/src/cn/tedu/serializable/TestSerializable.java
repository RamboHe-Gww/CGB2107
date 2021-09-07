package cn.tedu.serializable;

import java.io.*;

/**
 * FileName��TestSerializable
 * Date��2021/8/17 11:54
 */
/*���л���ָ�ѳ����е�Java�������ñ����ڴ����У������ļ�
 * �൱����д���Ĺ��̣�������out������ObjectOutputStream�����л���
 * �����л���ָ���Ѿ����л����ļ��б�������ݣ���ȡ/�ָ���Java����Ĺ��̣�
 * �൱���Ƕ�ȡ�Ĺ��̣�������in������ObjectInputStream�������л���*/
public class TestSerializable {
    public static void main(String[] args) {
//        method1();//������л�����
        method2();//��ɷ����л�����
    }

    //���л�����
    private static void method1() {
        //�����ֲ��������ֶ���ʼ��ֵΪnull
        ObjectOutputStream out = null;
        //try-catch�ṹ����IO�����쳣
        try {
            //�����������л���������
            out = new ObjectOutputStream(new FileOutputStream("D:/Demo/1.txt"));
            Student obj = new Student("����", 20, "��������", '��');
            //ʹ��OOS�����������
            out.writeObject(obj);
            System.out.println("���л��ɹ���");
        } catch (Exception e) {
            System.out.println("���л�ʧ�ܣ�");
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

    //�����л�����
    private static void method2() {
        ObjectInputStream in = null;
        try {
            //�������ڷ����л��Ķ���
            in = new ObjectInputStream(new FileInputStream("D:/Demo/1.txt"));
            //ͨ��OIS�����л�����������ȡ�ָ�����
//            Object o = in.readObject();//��̬
//            System.out.println(o);
            System.out.println(in.readObject());
            System.out.println("�����л��ɹ���");
        } catch (Exception e) {
            System.out.println("�����л�ʧ�ܣ�");
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
