package cn.tedu.api;

/**
 * FileName��TestString3
 * Date��2021/8/12 14:03
 */
/*�������ڲ����ַ�����ƴ��*/
public class TestString3 {
    public static void main(String[] args) {
        //���󣺽�26����ĸƴ��һ���
        String s = "abcdefghijklmnopqrstuvwxyz";
//        method1(s);
        method2(s);
    }

    private static void method2(String s) {
        StringBuffer result1 = new StringBuffer();
//        StringBuilder result1 = new StringBuilder();
        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result1.append(s);
        }
        System.out.println(result1);
        long t4 = System.currentTimeMillis();
        System.out.println(t4-t3);
    }

    private static void method1(String s) {
        StringBuilder result = new StringBuilder();
        //��Ӽ�ʱ���ܣ���ȡѭ����ʼ��ϵͳ��ǰʱ��
        long t1 = System.currentTimeMillis();
        for (int i = 1; i <=10000 ; i++) {
            result.append(s);
        }
        //��ȡѭ��ƴ��֮���ϵͳ��ǰʱ��
        long t2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(t2-t1);
    }
}
