package cn.tedu.oop;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * FileName��AbstractDemo
 * Date��2021/8/10 17:17
 */
/*����������������Ű���*/
public class AbstractDemo {
    public static void main(String[] args) {
        /*�����಻��ʵ����--��������*/
        //new Phone();
        //������̬����
        Phone p = new XM();
        p.money();
        p.call();
        p.message();
        p.money2();
        System.out.println("---------------------");
        XM xm = new XM();
        p.money();
        p.call();
        p.message();
        p.money2();
    }
}

/*��abstract���ε����ǳ�����
* ���һ�����а�����һ�����󷽷����������뱻����Ϊ������*/
abstract class Phone{
    String name;
    public Phone() {
    }
    //��ͨ����
    public void call() {
        System.out.println("����ͨ����....");
    }
    public void message(){
        System.out.println("���ڷ�����");
    }
    //���󷽷�
    /*��abstract���εķ���ʱ���󷽷������󷽷�û�з�����*/
    abstract public void money();
    abstract public void money2();
}

//����
/*��һ����̳���һ�������࣬�����ֽ��������
* ����һ����ɳ������࣬����ƽ����Ҳ��ʵ�֣���������
* �������������ͨ���࣬ʵ�ֳ������е����г��󷽷�������ծ�ӻ���*/
//abstract class XM extends Phone{
class XM extends Phone{

    @Override
    public void money() {
        System.out.println("ʵ�ָ���δʵ�ֵķ���");
    }

    @Override
    public void money2() {
        System.out.println("ʵ�ָ���δʵ�ֵķ���2");
    }
}
