package cn.tedu.basic;

import java.util.Scanner;

/**���󣺱������ڽ����û���������������ȽϺ����������*/
public class TestMaxNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ�Ƚϵĵ�һ������");
		int a = input.nextInt();
		System.out.println("��������Ҫ�Ƚϵĵڶ�������");
		int b = input.nextInt();
		/**��Ŀ����� 1 ? 2 : 3;
		 * 1��λ���Ǳ��ʽ�����1��λ�õĽ��Ϊtrue,ȡ2��λ�õ�ֵ
		 * ��֮��1��λ�õĽ��Ϊfalse��ȡ3��λ�õ�ֵ
		 * */
		int max = a>b?a:b;
		System.out.println("������Ϊ��"+max);
		input.close();
		
		//˼���⣺ͨ����Ԫ������������������ֵ
	}
}
