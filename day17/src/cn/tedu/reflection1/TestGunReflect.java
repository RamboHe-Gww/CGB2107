package cn.tedu.reflection1;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * FileName：TestGunReflect
 * Date：2021/8/23 16:13
 */
/*本类用作暴力反射测试类*/
/*1》操作私有属性：获取对应名字的属性对象 + 给对应的名字的属性设置值*/
public class TestGunReflect {
    @Test
    public void getFields() throws Exception {
//        Class<?> g1 = Class.forName("cn.tedu.reflection1.Gun");
        Class<?> g2 = Gun.class;
//        Class<?> g3 = new Gun().getClass();

        //获取Gun类中的私有属性name
        Field Field_name = g2.getDeclaredField("name");
        //获取私有属性name的类型
        System.out.println(Field_name.getType());//class java.lang.String
        System.out.println(Field_name.getType().getName());//java.lang.String

        /*给属性设置值，需要三个元素：
         * 给哪个对象《1》的哪个属性《2》设置什么值《3》*/
        Object obj = g2.newInstance();
        /*暴力反射setAccessible(true)*/
        Field_name.setAccessible(true);
        /*set(m,n) -- m：要给哪个对象的这个属性值设置值
         * n：给这个属性设置什么 属性*/
        Field_name.set(obj, "Ram");
        //获取obj对象的name属性值
        System.out.println(Field_name.get(obj));

    }

    /*练习获取与调用私有方法*/
    @Test
    public void getFun() throws Exception {
        Class<?> g1 = Gun.class;
        /*getDeclaredMethod(m,x,y,z...)
         * m：需要获取的方法名
         * x,y,z...可变参数，...表示传入的参数个数可以随着要获取的目标方法的参数个数而改变
         * 注意：此处传入的参数是方法的参数类型字节码对象，不能直接传对象*/
        Method method = g1.getDeclaredMethod("save", int.class, String.class);
        Method method1 = g1.getDeclaredMethod("update");
        Object obj = g1.newInstance();
        Gun gun = new Gun();
        method.setAccessible(true);
        method1.setAccessible(true);
        /*invoke(o,x,y,z...)的作用是通过反射执行获取到的方法
         * o：表示的时执行的时哪个对象的这个方法
         * x,y,z...：表示的时要执行这个方法时需要传入的参数，次数传入的时save(int, String)*/
        method.invoke(obj, 100, "ABC");
        method1.invoke(obj);
        method.invoke(gun, "Ram");

    }
}
