package cn.tedu.oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * FileName：AbstractDemo
 * Date：2021/8/10 17:17
 */
/*本类用作抽象的入门案例*/
public class AbstractDemo {
    public static void main(String[] args) {
        /*抽象类不能实例化--创建对象*/
        //new Phone();
        //创建多态对象
        Phone p = new XM();
        p.money();
        p.call();
        p.message();
        p.money2();
        System.out.println("---------------------");
        XM xm = new XM();
        p.money();
        p.call();
        p.message();
        p.money2();
    }
}

/*被abstract修饰的类是抽象类
* 如果一个类中包含了一个抽象方法，这个类必须被声明为抽象类*/
abstract class Phone{
    String name;
    public Phone() {
    }
    //普通方法
    public void call() {
        System.out.println("正在通话中....");
    }
    public void message(){
        System.out.println("正在发短信");
    }
    //抽象方法
    /*被abstract修饰的方法时抽象方法，抽象方法没有方法体*/
    abstract public void money();
    abstract public void money2();
}

//子类
/*当一个类继承了一个抽象父类，有两种解决方案：
* 方案一：变成抽象子类，”躺平，我也不实现，继续抽象“
* 方案二：变成普通子类，实现抽象父类中的所有抽象方法，“父债子还”*/
//abstract class XM extends Phone{
class XM extends Phone{

    @Override
    public void money() {
        System.out.println("实现父类未实现的方法");
    }

    @Override
    public void money2() {
        System.out.println("实现父类未实现的方法2");
    }
}
