package cn.tedu.basic;

public class TestForDemo {
	public static void main(String[] args) {
		/**
		 * Ƕ��forѭ����for����for�����ɣ� 
		 * 1�����ѭ��ִ��һ�Σ��ڲ�ѭ��ִ�ж��
		 */
		m1();
		m2();
		m3();
	}
		
	private static void m2() {
		/*ִ��˳�������
		 * ����һ��i=1�������ڲ�ѭ������ӡ***** ���ڲ�ѭ�����������У�i������2
		 * ���ڶ���i=2�������ڲ�ѭ������ӡ***** ���ڲ�ѭ�����������У�i������3
		 * ���ڶ���i=3�������ڲ�ѭ������ӡ***** ���ڲ�ѭ�����������У�i������4
		 * ��ʱi��ֵΪ4��������ѭ��������ѭ������
		 * �ܽ᣺���ѭ�����ƴ�ӡ���������ڲ����ÿ�д�ӡ��������
		 * */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print('*');
			}System.out.println();//�հ������ڻ���
		}
	}
	
	private static void m1() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("���ѭ��" + i + "��");
			for (int j = 1; j <= 5; j++) {
				System.out.println("�ڲ�ѭ���ĵ�" + j + "��");
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
