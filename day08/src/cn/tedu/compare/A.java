package cn.tedu.compare;

/**
 * FileName��A
 * Date��2021/8/10 20:03
 */
public class A {
    public static void main(String[] args) {
        Animal a = new A1();
        a.eat();
        Animal a1 = new B1();
        a1.eat();
        Animal a2 = new C1();
        a2.eat();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal��");
    }
}

class A1 extends Animal{
    @Override
    public void eat(){
        System.out.println("A��");
    }
}

class B1 extends Animal{
    @Override
    public void eat(){
        System.out.println("B��");
    }
}

class C1 extends Animal{
    @Override
    public void eat(){
        System.out.println("C��");
    }
}