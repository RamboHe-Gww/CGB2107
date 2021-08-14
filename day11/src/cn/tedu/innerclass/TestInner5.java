package cn.tedu.innerclass;

/**
 * FileName：TestInner5
 * Date：2021/8/13 16:31
 */
/*本类用于测试匿名内部类*/
public class TestInner5 {
    public static void main(String[] args) {
        /*接口是否可以创建对象？--不可以*/
//        new Inter1();//报错
        /*所以我们现在相当于是3合1
        * 1》new Inter1(); -- 创建匿名对象
        * 2》{方法的实现} -- 接口的实现类
        * 3》.save() -- 表示匿名对象调用实现后的方法
        * 注意：匿名内部类通常与匿名对象结合在一起使用
        * 匿名对象只能使用一次，一次只能调用一个方法*/
        new Inter1() {
            @Override
            public void save() {
                System.out.println("正在保存...");
            }

            @Override
            public void get() {

            }
        }.save();

        new Inter2(){
            @Override
            public void dance() {
                System.out.println("一起跳舞");
            }
        }.dance();

        new Inter3().find();
        new Inter3().find2();
    }
}

//接口Inter1
interface Inter1 {
    //接口中的抽象方法
    void save();

    void get();
}

//抽象类
abstract class Inter2{
    public void play(){
        System.out.println("普通方法...Inter2");
    }
    abstract public void dance();
}

//普通类
class Inter3{
    public void find(){
        System.out.println("查询");
    }
    public void find2(){
        System.out.println("查询2");
    }
}
