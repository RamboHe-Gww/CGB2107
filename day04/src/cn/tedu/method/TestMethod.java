package cn.tedu.method;
/**本类用作方法的入门案例*/
public class TestMethod {
	/**public是方法的修饰符，表示公共的，即谁都可以使用这个方法
	 * private也是方法的修饰符，表示私有的，私有资源只能在本类使用*/
	public static void main(String[] args) {
		/**调用方法的格式：方法名(参数列表)*/
		method1();
		System.out.println(666);
		method1();
		System.out.println(999);
		
		method2(5,5);
		
		method3("派大星",5);
	}
	
	//本方法用于进一步练习方法的参数
	private static void method3(String name, int i) {
		System.out.println(name+"今天中午要干它"+i+"碗大米饭");
	}

	//本方法用于测试方法的参数
	/**方法的定义相当于方法的“说明书”，定义的时候怎么定义，调用的时候就需要按照定义来调用，即如果方法设置了参数，调用方法时必须按照定义的参数类型来传入参数，否则报错。参数列表有多个参数可用逗号隔开*/
	private static void method2(int a, int b) {
		System.out.println(a+b);
//		System.out.println("海绵宝宝今年"+age+"岁");
	}

	/**方法定义的格式：
	 * 方法的修饰符  静态修饰符  返回值类型  方法名( 参数列表 )  { 方法体 }*/
	private static void method1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}
