package cn.tedu.inter2;

/**
 * FileName��TestUserInter
 * Date��2021/8/11 11:50
 */
/*�������ڽ�һ�����Խӿڵ�ʹ��*/
public class TestUserInter {
    public static void main(String[] args) {
        /*���һ����û����ȷָ�����࣬��ô���ĸ�����Ƕ�������object
        * �ӿ�ʵ����ʵ���˽ӿڣ��ӿ�����û�й��췽�����ǽӿ�ʵ���๹�췽���еĵ�һ��super();���õ���Ĭ�ϼ̳еĶ�������object�е��޲ι���*/
        Inter2Impl i = new Inter2Impl();

        System.out.println(Inter2.sum);
//        Inter2.sum = 10;//sumΪ��̬���������ܱ��޸�
    }
}

//�����ӿ�
interface Inter2{
    /*�ӿ���û�й��췽��*/
    //public Inter2(){}
    /*�ӿ����Ƿ���Զ����Ա������--������
    * �ӿ��еĲ��Ǳ��������Ǿ�̬��������Ĭ��ƴ��static��final
    * ��̬�ı��֣�����ͨ���ӿ���ֱ�ӵ���
    * �����ı��֣�ֵ�����Ա��޸�*/
    int sum = 100;//Ĭ���Զ�ƴ��public static final

    /*�ӿ��з����Ķ�����Լ�д��Ĭ���Զ�ƴ��public abstract*/
    void eat();
}

//�����ӿ�ʵ����
class Inter2Impl implements Inter2{//Inter2Impl�̳��붥������Object
    //�����޲ι���
    public Inter2Impl(){
        super();
        System.out.println("Inter2Impl���޲ι���");
    }
    @Override
    public void eat(){
        System.out.println("ʵ�����ӿ��еĳ��󷽷�eat()");
    }
}
