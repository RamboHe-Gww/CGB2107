package cn.tedu.basic;

import java.util.Scanner;

/**本类用于求平年闰年案例*/
public class TestYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入需要判断的年份：");
		int year = input.nextInt();
		String result = "平年";
		/**单分支结构：
		 * if(判断条件){符合判断条件后要执行的代码 }
		 * */
		if ((year%4==0 && year%100 !=0) || year%400==0) {
			result = "闰年";
		}
		System.out.println(year+result);
//		if ((year%4==0 && year%100 !=0)||(year%400==0)) {
//			result = "闰年";
//			System.out.println(year+result);
//		}else {
//			result = "平年";
//			System.out.println(year+result);
//		}
		input.close();
	}
}

