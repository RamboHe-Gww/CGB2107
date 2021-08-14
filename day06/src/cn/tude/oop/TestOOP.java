package cn.tude.oop;

public class TestOOP {
	public static void main(String[] args) {
		//5.创建本类对象进行测试
		Teacher t1 = new Teacher();//无参构造
		Teacher t2 = new Teacher(666);//含参构造
		Teacher t3 = new Teacher("程序媛",18,10000.1,"Java-CGB");//全参构造
		
		//6.通过对象调用方法
		t1.setAge(28);
		System.out.println(t1.getAge());//28
		System.out.println(t2.getName());//Null
		System.out.println(t3.getName());//程序媛
	}
}

//1.创建老师类
class Teacher{
	//2.定义老师类的属性
	//2.1封装对应属性
	private String name;//姓名
	private int age;//年龄
	private double salary;//工资
	private String course;//科目
	
	{
		//构造代码块：类里方法外，用于提取所有构造的共性功能
	}
	
	//3.创建本类的构造函数
	//3.1无参构造
	public Teacher() {
		System.out.println("--无参构造");
	}
	//3.2含参构造，参数为int n
	public Teacher(int n) {
		System.out.println("-----有参构造"+n);
	}
	//3.3全参构造
	public Teacher(String name, int age, double salary, String course) {
		System.out.println("--------全参构造");
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.course = course;
	}
	
	//4.创建本类的成员方法
	public void ready() {
		{
			//局部代码块：方法里，用于控制变量的作用
		}
		System.out.println("正在备课ing...");
	}
	public void teach() {
		System.out.println("上课ing...");
	}
	
	//2.2提供封装属性的set和get方法
	//Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//Salary
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	//Course
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
}


