package cn.tedu.number;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * FileName��TestBigDecimal
 * Date��2021/8/13 10:22
 */
/*�������ڽ������������ȷ����*/
public class TestBigDecimal {
    public static void main(String[] args) {
//        f1();//ʹ����ͨ����������㸡������
        f2();//ʹ��BigDecimal��������������㲻��ȷ����
    }

    //BigDecimal
    private static void f2() {
        System.out.println("��������Ҫ���������С����");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        //���������
        /*��ò�Ҫʹ��double��Ϊ���캯���Ĳ�������Ȼ�����в���ȷ������
        * ���ʹ�����صĹ��캯��������ΪString�Ĺ��캯��
        * doubleתString��ֱ��ƴ��һ���մ���double��""ƴ�Ӻ�ת������String����*/
        BigDecimal bd1 = new BigDecimal(a+"");
        BigDecimal bd2 = new BigDecimal(b+"");
        //����һ������������
        BigDecimal bd3;
        //�ӷ�
        bd3 = bd1.add(bd2);
        System.out.println("�ӷ������"+bd3);
        //����
        bd3 = bd1.subtract(bd2);
        System.out.println("���������"+bd3);
        //�˷�
        bd3 = bd1.multiply(bd2);
        System.out.println("�˷������"+bd3);
        //����
        //����һ���������ᱨ��
//        bd3 = bd1.divide(bd2);
        //����������ǰָ�����������ʱ����λ��
        /*divide(m,n,o)--m�������Ҫ�����ĸ�����
         * n�����ʱ������ʱ������λ��
         * o�����ʱ���뷽ʽ���磺�������룩*/
        bd3 = bd1.divide(bd2,3,BigDecimal.ROUND_HALF_UP);
        System.out.println("���������"+bd3);


    }

    //��ͨ��������
    private static void f1() {
        System.out.println("��������Ҫ���������С����");
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
