package cn.tedu.oop;

/**
 * FileName��TestDemo2
 * Date��2021/8/10 11:12
 */
/*�������ڲ��Զ�̬Ԫ�ص�ʹ�����*/
public class TestDemo2 {
    public static void main(String[] args) {
        //����һ�����
        Animal2 a = new Animal2();
        Dog2 d = new Dog2();
        //������̬����
        /*�ھ�1����������ָ���������*/
        Animal2 a2 = new Dog2();
        d.eat();
        d.play();
        /*�ھ�2�����뿴��ߣ����п��ұ�*
        ��̬�У���Ա����ʹ�õĶ��Ǹ����*/
        System.out.println(a2.sum);
        /*��̬�г�Ա������ʹ���Ǹ���ģ�ʵ�֣������壩ʹ�õ�ʱ�����*/
        a2.eat();
        /*��̬�У���������඼�о�̬�����ķ��������������д�������Ծ�̬�������õĻ��Ǹ����ʵ�֣������壩*/
        a2.play();//��ɶ����

    }
}

class Animal2{
    int sum = 10;
    public void eat(){
        System.out.println("��ɶ����");
    }

    public static void play(){
        System.out.println("��ɶ����.....");
    }
}

/*��̬��ǰ�᣺�̳�+��д*/
class Dog2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("С�����Թ�ͷ");
    }
    /*��̬������������д���������ĸ�����д���������ĸ������Դ�����Ա�����ֱ�ӵ���*/
    //�������ľ�̬����
    public static void play(){
        System.out.println("С�������");
    }
}

