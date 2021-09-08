package cn.tedu.compare;

/**
 * FileName£∫B
 * Date£∫2021/8/10 20:10
 */
public class B {
    public static void main(String[] args) {
        //∂‡Ã¨∂‘œÛ
        Animal2 a = new A2();
        a.eat();
        Animal2 a1 = new B2();
        a1.eat();
        Animal2 a2 = new C2();
        a2.eat();

    }
}


abstract class Animal2{
    public abstract void eat();
}

class A2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("A2≥‘");
    }
}

class B2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("B2≥‘");
    }
}

class C2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("C2≥‘");
    }
}

