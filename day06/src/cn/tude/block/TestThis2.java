package cn.tude.block;
/**本类用于测试this用法2*/
public class TestThis2 {
	public static void main(String[] args) {
		Dog d = new Dog("Rambo");
		System.out.println(d);
	}
}

/**this可以实现构造方法的调用
 * 注意：是单方向调用，不能来回调用，会进入死循环
 * this();--调用本类的无参构造
 * this(参数)--调用本类含参构造
 * this相关的语句必须写在第一行*/
//1.创建小狗类
class Dog{
	//2.创建无参构造与含参构造
	public Dog() {
		//Constructor call must be the first statement in a constructor 构造函数调用this，this必须是构造函数中的第一条语句
		this("Rambo");/**本行代码的作用：在无参构造中调用含参构造*/
		System.out.println("无参构造");
	}
	
	public Dog(String s) {
//		this();/**含参构造调用无参构造*/
		System.out.println("含参构造"+s);
	}
}
