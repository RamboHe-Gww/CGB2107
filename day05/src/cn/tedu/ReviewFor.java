package cn.tedu;

public class ReviewFor {
	public static void main(String[] args) {
		f1();
		f2();
	}
	
	
	private static void f2() {
		for (int i = 1; i < 10; i++) {//���--����
			for (int j = 1; j <= i; j++) {//�ڲ�--����
				System.out.print(" *");
			}System.out.println();//�հ������ڻ���
		}
	}

	private static void f1() {
		for (int i = 1; i <= 4; i++) {
			System.out.println("��㣺"+i);
			for (int j = 1; j <= 5; j++) {
				System.out.println(j);
			}
		}
	}
}
