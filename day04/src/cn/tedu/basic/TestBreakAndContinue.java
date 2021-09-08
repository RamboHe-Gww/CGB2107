package cn.tedu.basic;

import java.util.Scanner;

/**本类用于测试break与continue*/
public class TestBreakAndContinue {
	public static void main(String[] args) {
		//需求：猜数字88
		//1》提示并接收用户输入100次数据
		for (int i = 0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入要猜的数字：");
			int a = input.nextInt();
			//2》判断用户的数据是否正确
			if (a!=88) {
				System.out.println("没猜对");
				/**continue的作用是用来跳过本轮循环中后面的语句来提高效率的，并不是用来控制继续输入的，能够输入几次，取决于循环的次数与continue无关* */
				continue;
			}
			System.out.println("用于测试continue作用");
			if (a==88) {
				System.out.println("猜对了");
				/**break用于直接跳出循环，结束后面所有轮*/
				/**注意：break与continue后面不允许写代码，都是不可到达的代码*/
				break;
			}
			input.close();
		}
//		System.out.println("游戏结束");
	}
}
