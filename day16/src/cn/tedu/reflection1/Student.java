package cn.tedu.reflection1;

/**
 * FileName：Student
 * Date：2021/8/20 17:11
 */
/*本类用于测试反射的物料类*/
public class Student {
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shoot(){
        System.out.println("Student类的shoot()方法");
    }

    @Override//重写，方便查看对象属性值
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
