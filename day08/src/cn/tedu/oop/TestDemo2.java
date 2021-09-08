package cn.tedu.oop;

/**
 * FileName：TestDemo2
 * Date：2021/8/10 11:12
 */
/*本类用于测试多态元素的使用情况*/
public class TestDemo2 {
    public static void main(String[] args) {
        //创建一般对象
        Animal2 a = new Animal2();
        Dog2 d = new Dog2();
        //创建多态对象
        /*口诀1：父类引用指向子类对象*/
        Animal2 a2 = new Dog2();
        d.eat();
        d.play();
        /*口诀2：编译看左边，运行看右边*
        多态中，成员变量使用的都是父类的*/
        System.out.println(a2.sum);
        /*多态中成员方法的使用是父类的，实现（方法体）使用的时子类的*/
        a2.eat();
        /*多态中，如果父子类都有静态重名的方法，这个不是重写现象，所以静态方法调用的还是父类的实现（方法体）*/
        a2.play();//玩啥都行

    }
}

class Animal2{
    int sum = 10;
    public void eat(){
        System.out.println("吃啥都行");
    }

    public static void play(){
        System.out.println("玩啥都行.....");
    }
}

/*多态的前提：继承+重写*/
class Dog2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("小狗爱吃骨头");
    }
    /*静态方法不存在重写的现象，在哪个类下写，就属于哪个类的资源，可以被类名直接调用*/
    //添加子类的静态方法
    public static void play(){
        System.out.println("小狗爱打滚");
    }
}

