package cn.tedu.inter;

/**
 * FileName：InterTest
 * Date：2021/8/11 11:39
 */
/*本类用作接口功能的测试类*/
public class InterTest {
    public static void main(String[] args) {
        /*接口是否可以创建对象？--不可以*/
//        Inter i = new Inter();

        //可以创建多态对象
        Inter i = new InterImpl();
        i.eat();
        i.play();

        /*一般创建的都是接口实现类对象，更常用*/
        //可以创建接口实现类对象
        InterImpl i2 = new InterImpl();
        i2.eat();
        i2.play();
    }
}
