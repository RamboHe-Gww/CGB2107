package cn.tedu;

public class ReviewMethod {
	public static void main(String[] args) {
		//程序执行的流程是main()来控制的（是否调用以及调用顺序）
		//在main函数中通过"方法名+(参数列表)"方式调用方法
		m1();
		
		m2("ram",24);
		
		int n = m3();//如果接返回值，main()就可以使用这个返回值
		System.out.println(n);
	}
	
	//如果方法需要返回一个值，那么需要修改返回值类型
	//并且通过return关键字返回结果
	private static int m3() {
		
		return 666;
	}

	//方法的参数列表是自由的：无参/含1参/含多参，参数之间用逗号隔开
	private static void m2(String name, int age) {
		System.out.println(name+"今年"+age+"岁");
	}

	//格式：方法的修饰符  返回值类型  方法名(参数列表){方法代码块}
	private static void m1() {
		System.out.println(1);
	}
}
