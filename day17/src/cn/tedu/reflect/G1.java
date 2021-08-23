package cn.tedu.reflect;

/**
 * FileName£ºG1
 * Date£º2021/8/23 20:55
 */
public class G1 {
    public String name;
    public int age;

    public G1() {
    }

    public G1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void shoot() {
        System.out.println("---------");
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

    @Override
    public String toString() {
        return "G1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
