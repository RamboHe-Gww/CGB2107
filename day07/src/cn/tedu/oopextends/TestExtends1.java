package cn.tedu.oopextends;

/**
 * FileName：TestExtends1
 * Date：2021/8/9 11:13
 */
/*本类用于测试继承中成员变量的使用*/
public class TestExtends1 {
    public static void main(String[] args) {
        //5.创建对象
        Son s = new Son();
        s.eat();
    }
}

//1.父类
class Father{
    //6.父类成员变量
    int count = 1;
    int sum = 2;
    public void eat(){
        int sum = 20;
    }

}

//2.子类
class Son extends Father{
    //3.1子类成员变量
    int sum = 100;
    //4.子类普通方法
    public void eat(){
        //3.2子类局部变量
        int sum = 10;
        System.out.println(sum);//10，局部变量sum
        System.out.println(this.sum);//100，成员变量sum

        /*在子类中使用父类的sum资源，需要使用super进行指定
        * super表示父类的对象，可以理解成：Father super = new Father(); */
        //7.使用父类成员变量
        System.out.println(super.sum);//调用与父类重名的成员变量
        System.out.println(count);//调用父类独有成员变量
    }
}
