package cn.tedu.oop;

//创建模板--通过class关键字描述手机这类事物
//特点：品牌 颜色 尺寸 价格
//功能：打电话 发短信 看直播
/**封装：将一类事物的特征与行为封装成一个类组件*/
public class Phone {
	/**类的属性*/
	static String brand;//品牌
	String color;
	double size;
	double price;
	
	/**类的方法*/
	//方法格式：修饰符  返回值类型  方法名(参数列表){方法体}
	public static void call() {
		System.out.println("打电话");
	}
	
	public void send() {
		System.out.println("发短信");
	}
	
	public void video() {
		System.out.println("看直播");
	}
	
	public void name(String brand, String color) {
		Phone.brand = brand;
		this.color = color;
	}
}
