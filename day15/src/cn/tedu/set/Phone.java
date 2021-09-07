package cn.tedu.set;

import java.util.Objects;

/**
 * FileName：Phone
 * Date：2021/8/19 19:25
 */
public class Phone {
    public static void main(String[] args) {
        Phone p1 = new Phone("Apple", 7200.0, "black");
        Phone p2 = new Phone("Apple", 7200.0, "black");
        System.out.println(p1==p2);//false
        System.out.println(p1.equals(p2));//重写前比较地址为false，重写后比较具体值为true
    }

    String brand;
    double price;
    String color;

    public Phone() {
    }

    public Phone(String brand, double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Double.compare(phone.price, price) == 0 && Objects.equals(brand, phone.brand) && Objects.equals(color, phone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, color);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
