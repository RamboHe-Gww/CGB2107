package cn.tedu.basic;

import java.util.Random;

public class Demo2 {
	public static void main(String[] args) {
		int random = createNum();
		compareNum(random);
	}

	private static int createNum() {
		Random random = new Random();
		int a = random.nextInt(100);
		//����100���Զ���ģ���ʱ���ɵ�������ڷ�Χ[0,100)���ڵ�����
		System.out.println("ȡ����"+a);
		return a;
	}

	private static void compareNum(int random) {
		int count = 0;
		for (int i = 0; i < 101; i++) {
			if (i!=random) {
				count++;
				continue;
			}else if (i==random) {
				break;
			}
		}System.out.println("����Ϊ��"+count);
	}
	
	

}
