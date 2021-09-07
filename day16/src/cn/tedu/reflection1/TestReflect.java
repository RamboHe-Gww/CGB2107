package cn.tedu.reflection1;

import org.junit.Test;

/**
 * FileName：TestReflect
 * Date：2021/8/20 17:19
 */
/*本类用于测试反射*/
public class TestReflect {
    @Test
    public void getClazz() throws Exception {
        //练习获取类的字节码对象
        //使用Class.forName()会抛异常
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Student");
        Class<?> s2 = Student.class;
        Class<?> s3 = new Student().getClass();
        System.out.println(s1);
        //获取对应字节码对象的全路径名
        System.out.println(s2.getName());
        //获取对应字节码对象的类名
        System.out.println(s3.getSimpleName());
        //获取对应字节码对象对应的包对象
        System.out.println(s1.getPackage());
        //获取对应字节码对象对应的包名
        System.out.println(s1.getPackage().getName());
    }

}
