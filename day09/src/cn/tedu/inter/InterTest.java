package cn.tedu.inter;

/**
 * FileName��InterTest
 * Date��2021/8/11 11:39
 */
/*���������ӿڹ��ܵĲ�����*/
public class InterTest {
    public static void main(String[] args) {
        /*�ӿ��Ƿ���Դ�������--������*/
//        Inter i = new Inter();

        //���Դ�����̬����
        Inter i = new InterImpl();
        i.eat();
        i.play();

        /*һ�㴴���Ķ��ǽӿ�ʵ������󣬸�����*/
        //���Դ����ӿ�ʵ�������
        InterImpl i2 = new InterImpl();
        i2.eat();
        i2.play();
    }
}
