package cn.tedu.api;

/**
 * FileName��TestString
 * Date��2021/8/12 10:12
 */
/*����������ϰString��ʹ��*/
public class TestString {
    public static void main(String[] args) {
        /*�ַ������͵ײ�ά������char[]�����ڶ���*/
        //new����ʽ��������
        char[] value = {'a','b','c'};
        String s1 = new String(value);
        String s11 = new String(value);
        //�����ط�ʽ��������
        String s2 = "abc";
        String s22 = "abc";
        String s3 = "ccc_ccc_ccc";

        System.out.println(s1 == s2);//false��s1�ڶ��s2�ڶ��ﳣ����
        System.out.println(s1 == s11);//false��������ͬ�Ķ��󣬵�ֵַ��ͬ
        System.out.println(s2 == s22);//true�����ڳ����أ�����ָ��ͬһ�������Ե�ֵַ��ͬ
        System.out.println(s2 == s3);//false�����ڳ����أ������ݲ�ͬ��ָ���ַ��ͬ

        /*Object����equals()��Ĭ��ʵ����ͨ��==���Ƚϵģ�
        * ����String��д����Object��equals()��
        * ��д�󣬲��ٰ���==�Ƚϣ����ǱȽ������ַ����ľ�������
        * Ҳ����˵�����۴�����ʽ��ֻҪ���ַ�����������ͬ��equals()�ͷ���true*/
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s11));//true
        System.out.println(s2.equals(s3));//false

    }
}

