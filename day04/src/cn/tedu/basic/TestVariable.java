package cn.tedu.basic;
/**本类用于测试不同类型变量的默认值*/
public class TestVariable {
	int e;//无static修饰，成员变量
	static String name;//有static修饰，类变量
	static byte a;
	static short b;
	static int c;
	static long d;
	static float f;
	static double g;
	static char h;
	static boolean i;
	
	public static void main(String[] args) {
		/**引用类型默认值为：null
		 * 整型的默认值为：0
		 * 浮点型的默认值为：0.0
		 * 布尔类型的默认值为：false
		 * 字符型的默认值为\u0000，表现为一个空格*/
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		demo();
	}
	
	public static void demo() {
		int e = 100;
		System.out.println(e);
	}
}
