package cn.tedu.oopextends;

/**
 * FileName��TestExtendsDemo
 * Date��2021/8/9 10:13
 */
/*�������ڼ̳е����Ű���*/
public class TestExtendsDemo {
    public static void main(String[] args) {
        //5.����3����Ķ���
        Animal a = new Animal();
        Cat c = new Cat();
        Miao m = new Miao();
        /*3.�̳о��д����ԣ�үү�Ĺ��ܴ����ְ֣��ְֵĹ��ܴ�������*/
        a.eat();
        c.eat();
        m.eat();
    }
}
/*1.ͨ��extends�ؼ��ֽ��������븸��ļ̳й�ϵ����ʽ������ extends ����
* 2.javaֻ֧�ֵ��̳У�һ������ֻ����һ�����࣬����һ����������ж������*/
//1.����үү��
class Animal{
    //4.���Animal��ķ���
    public void eat(){//��Cat���Miao���б���д
        System.out.println("Animal������");

    }
}

//2.���࣬Cat��̳���Animal��
/*6.�̳���is a�Ĺ�ϵ������Сè��С���Miao��һֻСè
* �̳�Ҫ����������Ǹ����һ���������ͣ�������ǿ��ǿ���*/
class Cat extends Animal{
    //6.����Cat����ͨ����--��Ա����
    int a = 10;//��ͨ����
    private int b = 100;//˽�б���
    @Override//������д����д��Animal��eat����
    public void eat(){
        System.out.println("Cat��");
    }
}

//3.�����࣬Miao��̳���Cat��
class Miao extends Cat{
    /*4.�������ӵ���Լ����еķ�����ʵ���˹��ܵ���չ*/
    //7.Miao����з���
    public void studyJava(){
        System.out.println("����ѧJava");
        /*5.����̳и����Ժ󣬿���ʹ�ø�������з�˽����Դ
        * ע�⣺���˽����Դ���������಻�ɼ�������ʹ�ã�������û�м̳У������ڼ̳��˸����Ժ��൱�ڰѸ���Ĺ�����ȫ������һ��*/
        System.out.println(a);//����ʹ�ø����˽����Դ
//        System.out.println(b);//bΪ˽�б��������ûᱨ��
    }
    @Override//������д����д��Cat��eat����
    public void eat(){
        System.out.println("Miao��");
    }
}

