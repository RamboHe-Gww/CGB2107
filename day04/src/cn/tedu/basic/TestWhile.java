package cn.tedu.basic;

import java.util.Random;
import java.util.Scanner;

/**�����������Խṹ2-whileѭ��*/
public class TestWhile {
	public static void main(String[] args) {
		//���󣺲���һ������������û����������Ƚϣ�ֱ���¶�
		//1�����ò���������߼���������������
		int random = createNum();
		//2���������Ƚ��߼�������Ҫ�Ƚϵı���
		guessNum(random);
	}

	//�����������Ƚ��߼�
	private static void guessNum(int random) {
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("�������֣�");
			int num = input.nextInt();
			if (num>random) {
				System.out.println("�´���");
			}else if (num<random) {
				System.out.println("��С��");
			}else if (num==random) {
				System.out.println("�¶���");
				break;
			}
			/**ע�⣺��ѭ���������ó���*/
		}
		input.close();
	}

	//����������߼�
	private static int createNum() {
		Random random = new Random();
		int i = random.nextInt(100);
		//����100���Զ���ģ���ʱ���ɵ�������ڷ�Χ[0,100)���ڵ�����
		//		System.out.println(i);
		return i;
	}
}
