package cn.tedu.basic;

import java.util.Random;
import java.util.Scanner;

/**本类用来测试结构2-while循环*/
public class TestWhile {
	public static void main(String[] args) {
		//需求：产生一个随机数，和用户的数字做比较，直到猜对
		//1》调用产生随机数逻辑并声明变量接收
		int random = createNum();
		//2》调用作比较逻辑并传入要比较的变量
		guessNum(random);
	}

	//输入数字作比较逻辑
	private static void guessNum(int random) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("输入数字：");
			int num = input.nextInt();
			if (num>random) {
				System.out.println("猜大了");
			}else if (num<random) {
				System.out.println("猜小了");
			}else if (num==random) {
				System.out.println("猜对了");
				break;
			}
			/**注意：死循环必须设置出口*/
		}
		input.close();
	}

	//产生随机数逻辑
	private static int createNum() {
		Random random = new Random();
		int i = random.nextInt(100);
		//参数100是自定义的，此时生成的随机数在范围[0,100)以内的整数
		//		System.out.println(i);
		return i;
	}
}
