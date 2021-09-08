package cn.tedu.oop;

/**
 * FileName：TestExec
 * Date：2021/8/10 14:00
 */
/*本类用于多态的巩固*/
public class TestExec {
    public static void main(String[] args) {
        //纯父类对象
        Car c = new Car();
        System.out.println(c.getBrand());//null
        System.out.println(c.getPrice());//0.0
        c.start();
        c.stop();
        //纯子类对象
        BMW b = new BMW();
        System.out.println(b.color);//子类对象调用自己属性
        b.start();//重写，使用子类重写方法后的功能
        b.stop();//没有重写，使用的是继承自父类的功能
        //多态对象
        Car c1 = new BMW();
        /*多态对象调用方法，如果方法没有重写，使用的时父类的功能，因为它把自己看作是父类型
        * 如果方法重写了，那么方法的定义看父类，方法体看子类*/
        c1.start();//重写，使用子类重写方法后的功能
        c1.stop();//没有重写，使用父类功能

        TSL t = new TSL();
        t.fly();

    }
}

class Car{
    private String brand;
    private String color;
    private double price;
    private double size;

    public void start(){
        System.out.println("启动");
    }

    public void stop(){
        System.out.println("刹车停止");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

class BMW extends Car{
    String color = "Black";

    @Override//添加注解，表明为重写
    public void start(){
        System.out.println("BMW启动。。。。");
    }
}

class TSL extends Car{
    String color = "white";

    public void fly(){
        System.out.println("飞起来了");
    }
}