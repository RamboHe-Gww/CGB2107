package cn.tude.oop;

public class TestOOP {
	public static void main(String[] args) {
		//5.�������������в���
		Teacher t1 = new Teacher();//�޲ι���
		Teacher t2 = new Teacher(666);//���ι���
		Teacher t3 = new Teacher("������",18,10000.1,"Java-CGB");//ȫ�ι���
		
		//6.ͨ��������÷���
		t1.setAge(28);
		System.out.println(t1.getAge());//28
		System.out.println(t2.getName());//Null
		System.out.println(t3.getName());//������
	}
}

//1.������ʦ��
class Teacher{
	//2.������ʦ�������
	//2.1��װ��Ӧ����
	private String name;//����
	private int age;//����
	private double salary;//����
	private String course;//��Ŀ
	
	{
		//�������飺���﷽���⣬������ȡ���й���Ĺ��Թ���
	}
	
	//3.��������Ĺ��캯��
	//3.1�޲ι���
	public Teacher() {
		System.out.println("--�޲ι���");
	}
	//3.2���ι��죬����Ϊint n
	public Teacher(int n) {
		System.out.println("-----�вι���"+n);
	}
	//3.3ȫ�ι���
	public Teacher(String name, int age, double salary, String course) {
		System.out.println("--------ȫ�ι���");
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.course = course;
	}
	
	//4.��������ĳ�Ա����
	public void ready() {
		{
			//�ֲ�����飺��������ڿ��Ʊ���������
		}
		System.out.println("���ڱ���ing...");
	}
	public void teach() {
		System.out.println("�Ͽ�ing...");
	}
	
	//2.2�ṩ��װ���Ե�set��get����
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


