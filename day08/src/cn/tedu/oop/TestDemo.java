package cn.tedu.oop;

/**
 * FileName：TestDemo
 * Date：2021/8/10 10:13
 */
/*本类用作多态的入门案例*/
public class TestDemo {
    public static void main(String[] args) {
        //创建一般对象
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        a.eat();
        /*父类不能调用子类特有的功能*/
//        a.jump();
//        a.run();
        c.jump();
        d.run();
        //创建多态对象
        /*口诀1：父类引用指向子类对象
        * 解释：创建出来的子类对象的地址值交给父类类型的引用类型来保存*/
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        /*口诀2：编译看左边，运行看右边
        * 解释：必须要父类定义这个方法，才能通过编译
        *      必须要子类重写这个方法，才能满足多态，运行时实际干活的是子类*/
        a1.eat();
        a2.eat();

    }
}

/*1、多态的前提：继承+重写*/

class Animal{
    public void eat(){
        System.out.println("小动物Animal吃啥都行");
    }
}

class Cat extends Animal{
    @Override//发生重写
    public void eat(){
        System.out.println("小猫Cat吃小鱼干");
    }

    public void jump(){
        System.out.println("小猫Cat跳得很高");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("小狗Dog吃肉");
    }

    public void run(){
        System.out.println("小狗跑的很快");
    }
}