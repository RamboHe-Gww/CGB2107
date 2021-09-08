package cn.tedu.array;
/**本类用于练习数组的遍历*/
//需求：输出一年中每一个月份的天数，如：1月有31天
public class ArrayExec {
	public static void main(String[] args) {
		int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println((i+1)+"月有"+a[i]+"天");
		}
	}
}
