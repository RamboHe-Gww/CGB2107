package cn.tude.oop;

/**����������ʾ����������*/
public class OverrideDemo {
	public static void main(String[] args) {
		/*1�����ݷ�����+�����б���ȷ����������ĸ�����*/
		/*2�����������أ���ͬһ�����У����ڶ����������ͬ�β����б�ͬ�ķ���
		 * �����ͬһ�����У�ͬ�������Ĳ���������ͬ��һ����������
		 * �����ͬһ�����У�ͬ�������Ĳ���������ͬ�����ܹ������أ�����������ͬ����Ҫ���αȶ�ÿ��λ���ϵĲ���������
		 * (int a, String b)��(int b, String a)--����������
		 * (int a, String b)��(String a, int b)--��������*/
		method();
		method(666);
		method("ram");
		
	}
	
	private static void method(int i) {
		System.out.println("�����ǣ�"+i);
	}

	//1.����һ���޲ε�method()
	private static void method() {
		System.out.println("�޲�������");
	}
	
	private static void method(String s) {
		System.out.println("����"+s);
	}
}
