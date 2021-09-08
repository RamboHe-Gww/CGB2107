package cn.tedu;

/**
 * FileName：cn.tedu.review.AbstractDemo2
 * Date：2021/8/11 9:38
 */
/*本类用于测试抽象类中的构造函数*/
/*抽象类是否有构造方法？--有
* 既然抽象类不能实例化，为什么要有构造方法呢？
* 不是为了自己创建对象使用，而是为了子类创建对象时使用super()*/
public class AbstractDemo2 {
    public static void main(String[] args) {
        B2 b = new B2();

    }
}

//抽象父类
abstract class A2{
    /*抽象父类构造方法的存在意义：为了继承的子类能够使用super();*/
    public A2() {
        System.out.println("我是A2的构造方法");
    }
}

//子类
class B2 extends A2{
    public B2(){
        super();//默认存在无参构造调用父类的构造方法
        System.out.println("B2的构造方法");
    }
}

