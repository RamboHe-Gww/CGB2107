package cn.tedu.oopstatic;

/**
 * FileName：TestStatic1
 * Date：2021/8/9 15:23
 */
/*本类用作静态的入门案例*/
public class TestStatic1 {
    public static void main(String[] args) {
        /*静态资源可以通过类名直接调用
        * 原因：静态资源优先于对象进行加载，它是随着类的加载而加载的，比对象先加载进内存，所以没对象时可以通过类名直接调用*/
        System.out.println(Student.name);
        //4.创建对象测试
        Student s = new Student();
        System.out.println(s.sno);
        System.out.println(s.name);
        s.study();
        //6.测试静态属性
        s.name = "黄桃罐头";
        System.out.println(s.name);
        System.out.println(Student.name);
        //7.创建多个对象进行测试
        /*静态资源被全局所有对象共享*/
        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(Student.name);
    }
}

//1.学生类
class Student{
    /*通过static关键字来修饰成员变量和方法，修饰方法一般写在权限修饰符之后
    * 被static修饰的资源称作静态资源*/
    //2.定义属性
    int sno;//学号,类变量
    static String name;//姓名变量

    //3.定义方法
    public static void study(){
        System.out.println("学习Java");
    }
    public void speak(){
        System.out.println("大声说出来");
    }
}

