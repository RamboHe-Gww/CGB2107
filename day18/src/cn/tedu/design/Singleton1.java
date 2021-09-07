package cn.tedu.design;

/**
 * FileName：Singleton1
 * Date：2021/8/24 11:24
 */
/*本类用于测试单例设计模式实现方案一*/
public class Singleton1 {
    public static void main(String[] args) {
        //直接通过类名调用静态资源
        MySingle single1 = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();
        System.out.println(single1==single2);//true

    }
}

//创建单例程序
class MySingle {

    /*构造方法是与类同名且没有返回值类型的方法，用于创建对象
     * 私有化构造方法：不让外界随意调用，实例化/new对象*/
    private MySingle() {
    }

    //创建MySingle类私有化对象
    private static MySingle single = new MySingle();

    //提供一个公共全局访问点
    public static MySingle getSingle() {
        //把本类创建的对象通过return关键字返回到调用位置
        //如果一个方法设置了返回值类型，这个方法必须有相同类型的返回值
        return single;
    }

}

