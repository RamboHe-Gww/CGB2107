package cn.tedu.sort;

import java.util.Arrays;

/**��������ʵ��ð������*/
public class BubbleSort {
	public static void main(String[] args) {
		int[] a = {27,96,73,25,21};
		int[] newA = sortMethod(a);
		System.out.println("�������:"+Arrays.toString(newA));
	}

	public static int[] sortMethod(int[] a) {
		for (int i = 1; i <= a.length-1; i++) {
			for (int j = 0; j < a.length-i; j++) {
				if (a[j]>a[j+i]) {
					int t = a[j];
					a[j] = a[j+i];
					a[j+i] = t;
				}
			}
			System.out.println("��"+i+"�ֵĽ��:"+Arrays.toString(a));
		}
		return a;
	}
}
