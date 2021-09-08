package cn.tedu.oopstatic;

/**
 * FileName：TestStatic2
 * Date：2021/8/9 16:06
 */
/*本类用于测试静态的调用关系*/
/*总结：
* 1、普通资源：既可以调用普通资源，也可以调用静态资源
* 2、静态资源只能调用静态资源*/
public class TestStatic2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Teacher.ready();
    }
}

//1.老师类
class Teacher{
    //2.普通资源
    String name;
    public void teach(){
        System.out.println("正在授课....");
        /*普通资源是否可以调用静态资源？--可以*/
        System.out.println(age);//静态变量age
        ready();//静态方法
    }

    //3.静态资源
    static int age;
    public static void ready(){
        System.out.println("正在备课.........");
//        ready();//Recursive call 递归调用
        /*静态资源能否调用普通资源？--不可以*/
//        System.out.println(name);
//        teach();

    }
    public static void eat(){
        System.out.println("吃饭中....");
        /*静态资源能否调用静态资源？--可以*/
        System.out.println(age);
        ready();
    }
}

