package cn.tedu.reflection1;

/**
 * FileName��Student
 * Date��2021/8/20 17:11
 */
/*�������ڲ��Է����������*/
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
        System.out.println("Student���shoot()����");
    }

    @Override//��д������鿴��������ֵ
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
