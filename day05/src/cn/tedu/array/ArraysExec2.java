package cn.tedu.array;

import java.util.Arrays;

/**����������ϰ����ı���2*/
//���󣺱������飬���δ�������1-10
public class ArraysExec2 {
	public static void main(String[] args) {
		//1��������̬����
		int[] a = new int[10];
		//2���������飬������Ԫ�ظ�ֵ
		//��0��ʼ��9������++�仯
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
	}
}
