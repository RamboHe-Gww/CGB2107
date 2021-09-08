package cn.tedu.basic;

public class TestForDemo {
	public static void main(String[] args) {
		/**
		 * 嵌套for循环：for里有for，规律： 
		 * 1》外层循环执行一次，内层循环执行多次
		 */
		m1();
		m2();
		m3();
	}
		
	private static void m2() {
		/*执行顺序分析：
		 * 外层第一轮i=1，遇到内层循环，打印***** ，内层循环结束，换行，i自增成2
		 * 外层第二轮i=2，遇到内层循环，打印***** ，内层循环结束，换行，i自增成3
		 * 外层第二轮i=3，遇到内层循环，打印***** ，内层循环结束，换行，i自增成4
		 * 此时i的值为4，不符合循环条件，循环结束
		 * 总结：外层循环控制打印的行数，内层控制每行打印的列数。
		 * */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}System.out.println();//空白行用于换行
		}
	}
	
	private static void m1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("外层循环" + i + "轮");
			for (int j = 1; j <= 5; j++) {
				System.out.println("内层循环的第" + j + "次");
			}
		}
	}
	
	private static void m3() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}
