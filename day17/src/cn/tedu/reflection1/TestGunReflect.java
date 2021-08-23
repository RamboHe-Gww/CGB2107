package cn.tedu.reflection1;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * FileName��TestGunReflect
 * Date��2021/8/23 16:13
 */
/*���������������������*/
/*1������˽�����ԣ���ȡ��Ӧ���ֵ����Զ��� + ����Ӧ�����ֵ���������ֵ*/
public class TestGunReflect {
    @Test
    public void getFields() throws Exception {
//        Class<?> g1 = Class.forName("cn.tedu.reflection1.Gun");
        Class<?> g2 = Gun.class;
//        Class<?> g3 = new Gun().getClass();

        //��ȡGun���е�˽������name
        Field Field_name = g2.getDeclaredField("name");
        //��ȡ˽������name������
        System.out.println(Field_name.getType());//class java.lang.String
        System.out.println(Field_name.getType().getName());//java.lang.String

        /*����������ֵ����Ҫ����Ԫ�أ�
         * ���ĸ�����1�����ĸ����ԡ�2������ʲôֵ��3��*/
        Object obj = g2.newInstance();
        /*��������setAccessible(true)*/
        Field_name.setAccessible(true);
        /*set(m,n) -- m��Ҫ���ĸ�������������ֵ����ֵ
         * n���������������ʲô ����*/
        Field_name.set(obj, "Ram");
        //��ȡobj�����name����ֵ
        System.out.println(Field_name.get(obj));

    }

    /*��ϰ��ȡ�����˽�з���*/
    @Test
    public void getFun() throws Exception {
        Class<?> g1 = Gun.class;
        /*getDeclaredMethod(m,x,y,z...)
         * m����Ҫ��ȡ�ķ�����
         * x,y,z...�ɱ������...��ʾ����Ĳ���������������Ҫ��ȡ��Ŀ�귽���Ĳ����������ı�
         * ע�⣺�˴�����Ĳ����Ƿ����Ĳ��������ֽ�����󣬲���ֱ�Ӵ�����*/
        Method method = g1.getDeclaredMethod("save", int.class, String.class);
        Method method1 = g1.getDeclaredMethod("update");
        Object obj = g1.newInstance();
        Gun gun = new Gun();
        method.setAccessible(true);
        method1.setAccessible(true);
        /*invoke(o,x,y,z...)��������ͨ������ִ�л�ȡ���ķ���
         * o����ʾ��ʱִ�е�ʱ�ĸ�������������
         * x,y,z...����ʾ��ʱҪִ���������ʱ��Ҫ����Ĳ��������������ʱsave(int, String)*/
        method.invoke(obj, 100, "ABC");
        method1.invoke(obj);
        method.invoke(gun, "Ram");

    }
}
