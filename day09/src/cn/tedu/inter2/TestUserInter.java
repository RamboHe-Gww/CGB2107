package cn.tedu.inter2;

/**
 * FileName：TestUserInter
 * Date：2021/8/11 11:50
 */
/*本类用于进一步测试接口的使用*/
public class TestUserInter {
    public static void main(String[] args) {
        /*如果一个类没有明确指定父类，那么它的父类就是顶级父类object
        * 接口实现类实现了接口，接口中又没有构造方法，那接口实现类构造方法中的第一行super();调用的是默认继承的顶级父类object中的无参构造*/
        Inter2Impl i = new Inter2Impl();

        System.out.println(Inter2.sum);
//        Inter2.sum = 10;//sum为静态常量，不能被修改
    }
}

//创建接口
interface Inter2{
    /*接口中没有构造方法*/
    //public Inter2(){}
    /*接口中是否可以定义成员变量？--不可以
    * 接口中的不是变量，而是静态常量，会默认拼接static与final
    * 静态的表现：可以通过接口名直接调用
    * 常量的表现：值不可以被修改*/
    int sum = 100;//默认自动拼接public static final

    /*接口中方法的定义可以简写，默认自动拼接public abstract*/
    void eat();
}

//创建接口实现类
class Inter2Impl implements Inter2{//Inter2Impl继承与顶级父类Object
    //本类无参构造
    public Inter2Impl(){
        super();
        System.out.println("Inter2Impl的无参构造");
    }
    @Override
    public void eat(){
        System.out.println("实例化接口中的抽象方法eat()");
    }
}
