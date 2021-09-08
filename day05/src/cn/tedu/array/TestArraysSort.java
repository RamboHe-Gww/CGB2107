package cn.tedu.array;

import java.util.Arrays;

/**本类用于测试数组工具类Arrays的sort()方法*/
public class TestArraysSort {
	public static void main(String[] args) {
		int[] a = {21,56,34,91,66};
		
			Arrays.sort(a);
			System.out.println(Arrays.toString(a));
			
	}
}
