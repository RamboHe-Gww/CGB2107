package cn.tedu.oopstatic;

/**
 * FileName��TestStaticBlock
 * Date��2021/8/9 16:29
 */
/*��������ѧϰ��̬�����*/
/*ִ��˳�򣺾�̬�����->��������->���췽�������󴴽��ɹ���->�ֲ������*/
public class TestStaticBlock {
    public static void main(String[] args) {
        //6.�����������
        Person p = new Person();
        Person p2 = new Person();
        p.play();
    }
}

//1.Person��
class Person{
    //7.��̬�����
    /*λ�ã����﷽����
    * ִ��ʱ������̬�����Ҳ���ھ�̬��Դ��������ļ��ض����أ�������������
    * ���Ҿ�̬��Դֻ�����һ��
    * ���ã����ڼ�����Щ��Ҫ��һʱ��ͼ��أ����Ҿ�ֻ����һ�ε���Դ*/
    static{
        System.out.println("��̬�����");
    }

    static{
        System.out.println("��̬�����2");
    }
    //2.�����
    /*λ�ã����﷽����
    * ִ��ʱ����ÿ�δ�������ʱ���������������ڹ��췽��ִ��
    * ���ã�������ȡ���й��췽���Ĺ��Թ���*/
    {
        System.out.println("��������");
    }
    //5.�޲ι���
    public Person(){
        System.out.println("�޲ι���");
    }
    //3.������ͨ����
    public void play(){
        System.out.println("һ����ͨ����");
        //4.�����ֲ������
        /*λ�ã�������
        * ִ��ʱ����ִ�б��ֲ���������ڵķ���ʱ�Ż�ִ��
        * ���ã��������Ʊ��������÷�Χ*/
        {
            System.out.println("�ֲ������");
        }
    }

}
