package cn.tedu.api;

import java.util.Scanner;

/**
 * FileName��TestRegex
 * Date��2021/8/12 15:22
 */
/*�������ڲ���������ʽ*/
//������ʾ�������û���������֤�ţ����жϽ�����
public class TestRegex {
    public static void main(String[] args) {
        System.out.println("�������֤�ţ�");
        String input = new Scanner(System.in).nextLine();
//        String regex = "[0-9]{17}[0-9X]";
        /*������б��\��java�������⺬�塣��Ϊ����һ��ת���ַ������Զ��һ��\ת�壬����\\��ʾһ��\*/
        String regex1 = "\\d{17}[0-9X]";
        /*input�ǽ��յ������ݣ�regex���Զ����������ʽ��ƥ�����matches()�����ж�input���Ƿ����regex����Ĺ���*/
        if (input.matches(regex1)) {//matches()���ص�booleanֵ
            System.out.println("����45��ȷ");
        }else{
            System.out.println("��������");
        }

    }
}
