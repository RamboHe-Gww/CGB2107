package cn.tedu.basic;

import java.util.Scanner;

/**������ϰͳ��ѧԱ�÷ֶ�λ����*/
public class TestScore {
	//����90������--���㣬80-90--���ã�70-79--�е� 
	public static void main(String[] args) {
		//1������ѧԱ�ɼ�
		Scanner input = new Scanner(System.in);
		int score;
		do {
			System.out.println("����ѧԱ�ɼ���");
			score = input.nextInt();
			//2������ɼ����ж����ĸ���λ�ҽ��жϽ�����
			if (score<0 || score>100) {
				System.out.println("�ɼ�������������������");
			}else if (score>=90) {
				System.out.println("����");
			}else if (score>=80) {
				System.out.println("����");
			}else if (score>=70) {
				System.out.println("�е�");
			}else if (score>=60) {
				System.out.println("����");
			}else {
				System.out.println("������");
			}
		} while (score<0 || score>100);
//		System.out.println("����ѧԱ�ɼ���");
//		int score = input.nextInt();
//		//2������ɼ����ж����ĸ���λ�ҽ��жϽ�����
//		if (score<0 || score>100) {
//			System.out.println("�ɼ�������������������");
//		}else {
//			if (score>=90) {
//				System.out.println("����");
//			}else if (score>=80) {
//				System.out.println("����");
//			}else if (score>=70) {
//				System.out.println("�е�");
//			}else if (score>=60) {
//				System.out.println("����");
//			}else {
//				System.out.println("������");
//			}
//		}
		input.close();
	}
}
