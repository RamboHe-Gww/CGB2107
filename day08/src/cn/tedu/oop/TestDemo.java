package cn.tedu.oop;

/**
 * FileName��TestDemo
 * Date��2021/8/10 10:13
 */
/*����������̬�����Ű���*/
public class TestDemo {
    public static void main(String[] args) {
        //����һ�����
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        a.eat();
        /*���಻�ܵ����������еĹ���*/
//        a.jump();
//        a.run();
        c.jump();
        d.run();
        //������̬����
        /*�ھ�1����������ָ���������
        * ���ͣ������������������ĵ�ֵַ�����������͵���������������*/
        Animal a1 = new Cat();
        Animal a2 = new Dog();
        /*�ھ�2�����뿴��ߣ����п��ұ�
        * ���ͣ�����Ҫ���ඨ���������������ͨ������
        *      ����Ҫ������д������������������̬������ʱʵ�ʸɻ��������*/
        a1.eat();
        a2.eat();

    }
}

/*1����̬��ǰ�᣺�̳�+��д*/

class Animal{
    public void eat(){
        System.out.println("С����Animal��ɶ����");
    }
}

class Cat extends Animal{
    @Override//������д
    public void eat(){
        System.out.println("СèCat��С���");
    }

    public void jump(){
        System.out.println("СèCat���úܸ�");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("С��Dog����");
    }

    public void run(){
        System.out.println("С���ܵĺܿ�");
    }
}