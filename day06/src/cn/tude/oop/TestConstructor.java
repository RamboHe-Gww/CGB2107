package cn.tude.oop;
/**�����������캯�������Ű���*/
public class TestConstructor {
	public static void main(String[] args) {
		//4.��main�����������
		/*1.һ�����Ĭ�ϴ����޲ι��죬ÿ��new(ʵ����)����ʱ�����Զ����ù��캯��*/
		//�޲ι��챻������
		Person p = new Person();
		
		Person.name = "A��";//����̬����name��ֵ
		p.age = 18;
		p.address = "����";
		System.out.println(Person.name);//
		System.out.println(p.age);
		System.out.println(p.address);
		p.eat();
		p.eat("��");
		p.eat(5, "��");
		
		//ȫ�ι���������ڴ������󣬻����Ը���������Ը�ֵ
		Person p1 = new Person("Ram",24,"����");/*ʵ�δ���*/
		System.out.println(Person.name);
		System.out.println(p1.age);
		System.out.println(p1.address);
	}
}

//1.����������������һ����
class Person{
	//2.����Person�������
	static String name;//��̬���ԣ�ʹ��static����
	int age;
	String address;
	
	//5.����Person����޲ι���
	/**2.���췽���ĸ�ʽ������ͬ����û�з���ֵ���͵ķ���*/
	public Person() {
		System.out.println("Person����޲ι���");
	}
	
	/**4.���캯��Ҳ�����������󣬼��޲κ��в�*/
	public Person(String n, int a, String addr) {/*�β�*/
		super();
		name = n;
		age = a;//�ѵ����вι���ʱ����Ĳ���age��ֵ����Ա����this.age
		address = addr;
	}
	
	/**3.���������أ�������ͬһ�����У���������ͬ�������б�ͬ�������Ȩ�޺ͷ���ֵ�����޹�*/
	//ʹ�����ؿ�����û�ʹ�������
	
	//3.����Person��Ĺ���
	public void eat() {
		System.out.println("��");
	}

	public void eat(String str) {
		System.out.println("��"+str);
	}
	
	public void eat(int n,String str) {
		System.out.println("��"+n+"��"+str);
	}
	
	public void sleep() {
		System.out.println("˯");
	}
}
