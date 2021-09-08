package cn.tedu.basic;
/**本类用于测试运算符*/
public class TestOperator {
	public static void main(String[] args) {
		System.out.println(25/10);//2
		System.out.println(25%10);//5，取余数
		
		int x = 59;
		System.out.println(x/10);//打印十位
		System.out.println(x%10);//打印个位
		
		int y = 147;
		System.out.println(y/100);//打印百位
		System.out.println(y%100/10);//打印十位
		System.out.println(y%10);//打印个位
		
		/**自增自检运算符--用来改变变量本身的值
		 * ++ 表示变量的值+1   --  表示变量的值-1
		 * 后缀式：a++ a--   符号在后，先使用变量，再给变量改值
		 * 前缀式：++a --a   符号在前，先改变变量的值，再使用变量
		 * */
		System.out.println("----------------------------------");
		
		int a = 1;
		System.out.println(a++);//1，符号在后，先使用再变化
		System.out.println(a);//打印过后，自增成2
		
		int b = 1;
		System.out.println(++b);//2，符号在前，先变化再使用
		
		int c = 1;
		System.out.println(--c);
		System.out.println(c);
		/**前面的代码会对后面的代码产生影响*/
		/**普通的四则运算不会改变变量本身的值*/
		System.out.println(--c-c-c--);
		System.out.println(c);
		
		int d = 1;
		System.out.println(d--);//1
		System.out.println(d);//0
	}
}
