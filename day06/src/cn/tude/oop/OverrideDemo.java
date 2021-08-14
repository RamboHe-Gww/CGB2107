package cn.tude.oop;

/**本类用于演示方法的重载*/
public class OverrideDemo {
	public static void main(String[] args) {
		/*1、根据方法名+参数列表来确定具体调用哪个方法*/
		/*2、方法的重载：在同一个类中，存在多个方法名相同参参数列表不同的方法
		 * 如果在同一个类中，同名方法的参数个数不同，一定构成重载
		 * 如果在同一个类中，同名方法的参数个数相同，可能构成重载；参数个数相同，需要依次比对每个位置上的参数的类型
		 * (int a, String b)与(int b, String a)--不构成重载
		 * (int a, String b)与(String a, int b)--构成重载*/
		method();
		method(666);
		method("ram");
		
	}
	
	private static void method(int i) {
		System.out.println("参数是："+i);
	}

	//1.创建一个无参的method()
	private static void method() {
		System.out.println("无参数方法");
	}
	
	private static void method(String s) {
		System.out.println("我是"+s);
	}
}
