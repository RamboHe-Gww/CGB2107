package cn.tedu.array;

import java.util.Arrays;

/**本类用于测试数组工具类Arrays的copyOf()方法*/
public class TestArrayCopyOf {
	public static void main(String[] args) {
		//1》创建一个数组
		int[] from = {1,2,3,4,5};
		
		//2》数组的普通复制
		/**Arrays.copyOf(要复制哪个数组，新数组的长度)*/
		int[] to = Arrays.copyOf(from,5);
		System.out.println(Arrays.toString(to));
		
		//3》数组的缩容--缩小容量
		/**先创建指定长度的新数组，然后按照这个长度从原数组中复制对应个数的元素，类似于截取的效果*/
		int[] to2 = Arrays.copyOf(from, 3);
		System.out.println(Arrays.toString(to2));
		
		//4》数组的扩容
		/**先创建指定长度的新数组，然后按照这个长度从原数组from中复制对应个数的元素，没有被复制元素的位置仍然是数组类型的默认值*/
		int[] to3 = Arrays.copyOf(from, 10);
		System.out.println(Arrays.toString(to3));
		
		//5、指定收尾截取数组中的元素
		/**Arrays.copyOfRange（要复制哪个数组，开始下标，结束下标）*/
		int[] to4 = Arrays.copyOfRange(from, 2, 4);
		//注意：截取的范围根据数组下标操作，Range含头不含尾
		System.out.println(Arrays.toString(to4));
		
	}
}
