package cn.tedu.oop;

/**
 * FileName��TestExec
 * Date��2021/8/10 14:00
 */
/*�������ڶ�̬�Ĺ���*/
public class TestExec {
    public static void main(String[] args) {
        //���������
        Car c = new Car();
        System.out.println(c.getBrand());//null
        System.out.println(c.getPrice());//0.0
        c.start();
        c.stop();
        //���������
        BMW b = new BMW();
        System.out.println(b.color);//�����������Լ�����
        b.start();//��д��ʹ��������д������Ĺ���
        b.stop();//û����д��ʹ�õ��Ǽ̳��Ը���Ĺ���
        //��̬����
        Car c1 = new BMW();
        /*��̬������÷������������û����д��ʹ�õ�ʱ����Ĺ��ܣ���Ϊ�����Լ������Ǹ�����
        * ���������д�ˣ���ô�����Ķ��忴���࣬�����忴����*/
        c1.start();//��д��ʹ��������д������Ĺ���
        c1.stop();//û����д��ʹ�ø��๦��

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
        System.out.println("����");
    }

    public void stop(){
        System.out.println("ɲ��ֹͣ");
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

    @Override//���ע�⣬����Ϊ��д
    public void start(){
        System.out.println("BMW������������");
    }
}

class TSL extends Car{
    String color = "white";

    public void fly(){
        System.out.println("��������");
    }
}