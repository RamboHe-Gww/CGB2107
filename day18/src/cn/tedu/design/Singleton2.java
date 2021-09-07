package cn.tedu.design;

/**
 * FileName：Singleton2
 * Date：2021/8/24 14:06
 */
/*本类用于完成单例设计模式二：懒汉式 -- 面试重点*/
/*延迟加载思想：不会在第一时间创建好对象来占用内存，而是需要
 * 用到的时候再去创建这个类的对象*/
/*单例设计模式的两种实现方式
 * 1》饿汉式：不管用不用这个类的对象，都会在类里直接先创建一个
 * 2》懒汉式：先前不创建，需要用到的时候再去创建*/
public class Singleton2 {
    public static void main(String[] args) {
        MySingle2 single1 = MySingle2.getSingle2();
        MySingle2 single2 = MySingle2.getSingle2();
        System.out.println(single1 == single2);//true

    }
}

class MySingle2 {
    //私有化构造方法的目的，为了防止外界直接调用创建对象
    private MySingle2() {
    }

    //在类的内部创建好引用类型私有化变量
    private static MySingle2 single2;

    //提供公共方法供外界调用，用于获取本类唯一对象
    public static MySingle2 getSingle2() {
        //在返回对象之前，需要先判断single2是否保存有地址值
        if (single2 == null) {//若为null表明没创建过对象
            single2 = new MySingle2();
        }
        //若single2不为null，表明single2有地址值，先前创建过，直接返回即可
        return single2;
    }
}


