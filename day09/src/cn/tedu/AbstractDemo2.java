package cn.tedu;

/**
 * FileName��cn.tedu.review.AbstractDemo2
 * Date��2021/8/11 9:38
 */
/*�������ڲ��Գ������еĹ��캯��*/
/*�������Ƿ��й��췽����--��
* ��Ȼ�����಻��ʵ������ΪʲôҪ�й��췽���أ�
* ����Ϊ���Լ���������ʹ�ã�����Ϊ�����ഴ������ʱʹ��super()*/
public class AbstractDemo2 {
    public static void main(String[] args) {
        B2 b = new B2();

    }
}

//������
abstract class A2{
    /*�����๹�췽���Ĵ������壺Ϊ�˼̳е������ܹ�ʹ��super();*/
    public A2() {
        System.out.println("����A2�Ĺ��췽��");
    }
}

//����
class B2 extends A2{
    public B2(){
        super();//Ĭ�ϴ����޲ι�����ø���Ĺ��췽��
        System.out.println("B2�Ĺ��췽��");
    }
}

