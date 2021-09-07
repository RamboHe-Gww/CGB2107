package cn.tedu.innerclass;

/**
 * FileName：TestInner2
 * Date：2021/8/13 15:15
 */
/*本类用于测试成员内部类被private修饰*/
public class TestInner2 {
    public static void main(String[] args) {
        //使用内部类的shoot()
//        Outer2.Inner2 oi = new Outer2().new Inner2();
//        oi.shoot();
        /*如果Inner2成员内部类被private修饰，无法直接创建对象*/
        new Outer2().getInner2Shoot();
    }
}

class Outer2{
    /*对外提供公共的方法，在方法内部创建私有内部类Inner2对象，调用它的方法*/
    public void getInner2Shoot(){
        //创建私有内部类对象
        Inner2 in = new Inner2();
        in.shoot();
    }
    private class Inner2{
        public void shoot(){
            System.out.println("私有成员内部类的普通方法shoot()");
        }
    }

}
