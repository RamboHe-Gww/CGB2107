package cn.tedu;

/**
 * FileName：ReviewAbstract
 * Date：2021/8/11 9:19
 */
/*本类用于抽象的复习*/
public class ReviewAbstract {
    public static void main(String[] args) {
        A a = new B();
        a.jump();
        a.eat();
        a.climb();
    }
}

abstract class A{
    public void eat(){
        System.out.println("吃东西");
    }
    public void play(){
        System.out.println("正在玩");
    }
    public abstract void jump();
    public abstract void climb();
}

/*普通子类必须实现抽象父类的所有抽象方法*/
class B extends A{
    @Override
    public void jump(){
        System.out.println("跳--抽象方法实现");
    }
    @Override
    public void climb(){
        System.out.println("跳--抽象方法实现");
    }
}
