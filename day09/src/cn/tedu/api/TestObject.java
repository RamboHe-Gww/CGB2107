package cn.tedu.api;

import java.util.Objects;

/**
 * FileName：TestObject
 * Date：2021/8/11 16:37
 */
/*本类用于测试顶级父类Object*/
public class TestObject {
    public static void main(String[] args) {
        Student s = new Student("Ram", 18);
        Student s2 = new Student("Ram",18);

        //测试toString()
        /*toString()重写前为s的地址值
        * 重写后为toString() 返回return的样式*/
        System.out.println(s);
        System.out.println(s2);

        //测试hashCode()
        /*hashCode()的作用用于返回对应对象的哈希码值
        * 也力求不同对象尽量返回不同的哈希码值
        * 可以大致理解成不同对象的哈希码值就是不同的*/
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        //测试equals()
        /*本方法底层的判断逻辑是==比较，==比较比较的是左右两边的值，而s与s2是引用类型Student的对象，保存的是两个不同的地址值，所以地址值不同，equals()返回false*/
        System.out.println(s.equals(s2));//false

    }
}

class Student {
    String name;
    int age;

    //无参构造
    public Student() {
    }

    //含参构造
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override//重写toString()
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals()与hashCode()
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}
