package cn.tedu;

/**
 * FileName��AbstractDemo3
 * Date��2021/8/11 10:06
 */
/*�������ڲ��Գ������еĳ�Ա*/
public class AbstractDemo3 {
    public static void main(String[] args) {

    }
}

//������
abstract class A3{
    /*���������Ƿ���Զ����Ա������--����*/
    //�����Ա����
    int sum = 100;
    /*���������Ƿ���Զ����Ա������--����*/
    final String name = "XHR";
    /*�������Ƿ���Զ�����ͨ������--����*/
    public void eat(){
        System.out.println("��ͨ����");
    }
    /*�������Ƿ���Զ�����󷽷���--����*/
    public abstract void play();
    public abstract void grow();
    /*�������п���ȫ����ͨ����Ҳ����ȫ�ǳ��󷽷�*/
}

/*���һ������̳��˳����࣬�����ֽ��������
* ����һ����Ϊ�������࣬��ʵ�ָ���ĳ��󷽷�/ʵ�ֲ��ֳ��󷽷�
* ����������Ϊ��ͨ���࣬ʵ�ֳ������ȫ�����󷽷�*/
class B3 extends A3{
    @Override
    public void play() {
        System.out.println("һ���㽶");
    }
    @Override
    public void grow() {
        System.out.println("�㽶����Ƥ");
    }
}
