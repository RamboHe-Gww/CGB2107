package cn.tedu.innerclass;

/**
 * FileName��TestInner3
 * Date��2021/8/13 15:36
 */
/*�������ڲ��Գ�Ա�ڲ��౻static����*/
public class TestInner3 {
    public static void main(String[] args) {
        //�����ڲ��������÷���
//        Outer3.Inner3 oi = new Outer3().new Inner3();
        /*���󣺵��ڲ��౻static���Σ�new Outer3()�ᱨ��
        �������贴���ⲿ����󣬿���ͨ�������ҵ��ڲ��ֱ࣬�Ӵ�����̬�ڲ��༴��*/
        //��ͨ���������ڲ������
        Outer3.Inner3 oi = new Outer3.Inner3();
        oi.show();
        //���������ľ�̬�ڲ�����󣬲��ҵ����ڲ���ķ���show()
        new Outer3.Inner3().show();

        //���ʾ�̬�ڲ���ľ�̬����--��ʽ����
        Outer3.Inner3.fly();
    }
}

class Outer3{
    //static�ڲ��಻����
    static class Inner3{
        public void show(){
            System.out.println("��Ա�ڲ���Inner3����ͨ����show()...");
        }
        //��Ա�ڲ���ľ�̬����
        /*�ڲ�����Ϊ�ⲿ���һ�������Ա����Ҫ���óɾ�̬�������ھ�̬�ڲ�������Ӿ�̬����*/
        public static void fly(){
            System.out.println("��Ա�ڲ���Inner3�ľ�̬����fly()");
        }
    }

}
