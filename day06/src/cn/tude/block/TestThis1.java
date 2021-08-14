package cn.tude.block;
/**本类用于测试this用法1*/
public class TestThis1 {
	public static void main(String[] args) {
		//5.创建Cat类对象c调用成员方法eat()
		Cat c = new Cat();
		c.eat();
	}
}

//1.创建小猫类
class Cat{
	//2.定义成员变量
	int sum = 20;
	int s = 30;
	
	//3.定义成员方法--成员是位置名-->类里
	public void eat() {
		//4.创建局部变量
		int sum = 10;//局部变量sum
		System.out.println(sum);/**变量的就近原则*/
		/**当成员变量与局部变量同名时，可以通过this关键字
		 * 指定成员变量，因为成员变量属于类资源，类消失，成员变量才会释放
		 * this代表的是本类，可理解成Cat this = new Cat();*/
		System.out.println(this.sum);//成员变量this.sum
		System.out.println(s);//成员变量s
	}
}


