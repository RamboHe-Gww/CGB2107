package cn.tedu.oopextends;

/**
 * FileName：TestExtendsDemo
 * Date：2021/8/9 10:13
 */
/*本类用于继承的入门案例*/
public class TestExtendsDemo {
    public static void main(String[] args) {
        //5.创建3个类的对象
        Animal a = new Animal();
        Cat c = new Cat();
        Miao m = new Miao();
        /*3.继承具有传递性，爷爷的功能传给爸爸，爸爸的功能传给子孙*/
        a.eat();
        c.eat();
        m.eat();
    }
}
/*1.通过extends关键字建立子类与父类的继承关系，格式：子类 extends 父类
* 2.java只支持单继承，一个子类只能有一个父类，但是一个父类可以有多个子类*/
//1.创建爷爷类
class Animal{
    //4.添加Animal类的方法
    public void eat(){//在Cat类和Miao类中被重写
        System.out.println("Animal动物类");

    }
}

//2.父类，Cat类继承于Animal类
/*6.继承是is a的关系，比如小猫是小动物，Miao是一只小猫
* 继承要求子类必须是父类的一种下属类型，依赖性强，强耦合*/
class Cat extends Animal{
    //6.定义Cat类普通属性--成员变量
    int a = 10;//普通变量
    private int b = 100;//私有变量
    @Override//发生重写，重写了Animal的eat方法
    public void eat(){
        System.out.println("Cat类");
    }
}

//3.子孙类，Miao类继承于Cat类
class Miao extends Cat{
    /*4.子类可以拥有自己独有的方法，实现了功能的拓展*/
    //7.Miao类独有方法
    public void studyJava(){
        System.out.println("正在学Java");
        /*5.子类继承父类以后，可以使用父类的所有非私有资源
        * 注意：这个私有资源是由于子类不可见而不能使用，并不是没有继承，子类在继承了父类以后，相当于把父类的功能完全复制了一份*/
        System.out.println(a);//可以使用父类非私有资源
//        System.out.println(b);//b为私有变量，调用会报错
    }
    @Override//发生重写，重写了Cat的eat方法
    public void eat(){
        System.out.println("Miao类");
    }
}

