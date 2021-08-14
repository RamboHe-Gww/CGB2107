package cn.tedu.innerclass;

/**
 * FileName：TestInner3
 * Date：2021/8/13 15:36
 */
/*本类用于测试成员内部类被static修饰*/
public class TestInner3 {
    public static void main(String[] args) {
        //创建内部类对象调用方法
//        Outer3.Inner3 oi = new Outer3().new Inner3();
        /*现象：当内部类被static修饰，new Outer3()会报错，
        所以无需创建外部类对象，可以通过类名找到内部类，直接创建静态内部类即可*/
        //普通方法创建内部类对象
        Outer3.Inner3 oi = new Outer3.Inner3();
        oi.show();
        //创建匿名的静态内部类对象，并且调用内部类的方法show()
        new Outer3.Inner3().show();

        //访问静态内部类的静态方法--链式加载
        Outer3.Inner3.fly();
    }
}

class Outer3{
    //static内部类不常用
    static class Inner3{
        public void show(){
            System.out.println("成员内部类Inner3的普通方法show()...");
        }
        //成员内部类的静态方法
        /*内部类作为外部类的一个特殊成员，需要设置成静态，才能在静态内部类中添加静态方法*/
        public static void fly(){
            System.out.println("成员内部类Inner3的静态方法fly()");
        }
    }

}
