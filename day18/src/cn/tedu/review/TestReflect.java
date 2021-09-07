package cn.tedu.review;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * FileName��TestStudent
 * Date��2021/8/24 9:12
 */
/*�������ڻع˷���API��ʹ��*/
public class TestReflect {
    /*��ϰ��ȡ�ֽ������*/
    @Test
    public void getClazz() throws Exception {
        Class<?> aClass = Class.forName("cn.tedu.review.Student");
        Class<Student> studentClass = Student.class;
        Class<?> aClass1 = new Student().getClass();

        System.out.println(aClass);
        System.out.println(studentClass.getName());
        System.out.println(studentClass.getSimpleName());
        System.out.println(studentClass.getPackage());
        System.out.println(aClass1.getPackage().getName());

    }

    /*��ȡָ�����еĹ��췽��*/
    @Test
    public void getCons() throws Exception {
        Class<?> aClass = Class.forName("cn.tedu.review.Student");
        //ͨ���ֽ�������ȡĿ����Ĺ��췽������
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor cs : constructors) {
            System.out.println(cs);
            System.out.println(cs.getName());
            System.out.println(Arrays.toString(cs.getParameterTypes()));
        }
    }

    @Test
    public void getStu() {
        Student s1 = new Student("ABC", 10, 6.66, 'D');
        Student s2 = new Student("ABC", 10, 6.66, 'D');
        Student s3 = new Student("ABC", 10, 6.66, 'D');
        Student[] stu = {s1, s2, s3};
        for (Student s : stu) {
            System.out.println(s);
            System.out.println(s.getD());
        }

    }

    /*��ȡָ����ĳ�Ա����*/
    @Test
    public void getMeth() {
        Class<?> aClass = Student.class;
        Method[] ms = aClass.getDeclaredMethods();
        for (Method m : ms) {
            System.out.println(m);
            System.out.println(m.getName());
            System.out.println(Arrays.toString(m.getParameterTypes()));
        }
    }

    @Test
    public void getFields() {
        Class<?> aClass = Student.class;
        Field[] declaredFields = aClass.getDeclaredFields();
//        Field[] fields = aClass.getFields();
        for (Field fs : declaredFields) {
            System.out.println(fs);
            System.out.println(fs.getType());
        }
    }

    /*ͨ�����䴴��Ŀ����Ķ���*/
    @Test
    public void getObject() throws Exception {
        Class<?> aClass = Student.class;
        /*��ʽ1��ͨ���޲ι��촴������*/
//        Object o1 = aClass.newInstance();
//        System.out.println(o1);

        /*����2��ͨ����ȡ����ָ���Ĺ��캯������������*/
        Constructor<?> cs = aClass.getConstructor(String.class, int.class, double.class, char.class);
        Object obj = cs.newInstance("ABC", 10, 6.66, 'D');
        System.out.println(obj);
        Student stu = (Student) obj;
        System.out.println(stu.a);
        System.out.println(stu.b);
        System.out.println(stu.c);
//        System.out.println(stu.d);
        stu.study("Ram", 100);
    }

    /*ͨ�����������ȡĿ����˽�г�Ա����*/
    @Test
    public void getPriField() throws Exception {
        Class<?> aClass = Student.class;
        Field d = aClass.getDeclaredField("d");
        System.out.println(d);
        System.out.println(d.getType().getName());

        Object obj = aClass.newInstance();
        d.setAccessible(true);
        d.set(obj, '��');
        System.out.println(d.get(obj));
    }

    /*ͨ�����������ȡ�͵���Ŀ�����˽�г�Ա����*/
    @Test
    public void getFunction() throws Exception {
        Class<?> aClass = Student.class;
        Method method = aClass.getDeclaredMethod("sleep");
        method.setAccessible(true);
//        Object obj = aClass.newInstance();
//        method.invoke(obj);
        method.invoke(aClass.newInstance());

    }
}
