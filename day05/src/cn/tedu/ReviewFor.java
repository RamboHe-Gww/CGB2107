package cn.tedu;

public class ReviewFor {
	public static void main(String[] args) {
		f1();
		f2();
	}
	
	
	private static void f2() {
		for (int i = 1; i < 10; i++) {//外层--行数
			for (int j = 1; j <= i; j++) {//内层--列数
				System.out.print(" *");
			}System.out.println();//空白行用于换行
		}
	}

	private static void f1() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("外层："+i);
			for (int j = 1; j <= 5; j++) {
				System.out.println(j);
			}
		}
	}
}
