package cn.tedu.sort;

import java.util.Arrays;

public class TestBubble {
	public static void main(String[] args) {
		int[] a = {27,96,73,25,21};
		int[] newA = method(a);
		System.out.println("�������:"+Arrays.toString(newA));
	}
	
	public static int[] method(int[] a) {
		for(int i = 1 ; i <= a.length-1 ; i++) {
			System.out.println("��"+i+"��:");
			for(int j=0; j < a.length-i ; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			System.out.println("��"+i+"�ֵĽ��:"+Arrays.toString(a));
		}
		return a;//������õ�����a����
	}
}
