package cn.tedu.array;

import java.util.Arrays;

/**本类用于数组的创建*/
public class TestCreateArray {
	public static void main(String[] args) {
		//1、静态创建
		char[] c2 = new char[] {'h','e','l','l','o'};
		char[] c1 = {'h','e','l','l','o'};
		//2、动态创建
		char[] c3 = new char[5];
		/**通过数组的下标操作数组的具体元素，注意数组下标从0开始*/
		c3[0] = 'h';
		c3[1] = 'e';
		c3[2] = 'l';
		c3[3] = 'l';
		c3[4] = 'o';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(Arrays.toString(c1));
		
		String[] s = {"a","b","c"};
		/**s为引用类型变量，保存数组地址值
		 * 由于Java对char类型做了底层处理，所以char[]可以直接打印具体内容
		 * 除了char类型，其他任何类型的数组想要查看数组中的具体元素
		 * 需要使用数组的工具类Arrays的toString(数组名)来完成*/
		System.out.println(s);
		System.out.println(Arrays.toString(s));
 	}
}
