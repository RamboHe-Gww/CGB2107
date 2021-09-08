package cn.tedu.array;

import java.util.Arrays;

/**本类用于练习数组的遍历2*/
//需求：遍历数组，依次存入数据1-10
public class ArraysExec2 {
	public static void main(String[] args) {
		//1、创建动态数组
		int[] a = new int[10];
		//2、遍历数组，给数组元素赋值
		//从0开始，9结束，++变化
		for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(Arrays.toString(a));
	}
}
