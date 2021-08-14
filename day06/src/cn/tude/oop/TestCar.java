package cn.tude.oop;

public class TestCar {
	public static void main(String[] args) {
		//6.创建对象测试
		Car c = new Car();
		//6.1通过set方法给属性设置值
		c.setColor("Red");
		c.setBrand("Honda");
		c.setPrice(9999.9);
		c.setLength(3.2);
		//6.2通过get方法获取属性值
		System.out.println(c.getColor());
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getLength());
		//6.3通过对象c调用方法
		c.start();
	}
}


//1.定义汽车类
class Car{
	//2.定义属性
	private String color;
	private String brand;
	private double price;
	private double length;
	
	//3.定义方法
	public void start() {
		System.out.println("启动");
		stop();//调用stop()
	}
	private void stop() {
		System.out.println("停止");
	}
	
	//4.添加被封装属性的get和set方法
	//color
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	//brand
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	//price
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//length
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public Car(String color, String brand, double price, double length) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.length = length;
	}
	
	public Car() {
		super();
	}
	
	
	
	
}