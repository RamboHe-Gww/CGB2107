package cn.tedu;

/**
 * FileName��ReviewString
 * Date��2021/8/13 9:15
 */
public class ReviewString {
    public static void main(String[] args) {
        //Ч�ʸ߷�ʽ�������ڶ��г�����
        String String = "abc";
        String s1 = "abc";
        String s2 = "abc";
        //�����ڶ���
        char[] value = {'a','b','c'};
        String s3 = new String(value);
        char[] value1 = {'a','b','c','d'};
        String s4 = new String(value1);
        /*String���Լ�����д�˼̳���Object���toString()����ӡ��Ϊ��������*/
        System.out.println(s1);
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s3);//false
        /*String���Լ�����д�˼̳���Object���toString()
        * ���ԱȽϵĲ��ǵ�ֵַ�����۴�����ʽ���Ƚϵ�ʱ�������ľ������ݡ�ֻҪ������ͬ������true*/
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

    }
}
