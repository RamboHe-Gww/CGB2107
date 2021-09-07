package cn.tedu.serializable;

import java.io.Serializable;

/**
 * FileName��Student
 * Date��2021/8/17 11:44
 */
/*�������ڲ������л���������*/
/*���һ����Ķ�����Ҫ�����л��������ô��������ʵ��
 * �����л��ӿڣ�����ᱨ��java.io.NotSerializableException: cn.tedu.serializable.Student
 * Serializable�ӿ���һ���սӿڣ�����һ��������û��
 * �����ǵ�����־����־�������Ա����л�
 * */
public class Student implements Serializable {
    /*ÿ�η����л�ʱ��������֮ǰ���л����ɵ�UID���Ƚ�
    * ֻ������UIDһ��ʱ���ܷ����л��ɹ������򱨴�
    * �������1��һ�����л�����Ҫ��Ӧһ�η����л�����
    * �������2����UIDд����������ô�޸�Student�࣬UID������*/
    private static final long serialVersionUID = 1L;
    //��װ����
    private String name;
    private int age;
    private String address;
    private char gender;
//    private char gender1;
//    private char gender2;

    //�޲ι���
    public Student() {
        System.out.println("Student�޲ι���");
    }

    //ȫ�ι���
    public Student(String name, int age, String address, char gender) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
//        System.out.println("Student�вι���");
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
