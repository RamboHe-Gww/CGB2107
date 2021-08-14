package cn.tedu.innerclass;

/**
 * FileName：TestInner4
 * Date：2021/8/13 16:12
 */
/*本类用于测试局部内部类*/
public class TestInner4 {
    public static void main(String[] args) {
        new Outer4().show();
        /*如何使用内部类的资源？
        * 注意：直接创建外部类对象调用show()无法触发内部类功能
        * 需要在外部类中创建内部类对象并且调用内部类的功能，才会被触发*/
    }
}

class Outer4{

    public void show(){
        System.out.println("我是外部类的普通方法show()...");

        /*局部内部类：方法里*/
        class Inner4{
            //局部内部类的属性与方法
            final String name = "Ram";
            final int age = 18;
            public void eat(){
                System.out.println("我是局部内部类的普通方法eat()...");
            }
        }

        /*如何使用局部内部类的功能?*/
        //在show()中创建内部类对象并调用功能
        Inner4 i = new Inner4();
        i.eat();
        System.out.println(i.age);
        System.out.println(i.name);
    }
}
