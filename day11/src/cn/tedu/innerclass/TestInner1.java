package cn.tedu.innerclass;

/**
 * FileName：TestInner1
 * Date：2021/8/13 14:10
 */
/*本类用于内部类入门案例*/
public class TestInner1 {
    public static void main(String[] args) {
        //外部类对象
        Outer o = new Outer();
        o.find();
        System.out.println(o.name);
        //外部类匿名对象
        /*匿名对象就是没有名字的对象，匿名对象只能使用一次*/
        new Outer().find();

        //内部类对象
//        Outer.Inner oi = new Outer.Inner();
        Outer.Inner oi = new Outer().new Inner();
        oi.delete();//内部类对象使用内部类方法
//        o.delete();//报错，外部类无法直接使用内部类资源
        System.out.println(oi.sum);
    }
}

//外部类
class Outer{
    //外部类成员变量
    String name;
    private int age;
    //外部类成员方法
    public void find(){
        System.out.println("我是外部类的find()");
//        delete();//不能直接使用内部类的方法
//        System.out.println(sum);//不能直接使用内部类的资源
        /*外部类如果想要使用内部类的资源，需要先创建内部类的对象，再通过内部类的对象来调用内部类的资源*/
        Inner in = new Inner();
        in.delete();
        System.out.println(in.sum);
    }
    //成员内部类
    /*根据内部类所处位置的不同，可以把内部类分为两种：
    * 成员内部类--》类里方法外
    * 局部内部类--》方法里*/
    class Inner{
        //成员内部类的成员变量
        int sum = 10;
        //成员内部类的成员方法
        public void delete(){
            System.out.println("我是成员内部类Inner的delete()");
            /*内部类可以直接使用外部类的资源，私有资源也可以*/
            System.out.println(name);
            System.out.println(age);
            /*注意：此处的代码测试完毕后需要注释掉，否则来回调用
            * 会抛出异常：StackOverFlowException  栈溢出*/
//            find();
        }
    }
}
