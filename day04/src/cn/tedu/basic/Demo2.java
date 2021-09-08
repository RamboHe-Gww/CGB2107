package cn.tedu.basic;

import java.util.Random;

public class Demo2 {
	public static void main(String[] args) {
		int random = createNum();
		compareNum(random);
	}

	private static int createNum() {
		Random random = new Random();
		int a = random.nextInt(100);
		//参数100是自定义的，此时生成的随机数在范围[0,100)以内的整数
		System.out.println("取到："+a);
		return a;
	}

	private static void compareNum(int random) {
		int count = 0;
		for (int i = 0; i < 101; i++) {
			if (i!=random) {
				count++;
				continue;
			}else if (i==random) {
				break;
			}
		}System.out.println("次数为："+count);
	}
	
	

}
