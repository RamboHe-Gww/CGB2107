package cn.tedu.reflection1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * FileName£ºReflectDemo
 * Date£º2021/8/23 14:43
 */
public class ReflectDemo {

    @Test
    public void getConstruct() {
        Class<?> s1 = null;
        try {
            s1 = Class.forName("cn.tedu.reflection1.Stu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert s1 != null;
        Constructor<?>[] cs = s1.getConstructors();
        for (Constructor<?> s : cs) {
//            System.out.println(s);
            System.out.println(s.getName());
            Class<?>[] ss = s.getParameterTypes();
            System.out.println(Arrays.toString(ss));
        }
    }

    @Test
    public void getMethod() {
        Class<?> s1 = Stu.class;
        Method[] md = s1.getMethods();
        for (Method s : md) {
            System.out.println(s.getName());
            Class<?>[] ss = s.getParameterTypes();
            System.out.println(Arrays.toString(ss));
        }
    }

    @Test
    public void getFiled() throws Exception {
//        Class<?> s1 = new Stu().getClass();
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        Field[] ss = s1.getFields();
        for (Field fs : ss) {
            System.out.println(fs.getName());
            System.out.println(fs.getType().getName());
        }
    }

    @Test
    public void getObject() throws Exception{
        Class<?> s = Class.forName("cn.tedu.reflection1.Stu");
        Object o1 = s.newInstance();
        System.out.println(o1);

        Constructor<?> os = s.getConstructor(String.class, int.class);
        Object o2 = os.newInstance("Rambo", 24);
        System.out.println(o2);

        Stu s1 = (Stu) o2;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.eat();



    }
}
