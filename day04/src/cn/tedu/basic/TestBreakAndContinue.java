package cn.tedu.basic;

import java.util.Scanner;

/**�������ڲ���break��continue*/
public class TestBreakAndContinue {
	public static void main(String[] args) {
		//���󣺲�����88
		//1����ʾ�������û�����100������
		for (int i = 0; i < 5; i++) {
			Scanner input = new Scanner(System.in);
			System.out.println("������Ҫ�µ����֣�");
			int a = input.nextInt();
			//2���ж��û��������Ƿ���ȷ
			if (a!=88) {
				System.out.println("û�¶�");
				/**continue��������������������ѭ���к������������Ч�ʵģ��������������Ƽ�������ģ��ܹ����뼸�Σ�ȡ����ѭ���Ĵ�����continue�޹�* */
				continue;
			}
			System.out.println("���ڲ���continue����");
			if (a==88) {
				System.out.println("�¶���");
				/**break����ֱ������ѭ������������������*/
				/**ע�⣺break��continue���治����д���룬���ǲ��ɵ���Ĵ���*/
				break;
			}
			input.close();
		}
//		System.out.println("��Ϸ����");
	}
}
