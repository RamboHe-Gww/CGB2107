package cn.tedu.oopextends;

/**
 * FileName：TestExtends3
 * Date：2021/8/9 14:08
 */
/*本类用于测试继承中方法的使用*/
/*方法的重写：继承后，子类对父类的功能不满意，就可以重写父类的功能，让自己重写的方法体现出来。
重写的意义：在不修改源码的前提下，进行功能的修改和拓展（OCP原则：面向修改关闭，面向拓展开发）
* 重写的语法规则：两同、两小、一大
* 1》一大：子类方法的修饰符范围 >= 父类方法的修饰符范围--指的是访问控制符
* 2》两同：方法名相同，参数列表相同
* 3》两小：子类方法的返回值类型<=父类方法的返回值类型
*         子类方法抛出的异常类型<=父类方法抛出的异常类型
* 注意：如果父类方法的返回值类型是void，子类保持一致即可；子类不可以重写父类的私有方法，因为不可见
* 访问权限（四种）：
	1》public 公开的本类、同包类、子类、其他类可访问。
	2》protected 被保护的 本类、同包类、子类。
	3》默认（什么都不写）本类、同包类。
	4》private私有的 本类。*/
public class TestExtends3 {
    public static void main(String[] args) {
        //4.创建父子类对象
        Father3 f3 = new Father3();
        Son3 s3 = new Son3();
        f3.eat();
        /*继承后，子类可以使用父类的非私有资源*/
        s3.eat();
        s3.play();
        /*如果子类对父类的功能进行了重写，调用的是重写以后的功能*/
    }
}

//1.父类
class Father3{
    //3.创建父类的普通方法
    public void eat(){//被子类Son3重写
        System.out.println("父类Father3--吃");
    }
    public void play(){
        System.out.println("父类Father3----玩");
    }
}

//2.子类
class Son3 extends Father3{
    //5.新建子类独有功能
    public void studyJava(){
        System.out.println("学习java");
    }
    //6.重写父类Father3的eat()方法
    @Override/* @override 是一个注解，或者标签，标记这个方法时重写的方法*/
    public void eat(){
        System.out.println("子类Son3--吃");
    }

}
