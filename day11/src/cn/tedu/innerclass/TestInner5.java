package cn.tedu.innerclass;

/**
 * FileName��TestInner5
 * Date��2021/8/13 16:31
 */
/*�������ڲ��������ڲ���*/
public class TestInner5 {
    public static void main(String[] args) {
        /*�ӿ��Ƿ���Դ�������--������*/
//        new Inter1();//����
        /*�������������൱����3��1
        * 1��new Inter1(); -- ������������
        * 2��{������ʵ��} -- �ӿڵ�ʵ����
        * 3��.save() -- ��ʾ�����������ʵ�ֺ�ķ���
        * ע�⣺�����ڲ���ͨ����������������һ��ʹ��
        * ��������ֻ��ʹ��һ�Σ�һ��ֻ�ܵ���һ������*/
        new Inter1() {
            @Override
            public void save() {
                System.out.println("���ڱ���...");
            }

            @Override
            public void get() {

            }
        }.save();

        new Inter2(){
            @Override
            public void dance() {
                System.out.println("һ������");
            }
        }.dance();

        new Inter3().find();
        new Inter3().find2();
    }
}

//�ӿ�Inter1
interface Inter1 {
    //�ӿ��еĳ��󷽷�
    void save();

    void get();
}

//������
abstract class Inter2{
    public void play(){
        System.out.println("��ͨ����...Inter2");
    }
    abstract public void dance();
}

//��ͨ��
class Inter3{
    public void find(){
        System.out.println("��ѯ");
    }
    public void find2(){
        System.out.println("��ѯ2");
    }
}
