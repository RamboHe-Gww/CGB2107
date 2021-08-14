package cn.tude.block;
/**本类用作代码块的入门案例*/
public class TestBlock {
	public static void main(String[] args) {
		//顺序：
		//构造代码块->构造方法->对象创建成功->局部代码块
		/**1.创建对象时，程序会自动调用构造方法，如果有构造代码块
		 * 会优先执行构造代码块提取所有构造的共性功能，再执行构造方法创建对象
		 * 2.对象创建好后，可以通过对象调用方法，若方法中有局部代码块，就会执行对应的局部代码块*/
		Teacher teach = new Teacher();
		m();
		Teacher teach1 = new Teacher("CGB");
		m();
		teach.teach();
		m();
		teach1.teach();	
	}
	
	public static void m() {
		System.out.println("--------------------------");
	}
}

//1.创建一个老师类
class Teacher{
	//2.定义老师类的属性
	String course = "Java-CGB";//course--属性--成员变量
	String subject;
	//5.定义构造代码块
	/*构造代码块：
	 * 位置：类里方法外
	 * 执行时机：每次在调用构造方法时触发，而且优先与构造方法执行
	 * 作用：用于提取所有构造方法的共性功能*/
	{
//		course = "Java-CGB";
		subject = "Python";
		System.out.println("我是构造代码块");
	}
	
	//3.1创建本类的无参构造
	public Teacher() {
		System.out.println("Teacher...无参构造"+course);
	}
	
	//3.2创建本类的含参构造，参数：course
	public Teacher(String c) {
		System.out.println("Teacher...含参构造"+course);
//		course = c;
//		System.out.println("Teacher...含参构造"+course);
		
	}
	
	//4.定义普通方法
	//修饰符 返回值类型 方法名(参数列表){方法体}
	public void teach() {
		System.out.println("正在授课ing...");
		//6.定义局部代码块
		/*局部代码块
		 * 位置：方法里
		 * 执行时机：调用本代码块所在的方法时，才会触发
		 * 作用：控制变量的作用范围，变量的作用越小越好*/
		{
			int i = 10;
			System.out.println("局部代码块"+i);
		}
	}
}
