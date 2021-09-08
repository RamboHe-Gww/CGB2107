package cn.tedu.basic;
/**本类用于完成个人信息输出案例*/
public class TestInfo {
	//1》创建程序入口函数main()
	public static void main(String[] args) {
		System.out.println("欢迎来到JAVA世界，可爱的程序员们~");
		//需求：打印xxx今年xx岁，月薪xxxx，感慨java是世界上最好的语言
		//定义变量来动态的保存数据， 格式：类型 名字 = 值
		int age = 18;//定义年龄变量
		double salary = 10000.99;//定义工资变量
		/**String类型是用来保存字符串的类型，也就是多个字符
		 * 注意：String类型的数据需要使用" "来包裹*/
		String name = "陈子枢";
		/**String类型的静态数据与变量进行交换，需要使用+号 */
		System.out.println(name+"今年"+age+"岁，月薪"+salary+"，感慨java是世界上最好的语言");
	}
}
