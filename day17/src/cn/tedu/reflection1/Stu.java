package cn.tedu.reflection1;

/**
 * FileName：Stu
 * Date：2021/8/23 10:26
 */
/*本类用作反射测试的物料类*/
/*反射的前提：获取字节码对象，并且获取的不是自己写的资源*/
public class Stu {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Stu() {
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("Stu类的eat()方法");
    }

    @Override//重写
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
