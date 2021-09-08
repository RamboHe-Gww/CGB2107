package cn.tedu;

/**
 * FileName：ReviewExtends
 * Date：2021/8/10 9:05
 */
/*本类用于继承的回顾*/
public class ReviewExtends {
    public static void main(String[] args) {
        Animal a = new Animal("Animal肉");
        Dog d = new Dog();
        WangCai w = new WangCai();
        M m = new M();
//        a.eat();
//        d.eat();
//        w.eat();
//        System.out.println(w.age);
//        System.out.println(w.name);//子类不可以调用父类私有资源
    }
}

//1.爷爷类
class Animal{
    public void eat(){
        System.out.println("Animal吃");
    }

    public void play(){
        System.out.println("Animal玩");
    }

    public Animal(String n){
        System.out.println("小狗爱吃"+n);
    }
}

//2.父类
class Dog extends Animal{
    int age;
    private String name;

    public Dog(){
        super("Dog骨头");
    }
    @Override
    public void play(){
        System.out.println("Dog类重写父类");
    }

//    public Dog(String n){
//        System.out.println("小狗爱吃"+n);
//    }
}
/*给父类Dog手动添加了含参构造后，两个子类都报错
* 1、父类手动添加了含参构造后，默认的无参构造会被覆盖
* 2.子类也存在默认的无参构造，并且构造函数的第一句是super()；表示调用父类的无参构造
* 3、由于父类的无参构造已被覆盖，无可用构造函数，所以报错
* 解决方法：
* 前提：子类创建对象时必须调用构造函数【先父类构造函数&再子类构造函数】
* 注意：子类并不关心调用的是父类的哪个构造函数，只要有一个可调用即可，在子类中调用父类的其他构造函数，格式super(参数);--必须写在首行*/

//3.子孙类
class WangCai extends Dog{
    public WangCai(){
        super();
    }
}

class XiaoBai extends Dog{
    public XiaoBai(){
        super();
    }
}

class M extends XiaoBai{

}