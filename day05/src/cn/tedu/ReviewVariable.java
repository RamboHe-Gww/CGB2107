package cn.tedu;

public class ReviewVariable {
	//1、成员变量--类里方法外--成员变量无需手动初始化
	//成员变量存在，它就存在，直到自动消失，才会释放
	static int count;
	static int sum;
	public static void main(String[] args) {
		System.out.println(sum);
		//2、局部变量--方法里/局部代码块--需要手动初始化
		//局部变量只能在局部使用，若方法/代码块结束，变量也随之释放
		int sum;
		sum = 100;
		System.out.println(sum);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		//局部变量i已经被释放，所以不能使用
	}
}
