package cn.tude.oop;

public class TestCar {
	public static void main(String[] args) {
		//6.�����������
		Car c = new Car();
		//6.1ͨ��set��������������ֵ
		c.setColor("Red");
		c.setBrand("Honda");
		c.setPrice(9999.9);
		c.setLength(3.2);
		//6.2ͨ��get������ȡ����ֵ
		System.out.println(c.getColor());
		System.out.println(c.getBrand());
		System.out.println(c.getPrice());
		System.out.println(c.getLength());
		//6.3ͨ������c���÷���
		c.start();
	}
}


//1.����������
class Car{
	//2.��������
	private String color;
	private String brand;
	private double price;
	private double length;
	
	//3.���巽��
	public void start() {
		System.out.println("����");
		stop();//����stop()
	}
	private void stop() {
		System.out.println("ֹͣ");
	}
	
	//4.��ӱ���װ���Ե�get��set����
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