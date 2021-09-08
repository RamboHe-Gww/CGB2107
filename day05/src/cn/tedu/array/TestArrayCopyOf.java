package cn.tedu.array;

import java.util.Arrays;

/**�������ڲ������鹤����Arrays��copyOf()����*/
public class TestArrayCopyOf {
	public static void main(String[] args) {
		//1������һ������
		int[] from = {1,2,3,4,5};
		
		//2���������ͨ����
		/**Arrays.copyOf(Ҫ�����ĸ����飬������ĳ���)*/
		int[] to = Arrays.copyOf(from,5);
		System.out.println(Arrays.toString(to));
		
		//3�����������--��С����
		/**�ȴ���ָ�����ȵ������飬Ȼ����������ȴ�ԭ�����и��ƶ�Ӧ������Ԫ�أ������ڽ�ȡ��Ч��*/
		int[] to2 = Arrays.copyOf(from, 3);
		System.out.println(Arrays.toString(to2));
		
		//4�����������
		/**�ȴ���ָ�����ȵ������飬Ȼ����������ȴ�ԭ����from�и��ƶ�Ӧ������Ԫ�أ�û�б�����Ԫ�ص�λ����Ȼ���������͵�Ĭ��ֵ*/
		int[] to3 = Arrays.copyOf(from, 10);
		System.out.println(Arrays.toString(to3));
		
		//5��ָ����β��ȡ�����е�Ԫ��
		/**Arrays.copyOfRange��Ҫ�����ĸ����飬��ʼ�±꣬�����±꣩*/
		int[] to4 = Arrays.copyOfRange(from, 2, 4);
		//ע�⣺��ȡ�ķ�Χ���������±������Range��ͷ����β
		System.out.println(Arrays.toString(to4));
		
	}
}
