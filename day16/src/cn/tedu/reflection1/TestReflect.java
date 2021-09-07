package cn.tedu.reflection1;

import org.junit.Test;

/**
 * FileName��TestReflect
 * Date��2021/8/20 17:19
 */
/*�������ڲ��Է���*/
public class TestReflect {
    @Test
    public void getClazz() throws Exception {
        //��ϰ��ȡ����ֽ������
        //ʹ��Class.forName()�����쳣
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Student");
        Class<?> s2 = Student.class;
        Class<?> s3 = new Student().getClass();
        System.out.println(s1);
        //��ȡ��Ӧ�ֽ�������ȫ·����
        System.out.println(s2.getName());
        //��ȡ��Ӧ�ֽ�����������
        System.out.println(s3.getSimpleName());
        //��ȡ��Ӧ�ֽ�������Ӧ�İ�����
        System.out.println(s1.getPackage());
        //��ȡ��Ӧ�ֽ�������Ӧ�İ���
        System.out.println(s1.getPackage().getName());
    }

}
