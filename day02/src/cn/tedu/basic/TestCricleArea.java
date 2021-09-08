package cn.tedu.basic;

import java.util.Scanner;

/**本类用于求圆的面积*/

public class TestCricleArea {
	public static void main(String[] args) {
		System.out.println("请输入要求面积圆的半径值：");
//		double R = new Scanner(System.in).nextDouble();
		Scanner input = new Scanner(System.in);
		double r = input.nextDouble();
		double circleArea = 3.14*r*r;
		System.out.println("当圆半径为："+r+"时，圆的面积为："+circleArea);
		input.close();
	}
}
