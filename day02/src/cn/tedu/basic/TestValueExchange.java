package cn.tedu.basic;

import java.util.Scanner;

public class TestValueExchange {
	public static void main(String[] args) {
		//������ʾ�������û������������������������������
		Scanner input = new Scanner(System.in);
		System.out.println("�����һ��������");
		int a = input.nextInt();
		System.out.println("����ڶ���������");
		int b = input.nextInt();
		System.out.println("a��ֵΪ��"+a);
		System.out.println("b��ֵΪ��"+b);
		
		int temp = a;
		a = b;
		b= temp;
		System.out.println("������a��ֵ��"+a);
		System.out.println("������b��ֵ��"+b);
		input.close();
	}
}
