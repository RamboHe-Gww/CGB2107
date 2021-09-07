package cn.tedu.api;

import java.util.Arrays;

/**
 * FileName��TestString2
 * Date��2021/8/12 11:05
 */
/*����������ϰString�ೣ�÷���*/
public class TestString2 {
    public static void main(String[] args) {
        //�����ַ�����ʽ
        String s = "abc";

        //���η�ʽ
        char[] value = {'a','b','c'};
        String ss = new String(value);

        System.out.println(s == ss);//false��==�Ƚϵ����������͵ĵ�ַ
        System.out.println(s.equals(ss));//true,��д��Ƚϵ����ַ�����ֵ

        //����
        System.out.println(s.charAt(1));//b����ȡָ���±괦�ַ�
        System.out.println(s.concat("ram"));//abcram������ƴ���ַ�
        System.out.println(s);//ƴ���ַ�������ı�ԭ��;

        String s2 = s.concat("rambo");
        System.out.println(s2);

        System.out.println(s.startsWith("a"));//true���ж��ַ����Ƿ���ָ��Ԫ�ؿ�ͷ
        System.out.println(s.endsWith("o"));//false���ж��ַ����Ƿ���ָ��Ԫ�ؽ�β
        System.out.println(s.indexOf("b"));//�ж�Ԫ�ص�����

        ss = "abcddd";
        System.out.println(ss.indexOf("d"));
        System.out.println(ss.lastIndexOf("d"));//�ж�Ԫ�����һ�γ��ֵ�����
        System.out.println(ss.length());//��ȡ�ַ�������

        String s3 = "a b c d e";
        System.out.println(s3.split(" "));//��ӡ��ֵַ
        System.out.println(Arrays.toString(s3.split(" ")));//split()���ص���String[]��ʹ��Arrays.toString()ת���ɾ���ֵ
        String[] s33 = s3.split(" ");
//        System.out.println(Arrays.toString(s33));//[a, b, c, d, e]
        for (int i=0;i<s33.length;i++){
            System.out.print(s33[i]);//abcde
        }System.out.println();

        System.out.println(ss.toUpperCase());//ABCDDD
        System.out.println(ss.toLowerCase());//abcdd

        String s4 = "abcdefgh";
        System.out.println(s4.substring(3));//[3������]����ָ���±괦��ȡ�Ӷ�
        System.out.println(s4.substring(1,5));//[1��5)����ͷ����β����ȡָ����Χ���Ӷ�

        String s5 = "      abcde       ";
        System.out.println(s5.trim());//ȥ���ַ������˶���ո�

        System.out.println(String.valueOf(10));//10��תintΪString����
        System.out.println("20"+10);//2010��String20��int10���ܼ��㣬��ƴ��
        System.out.println(String.valueOf(80)+10);//8010

    }
}
