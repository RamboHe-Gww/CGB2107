package cn.tedu.review;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * FileName：TestStudent
 * Date：2021/8/24 9:12
 */
/*本类用于回顾反射API的使用*/
public class TestReflect {
    /*练习获取字节码对象*/
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

    /*获取指定类中的构造方法*/
    @Test
    public void getCons() throws Exception {
        Class<?> aClass = Class.forName("cn.tedu.review.Student");
        //通过字节码对象获取目标类的构造方法对象
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

    /*获取指定类的成员方法*/
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

    /*通过反射创建目标类的对象*/
    @Test
    public void getObject() throws Exception {
        Class<?> aClass = Student.class;
        /*方式1：通过无参构造创建对象*/
//        Object o1 = aClass.newInstance();
//        System.out.println(o1);

        /*方法2：通过获取到的指定的构造函数来创建对象*/
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

    /*通过暴力反射获取目标类私有成员变量*/
    @Test
    public void getPriField() throws Exception {
        Class<?> aClass = Student.class;
        Field d = aClass.getDeclaredField("d");
        System.out.println(d);
        System.out.println(d.getType().getName());

        Object obj = aClass.newInstance();
        d.setAccessible(true);
        d.set(obj, '男');
        System.out.println(d.get(obj));
    }

    /*通过暴力反射获取和调用目标类的私有成员方法*/
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
