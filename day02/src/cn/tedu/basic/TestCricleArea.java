package cn.tedu.basic;

import java.util.Scanner;

/**����������Բ�����*/

public class TestCricleArea {
	public static void main(String[] args) {
		System.out.println("������Ҫ�����Բ�İ뾶ֵ��");
//		double R = new Scanner(System.in).nextDouble();
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double circleArea = 3.14*r*r;
		System.out.println("��Բ�뾶Ϊ��"+r+"ʱ��Բ�����Ϊ��"+circleArea);
		input.close();
	}
}
