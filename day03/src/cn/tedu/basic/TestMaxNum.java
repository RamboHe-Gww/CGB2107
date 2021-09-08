package cn.tedu.basic;

import java.util.Scanner;

/**需求：本类用于接收用户输入的两个数，比较后输出最大的数*/
public class TestMaxNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入需要比较的第一个数：");
		int a = input.nextInt();
		System.out.println("请输入需要比较的第二个数：");
		int b = input.nextInt();
		/**三目运算符 1 ? 2 : 3;
		 * 1号位置是表达式，如果1号位置的结果为true,取2号位置的值
		 * 反之，1号位置的结果为false，取3号位置的值
		 * */
		int max = a>b?a:b;
		System.out.println("最大的数为："+max);
		input.close();
		
		//思考题：通过三元运算符求三个数的最大值
	}
}
