package cn.tedu.oopextends;

/**
 * FileName：TestExtends2
 * Date：2021/8/9 11:31
 */
/*本类用于继承中构造方法的使用*/
/*1.子类创建对象时，默认会先去调用父类的构造方法。原因是由于子类的构造函数的第一行默认存在super()方法--表示默认调用父类的无参构造
* 2.当父类没有无参构造时，可以通过super(参数)调用父类的其他含参构造
* 3.构造方法不能被继承，因构造方法的定义要求为与本类名同名，所以不能被继承到另一个类*/
public class TestExtends2 {
    public static void main(String[] args) {
        //5.创建对象，要顺应继承关系
        Father2 f2 = new Father2(20);
        Son2 s2 = new Son2(200);
    }
}

//1.父类
class Father2{
    //3.创建父类的无参构造
//    public Father2(){
//        System.out.println("Father1的无参构造");
//    }
    public Father2(int sum){
        System.out.println("F含参构造");
    }
}

//2.子类
class Son2 extends Father2{
    int sum;
    //4.创建子类的无参构造
//    public Son2(){
//        super();
//        System.out.println("Son2的无参构造");
//    }

    public Son2(int sum){
        super(20);
        System.out.println(sum);
    }
}


