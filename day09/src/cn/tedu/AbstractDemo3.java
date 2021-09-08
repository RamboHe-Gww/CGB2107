package cn.tedu;

/**
 * FileName：AbstractDemo3
 * Date：2021/8/11 10:06
 */
/*本类用于测试抽象类中的成员*/
public class AbstractDemo3 {
    public static void main(String[] args) {

    }
}

//抽象父类
abstract class A3{
    /*抽象类中是否可以定义成员变量？--可以*/
    //定义成员变量
    int sum = 100;
    /*抽象类中是否可以定义成员常量？--可以*/
    final String name = "XHR";
    /*抽象类是否可以定义普通方法？--可以*/
    public void eat(){
        System.out.println("普通方法");
    }
    /*抽象类是否可以定义抽象方法？--可以*/
    public abstract void play();
    public abstract void grow();
    /*抽象类中可以全是普通方法也可以全是抽象方法*/
}

/*如果一个子类继承了抽象父类，有两种解决方案：
* 方案一：作为抽象子类，不实现父类的抽象方法/实现部分抽象方法
* 方案二：作为普通子类，实现抽象父类的全部抽象方法*/
class B3 extends A3{
    @Override
    public void play() {
        System.out.println("一串香蕉");
    }
    @Override
    public void grow() {
        System.out.println("香蕉被扒皮");
    }
}
