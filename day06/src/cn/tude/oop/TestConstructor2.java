package cn.tude.oop;
/**本类用于练习构造方法2*/
public class TestConstructor2 {
	public static void main(String[] args) {
		/**一个类中默认存在无参构造，但是如果定义了其他的构造方法
		 * 默认的无参构造会被覆盖，所以为了创建对象方便，需要手动添加无参构造*/
		//4.通过无参构造创建本类对象dog1
		Dog dog1 = new Dog();
		System.out.println(dog1);
		//5.通过有参构造创建本类对象dog
		Dog dog = new Dog("旺财", 3, "ram");
		System.out.println(dog);
	}
}

//1.创建小狗类
class Dog{
	//2.定义小狗类的属性
	String name;
	int age;
	String host;
	
	//6.本类的无参构造
	public Dog() {
		
	}
	
	//3.本类的含参构造
	public Dog(String name, int age, String host) {
		System.out.println("全参构造，小狗名："+name+","+age+"岁"
				+ "主人是"+host);
		this.name = name;
		this.age = age;
		this.host = host;
	}
	
	
}
