package cn.tedu.reflection1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * FileName��TestStuReflect
 * Date��2021/8/23 10:36
 */
/*�����������Է���*/
public class TestStuReflect {
    /*������������ϰ��ȡ�ֽ������*/
    @Test
    public void getClazz() throws Exception {
        /*��������в���ǰ�ᶼ�ǻ�ȡ�ֽ������
         * 1��Class.forName("���ȫ·��");
         * 2������.class
         * 3������.getClass();
         * Class<?>�е�"?"�Ƿ���Լ���е�ͨ���*/
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        Class<?> s2 = Stu.class;
        Class<?> s3 = new Stu().getClass();
        System.out.println(s1);
        System.out.println(s2.getName());
        System.out.println(s3.getSimpleName());
        System.out.println(s3.getPackage());
        System.out.println(s3.getPackage().getName());
//        class cn.tedu.reflection1.Stu
//        cn.tedu.reflection1.Stu
//        Stu
//        package cn.tedu.reflection1
//        cn.tedu.reflection1
    }

    /*������������ϰ��ȡָ����Stu���췽��*/
    @Test
    public void getConstruct() throws Exception {
        //��ȡ�ֽ������
//        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        Class<?> s2 = Stu.class;
//        Class<?> s3 = new Stu().getClass();
        //��ȡ���췽��
        /*���������ڴ��ֽ�������л�ȡStu��Ķ��
         * ���캯������������������ķ���ֵ������һ��
         * ���飬�����д��ŵ�ʱ���Stu��Ĺ��캯��
         * ����*/
        Constructor<?>[] cs = s2.getConstructors();
        for (Constructor<?> s : cs) {
//            System.out.println(s);
            System.out.println(s.getName());//��ȡ���췽���ķ�����
            Class<?>[] pt = s.getParameterTypes();
            System.out.println(Arrays.toString(pt));
        }
//        System.out.println(Arrays.toString(cs));
    }

    @Test
    public void getStu() {
        Stu s1 = new Stu("����", 18);
        Stu s2 = new Stu("����", 18);
        Stu s3 = new Stu("����", 18);
        Stu[] stu = {s1, s2, s3};
        for (Stu s : stu) {
//            System.out.println(s);//toString��д��ӡ����ľ�������ֵ
            System.out.println(s.getName());
        }
    }

    /*������������ϰ��ȡָ����Stu�ĳ�Ա����*/
    @Test
    public void getFunction() throws Exception {
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
//        Class<?> s2 = Stu.class;
//        Class<?> s3 = new Stu().getClass();

        //ͨ���ֽ�������ȡStu��ĳ�Ա����
        Method[] mt = s1.getMethods();//����ֵ����mt��ŵ�ʱStu��ķ�������
        for (Method s : mt) {
//            System.out.println(s);
            System.out.println(s.getName());//sΪ��������ʹ��s��ȡ������
            Class<?>[] ms = s.getParameterTypes();
            System.out.println(Arrays.toString(ms));
        }
//        System.out.println(Arrays.toString(mt));
    }

    @Test
    public void getFields() throws Exception {
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        Field[] fd = s1.getFields();
        for (Field s : fd) {
            /*��Ա�������η�������public���εģ����ܷ�
            ��õ���Ĭ�����η�����private���䲻��*/
            System.out.println(s.getName());//��ȡ���Ե�����
            System.out.println(s.getType().getName());//��ȡ���Ե�������
        }
//        System.out.println(fd);//��ӡ��ֵַ
//        System.out.println(Arrays.toString(fd));
    }

    /*������������ϰͨ�����䴴��ָ����Stu�Ķ���*/
    /*��ʽ1��ͨ���ֽ������s1����newInstance()������Ŀ������޲ι�������������
     *��ʽ2��ͨ���ֽ���������s1getConstructor()����ȡ�����캯������cs����ͨ�����캯������cs����newInstance()�������������ĸ������Ͷ���*/
    @Test
    public void getObject() throws Exception {
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        /*ͨ��newInstance()������ʱStu���е��޲�
         * ���촴���������Դ����Ķ����޲�������Ҫ������
         * ����������Ҫ��ȡָ���Ĺ��캯������*/
//        Object o1 = s1.newInstance();
//        System.out.println(o1);
        /*getConstructor()��ȡָ�������б�Ĺ��캯������
         * ע�⣺��������Ĳ���Ŀ������Stu�ж�Ӧ���ι���Ĳ�������*/
        Constructor<?> cs = s1.getConstructor(String.class, int.class);
        Object o2 = cs.newInstance("Rambo", 24);
        System.out.println(o2);
        /*ǿת��֮ǰת�ɸ������͵��������
         * ���������Ҫʹ���������еĹ��ܣ���Ҫǿת����ת
         * ���������ͣ�*/
        Stu s = (Stu) o2;//o2ǿתΪStu��
        System.out.println(s.name);
        System.out.println(s.age);
        s.eat();

//        Stu o3 = (Stu) cs.newInstance(String.class, int.class);//ֱ��ʹ��Stu�������գ�ͬʱ����ǿת

//        System.out.println(cs.newInstance("Ram",24));

    }

}
