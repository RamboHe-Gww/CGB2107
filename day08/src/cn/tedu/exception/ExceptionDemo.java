package cn.tedu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * FileName��ExceptionDemo
 * Date��2021/8/10 15:06
 */
/*���������쳣�Ĳ���*/
public class ExceptionDemo {
//    public static void main(String[] args) throws Exception {//���Ƽ��������׸�main()����Ϊmain���������ᵼ������û�˴���
    public static void main(String[] args) {
//        method1();//���Ա�¶�쳣
//        method2();//�����쳣�������1
        f3();
//        method3();//�����쳣�������2
        }

    private static void f3() {//���������ڽ��method3()�׳����쳣
        try{
            method3();//�������method3()ʱ�׳����쳣
        }catch (Exception e){
            System.out.println("��������ݲ���ȷ������������");
        }
    }

    /*���һ�������׳����쳣����ô˭��������׳��쳣�ķ�����˭����Ҫ��������쳣�������ֽ�������������Լ���������������׳�
    * ע�⣺һ�����main()����֮ǰ������쳣�������ǰ�����ֱ���׸�main()������û�˽��
    * �쳣�����������쳣�׳�--�Լ��������������˴���
    * �쳣�׳��ĸ�ʽ���ڷ��������С�����������֮��д��throws�쳣����
    * ����ж���쳣������ʹ�ö��Ž��зָ�*/
    private static void method3() throws InputMismatchException,ArithmeticException,Exception{
        System.out.println("������Ҫ����ĵ�һ������");
        int a = new Scanner(System.in).nextInt();
        System.out.println("������Ҫ����ĵڶ�������");
        int b = new Scanner(System.in).nextInt();
        System.out.println(a / b);
    }

    /*�쳣������һ���쳣����
    * try{
    *       ���ܻ�����쳣�Ĵ���
    * }catch(Ҫƥ����쳣���� �쳣��){
    *       ƥ�䵽�쳣�ṩ�Ľ������
    * }
    * */
    private static void method2() {
        try{
            System.out.println("������Ҫ����ĵ�һ������");
            int a = new Scanner(System.in).nextInt();
            System.out.println("������Ҫ����ĵڶ�������");
            int b = new Scanner(System.in).nextInt();
            System.out.println(a / b);
        }/*catch (InputMismatchException  e){
            System.out.println("��������ȷ���������ͣ�");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("��������Ϊ0��");
        }*/catch (Exception e){/*ͨ�ý����������̬��Ϊ�����һ��ʵ��*/
            System.out.println("��������ݲ���ȷ������������");
            e.printStackTrace();//��ӡ������Ϣ������̨����Python��ջ��������
        }
        /*���ڶ�̬�������������������쳣����
        * ����ͳһ�����е��쳣���Ϳ����Ǹ��������������ṩ����ͨ�õĽ������
        * �����쳣�������Ƕ�ף�Ҳ���Բ�Ƕ�ף�ֻ�ṩһ��ͨ�ý������
        * ע�⣺����ʱ�쳣���Բ������봦��ֻ������ʱ���лᱨ��Java�ǲ�ǿ��Ҫ�����������ʱ�쳣����ģ�ֻ�������������������*/
    }

    private static void method1() {
        Scanner input = new Scanner(System.in);
        System.out.println("������Ҫ����ĵ�һ������");
        int a = new Scanner(System.in).nextInt();
//        int a = input.nextInt();
        System.out.println("������Ҫ����ĵڶ�������");
        int b = input.nextInt();
        System.out.println(a / b);
//        input.close();
        //������С����InputMismatchException--���벻ƥ���쳣
        //����Ϊ0��ArithmeticException--�����쳣
        /*1����Ҫ����BUG����������ʿ����ֱ���Լ�д��BUG
        * 2��ѧ�ῴ�������Ϣ��ʾ��ȷ���Լ�����ķ���
        * 3��ѧ�ῴ������к���Ϣ��ȷ���Լ������λ�ã����ﲻ�Ե�����
        * ע�⣺Դ�벻���Ҫ���Լ�д�Ĵ���*/
    }
}


