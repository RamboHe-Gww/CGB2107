package cn.tedu.review;

import java.util.Objects;

/**
 * FileName：ReviewObject
 * Date：2021/8/13 9:04
 */
/*本类用于顶级父类Object的复习*/
public class ReviewObject {
    public static void main(String[] args) {
        Student s = new Student("ram", "2107");
        Student s1 = new Student("ram", "2107");
        //toString()重写前打印s的地址值，toString()重写后打印具体返回样式内容
        System.out.println(s);

        //测试hashCode()
        //hashCode返回的时不同对象对应的哈希码值，哈希码主要用于区分不同的对象
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        //测试equals()
        System.out.println(s == s1);//false
        /*equals()在Object中的默认实现是使用==来判断
        * Student类重写了equals()方法后，比较的时对象的类型与属性值*/
        System.out.println(s.equals(s1));//equals()重写之前为false，重写后为true

    }
}

class Student{
    String name;
    String sno;

    public Student(String name, String sno) {
        this.name = name;
        this.sno = sno;
    }

    @Override//重写
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sno='" + sno + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(sno, student.sno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sno);
    }
}

class Ram extends Student{

    public Ram(String name, String sno) {
        super(name, sno);
    }
}
