package cn.tedu;

/**
 * FileName��ReviewAbstract
 * Date��2021/8/11 9:19
 */
/*�������ڳ���ĸ�ϰ*/
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
        System.out.println("�Զ���");
    }
    public void play(){
        System.out.println("������");
    }
    public abstract void jump();
    public abstract void climb();
}

/*��ͨ�������ʵ�ֳ���������г��󷽷�*/
class B extends A{
    @Override
    public void jump(){
        System.out.println("��--���󷽷�ʵ��");
    }
    @Override
    public void climb(){
        System.out.println("��--���󷽷�ʵ��");
    }
}
