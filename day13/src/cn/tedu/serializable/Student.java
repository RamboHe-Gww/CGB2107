package cn.tedu.serializable;

import java.io.Serializable;

/**
 * FileName：Student
 * Date：2021/8/17 11:44
 */
/*本类用于测试序列化的物料类*/
/*如果一个类的对象想要被序列化输出，那么这个类必须实现
 * 可序列化接口，否则会报错：java.io.NotSerializableException: cn.tedu.serializable.Student
 * Serializable接口是一个空接口，里面一个方法都没有
 * 作用是当做标志，标志这个类可以被序列化
 * */
public class Student implements Serializable {
    /*每次反序列化时，会拿着之前序列化生成的UID做比较
    * 只有两次UID一致时才能反序列化成功，否则报错
    * 解决方案1：一次序列化操作要对应一次反序列化操作
    * 解决方案2：将UID写死，无论怎么修改Student类，UID都不变*/
    private static final long serialVersionUID = 1L;
    //封装属性
    private String name;
    private int age;
    private String address;
    private char gender;
//    private char gender1;
//    private char gender2;

    //无参构造
    public Student() {
        System.out.println("Student无参构造");
    }

    //全参构造
    public Student(String name, int age, String address, char gender) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
//        System.out.println("Student有参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                '}';
    }
}
