package cn.tedu.sort;

import java.util.Arrays;

public class TestBubble {
	public static void main(String[] args) {
		int[] a = {27,96,73,25,21};
		int[] newA = method(a);
		System.out.println("排序完毕:"+Arrays.toString(newA));
	}
	
	public static int[] method(int[] a) {
		for(int i = 1 ; i <= a.length-1 ; i++) {
			System.out.println("第"+i+"轮:");
			for(int j=0; j < a.length-i ; j++) {
				if(a[j] > a[j+1]) {
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
			System.out.println("第"+i+"轮的结果:"+Arrays.toString(a));
		}
		return a;//把排序好的数组a返回
	}
}
