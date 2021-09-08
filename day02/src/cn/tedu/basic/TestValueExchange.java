package cn.tedu.basic;

import java.util.Scanner;

public class TestValueExchange {
	public static void main(String[] args) {
		//需求：提示并接收用户输入的两个整数，并交换两个整数
		Scanner input = new Scanner(System.in);
		System.out.println("输入第一个整数：");
		int a = input.nextInt();
		System.out.println("输入第二个整数：");
		int b = input.nextInt();
		System.out.println("a的值为："+a);
		System.out.println("b的值为："+b);
		
		int temp = a;
		a = b;
		b= temp;
		System.out.println("交换后a的值："+a);
		System.out.println("交换后b的值："+b);
		input.close();
	}
}
