package cn.tedu.innerclass;

/**
 * FileName��TestInner1
 * Date��2021/8/13 14:10
 */
/*���������ڲ������Ű���*/
public class TestInner1 {
    public static void main(String[] args) {
        //�ⲿ�����
        Outer o = new Outer();
        o.find();
        System.out.println(o.name);
        //�ⲿ����������
        /*�����������û�����ֵĶ�����������ֻ��ʹ��һ��*/
        new Outer().find();

        //�ڲ������
//        Outer.Inner oi = new Outer.Inner();
        Outer.Inner oi = new Outer().new Inner();
        oi.delete();//�ڲ������ʹ���ڲ��෽��
//        o.delete();//�����ⲿ���޷�ֱ��ʹ���ڲ�����Դ
        System.out.println(oi.sum);
    }
}

//�ⲿ��
class Outer{
    //�ⲿ���Ա����
    String name;
    private int age;
    //�ⲿ���Ա����
    public void find(){
        System.out.println("�����ⲿ���find()");
//        delete();//����ֱ��ʹ���ڲ���ķ���
//        System.out.println(sum);//����ֱ��ʹ���ڲ������Դ
        /*�ⲿ�������Ҫʹ���ڲ������Դ����Ҫ�ȴ����ڲ���Ķ�����ͨ���ڲ���Ķ����������ڲ������Դ*/
        Inner in = new Inner();
        in.delete();
        System.out.println(in.sum);
    }
    //��Ա�ڲ���
    /*�����ڲ�������λ�õĲ�ͬ�����԰��ڲ����Ϊ���֣�
    * ��Ա�ڲ���--�����﷽����
    * �ֲ��ڲ���--��������*/
    class Inner{
        //��Ա�ڲ���ĳ�Ա����
        int sum = 10;
        //��Ա�ڲ���ĳ�Ա����
        public void delete(){
            System.out.println("���ǳ�Ա�ڲ���Inner��delete()");
            /*�ڲ������ֱ��ʹ���ⲿ�����Դ��˽����ԴҲ����*/
            System.out.println(name);
            System.out.println(age);
            /*ע�⣺�˴��Ĵ��������Ϻ���Ҫע�͵����������ص���
            * ���׳��쳣��StackOverFlowException  ջ���*/
//            find();
        }
    }
}
