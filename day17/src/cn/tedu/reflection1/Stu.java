package cn.tedu.reflection1;

/**
 * FileName��Stu
 * Date��2021/8/23 10:26
 */
/*��������������Ե�������*/
/*�����ǰ�᣺��ȡ�ֽ�����󣬲��һ�ȡ�Ĳ����Լ�д����Դ*/
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
        System.out.println("Stu���eat()����");
    }

    @Override//��д
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
