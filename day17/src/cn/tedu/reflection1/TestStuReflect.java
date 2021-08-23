package cn.tedu.reflection1;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * FileName：TestStuReflect
 * Date：2021/8/23 10:36
 */
/*本类用作测试反射*/
public class TestStuReflect {
    /*本方法用于练习获取字节码对象*/
    @Test
    public void getClazz() throws Exception {
        /*反射的所有操作前提都是获取字节码对象
         * 1》Class.forName("类的全路径");
         * 2》类名.class
         * 3》对象.getClass();
         * Class<?>中的"?"是泛型约束中的通配符*/
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

    /*本方法用于练习获取指定类Stu构造方法*/
    @Test
    public void getConstruct() throws Exception {
        //获取字节码对象
//        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        Class<?> s2 = Stu.class;
//        Class<?> s3 = new Stu().getClass();
        //获取构造方法
        /*本方法用于从字节码对象中获取Stu类的多个
         * 构造函数对象，所以这个方法的返回值类型是一个
         * 数组，数组中存着的时多个Stu类的构造函数
         * 对象*/
        Constructor<?>[] cs = s2.getConstructors();
        for (Constructor<?> s : cs) {
//            System.out.println(s);
            System.out.println(s.getName());//获取构造方法的方法名
            Class<?>[] pt = s.getParameterTypes();
            System.out.println(Arrays.toString(pt));
        }
//        System.out.println(Arrays.toString(cs));
    }

    @Test
    public void getStu() {
        Stu s1 = new Stu("张三", 18);
        Stu s2 = new Stu("李四", 18);
        Stu s3 = new Stu("王五", 18);
        Stu[] stu = {s1, s2, s3};
        for (Stu s : stu) {
//            System.out.println(s);//toString重写打印对象的具体属性值
            System.out.println(s.getName());
        }
    }

    /*本方法用于练习获取指定类Stu的成员方法*/
    @Test
    public void getFunction() throws Exception {
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
//        Class<?> s2 = Stu.class;
//        Class<?> s3 = new Stu().getClass();

        //通过字节码对象获取Stu类的成员方法
        Method[] mt = s1.getMethods();//返回值数组mt存放的时Stu类的方法对象
        for (Method s : mt) {
//            System.out.println(s);
            System.out.println(s.getName());//s为方法对象，使用s获取方法名
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
            /*成员变量修饰符必须是public修饰的，才能反
            射得到，默认修饰符或者private反射不到*/
            System.out.println(s.getName());//获取属性的名字
            System.out.println(s.getType().getName());//获取属性的类型名
        }
//        System.out.println(fd);//打印地址值
//        System.out.println(Arrays.toString(fd));
    }

    /*本方法用于练习通过反射创建指定类Stu的对象*/
    /*方式1：通过字节码对象s1调用newInstance()，触发目标类的无参构造来创建对象
     *方式2：通过字节码对象调用s1getConstructor()，获取到构造函数对象cs，再通过构造函数对象cs调用newInstance()，创建含参数的父类类型对象*/
    @Test
    public void getObject() throws Exception {
        Class<?> s1 = Class.forName("cn.tedu.reflection1.Stu");
        /*通过newInstance()触发的时Stu类中的无参
         * 构造创建对象，所以创建的对象无参数；需要创建含
         * 参数对象，需要获取指定的构造函数对象*/
//        Object o1 = s1.newInstance();
//        System.out.println(o1);
        /*getConstructor()获取指定参数列表的构造函数对象
         * 注意：这个方法的参数目标类是Stu中对应含参构造的参数类型*/
        Constructor<?> cs = s1.getConstructor(String.class, int.class);
        Object o2 = cs.newInstance("Rambo", 24);
        System.out.println(o2);
        /*强转：之前转成父类类型的子类对象
         * 如果父类想要使用子类特有的功能，需要强转重新转
         * 回子类类型，*/
        Stu s = (Stu) o2;//o2强转为Stu类
        System.out.println(s.name);
        System.out.println(s.age);
        s.eat();

//        Stu o3 = (Stu) cs.newInstance(String.class, int.class);//直接使用Stu类对象接收，同时发生强转

//        System.out.println(cs.newInstance("Ram",24));

    }

}
