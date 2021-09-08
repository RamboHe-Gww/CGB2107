package cn.tedu.array;

import java.util.Arrays;
import java.util.Random;

/**本类用于创建随机数组*/
public class ArraysExec3 {
	public static void main(String[] args) {
		//创建数组，数组元素为100以内的随机数
		/**数组的长度允许为0--[]*/
		int length = new Random().nextInt(10);
		int[] a = new int[length];
		//遍历数组依次给每个元素赋值
		for (int i = 0; i < a.length; i++) {
			a[i] = new Random().nextInt(100);
			/*
			 * Random r = new Random(); 
			 * a[i] = r.nextInt(100);
			 */
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));
	}
}
