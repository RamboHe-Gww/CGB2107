package cn.tude.oop;
/**本类用作构造函数的入门案例*/
public class TestConstructor {
	public static void main(String[] args) {
		//4.在main创建对象测试
		/*1.一个类会默认存在无参构造，每次new(实例化)对象时都会自动调用构造函数*/
		//无参构造被动调用
		Person p = new Person();
		
		Person.name = "A君";//给静态属性name赋值
		p.age = 18;
		p.address = "贵阳";
		System.out.println(Person.name);//
		System.out.println(p.age);
		System.out.println(p.address);
		p.eat();
		p.eat("饭");
		p.eat(5, "饭");
		
		//全参构造可以用于创建对象，还可以给对象的属性赋值
		Person p1 = new Person("Ram",24,"贵阳");/*实参传入*/
		System.out.println(Person.name);
		System.out.println(p1.age);
		System.out.println(p1.address);
	}
}

//1.创建类描述人类这一事物
class Person{
	//2.定义Person类的属性
	static String name;//静态属性，使用static修饰
	int age;
	String address;
	
	//5.创建Person类的无参构造
	/**2.构造方法的格式：与类同名且没有返回值类型的方法*/
	public Person() {
		System.out.println("Person类的无参构造");
	}
	
	/**4.构造函数也存在重载现象，即无参和有参*/
	public Person(String n, int a, String addr) {/*形参*/
		super();
		name = n;
		age = a;//把调用有参构造时传入的参数age赋值给成员变量this.age
		address = addr;
	}
	
	/**3.方法的重载：发生在同一个类中，方法名相同，参数列表不同，与访问权限和返回值类型无关*/
	//使用重载可提高用户使用体验感
	
	//3.定义Person类的功能
	public void eat() {
		System.out.println("吃");
	}

	public void eat(String str) {
		System.out.println("吃"+str);
	}
	
	public void eat(int n,String str) {
		System.out.println("吃"+n+"碗"+str);
	}
	
	public void sleep() {
		System.out.println("睡");
	}
}
