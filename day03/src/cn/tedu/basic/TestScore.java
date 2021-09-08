package cn.tedu.basic;

import java.util.Scanner;

/**本类练习统计学员得分段位案例*/
public class TestScore {
	//需求：90及以上--优秀，80-90--良好，70-79--中等 
	public static void main(String[] args) {
		//1、接收学员成绩
		Scanner input = new Scanner(System.in);
		int score;
		do {
			System.out.println("输入学员成绩：");
			score = input.nextInt();
			//2、处理成绩，判断在哪个档位且将判断结果输出
			if (score<0 || score>100) {
				System.out.println("成绩输入有误，请重新输入");
			}else if (score>=90) {
				System.out.println("优秀");
			}else if (score>=80) {
				System.out.println("良好");
			}else if (score>=70) {
				System.out.println("中等");
			}else if (score>=60) {
				System.out.println("及格");
			}else {
				System.out.println("不及格");
			}
		} while (score<0 || score>100);
//		System.out.println("输入学员成绩：");
//		int score = input.nextInt();
//		//2、处理成绩，判断再哪个档位且将判断结果输出
//		if (score<0 || score>100) {
//			System.out.println("成绩输入有误，请重新输入");
//		}else {
//			if (score>=90) {
//				System.out.println("优秀");
//			}else if (score>=80) {
//				System.out.println("良好");
//			}else if (score>=70) {
//				System.out.println("中等");
//			}else if (score>=60) {
//				System.out.println("及格");
//			}else {
//				System.out.println("不及格");
//			}
//		}
		input.close();
	}
}
