/**
 * package 包，Java用来定义包的一个特殊单词
 * cn.tedu.hello 包名，全小写，公司的域名倒着写
 * ; 英文分号，结束符
 */
package cn.tedu.hello;

/**
 * public	公共的，作为类的修饰符
 * class	类，Java用来定义类的一个特殊单词
 * HelloWorld	类名，类名大驼峰命名，每个单词的首字母大写
 * {  }		类的主体代码
 * 注意：( ) { } ' ' " "  都是英文符号，且是成对出现的
 */

public class HelloWorld {
	
	/**
	 * public static void main(String[] args) {} 固定格式
	 * 作为程序的入口函数：程序从哪里开始执行
	 * public 	公共的，用于修饰main方法
	 * static 	静态的
	 * void 	空，无返回结果
	 * main		方法的名字
	 * ( )		代表这是一个方法
	 * String[] args 	方法的参数	
	 * { }		方法体，放着方法的所有内容
	 */
	public static void main(String[] args) {
		//先输入syso，然后Alt+/ 补全代码的快捷键
		//保存代码：Ctrl+s ，先保存，再运行
		//运行代码：Ctrl+F11
		/**
		 * 本句话的作用：向控制台输出一句话
		 * System	系统
		 * out		向外输出
		 * println	打印后换行    具体打印输出的方式
		 * print	打印后不换行
		 * ( )		代表的是方法，打印后换行的方法/不换行的方法
		 * "Hello,World!"	方法的参数，打印的时候具体要打印什么内容
		 * ;	Java语句的结束符
		 */
		System.out.println("Hello,World!");
		System.out.print("Hello,World!");
		System.out.print("Hello,World!");
		System.out.print("Hello,World!");
		

	}

}
