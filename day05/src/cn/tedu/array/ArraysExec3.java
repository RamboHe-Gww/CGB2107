package cn.tedu.array;

import java.util.Arrays;
import java.util.Random;

/**�������ڴ����������*/
public class ArraysExec3 {
	public static void main(String[] args) {
		//�������飬����Ԫ��Ϊ100���ڵ������
		/**����ĳ�������Ϊ0--[]*/
		int length = new Random().nextInt(10);
		int[] a = new int[length];
		//�����������θ�ÿ��Ԫ�ظ�ֵ
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
