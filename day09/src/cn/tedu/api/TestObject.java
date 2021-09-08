package cn.tedu.api;

import java.util.Objects;

/**
 * FileName��TestObject
 * Date��2021/8/11 16:37
 */
/*�������ڲ��Զ�������Object*/
public class TestObject {
    public static void main(String[] args) {
        Student s = new Student("Ram", 18);
        Student s2 = new Student("Ram",18);

        //����toString()
        /*toString()��дǰΪs�ĵ�ֵַ
        * ��д��ΪtoString() ����return����ʽ*/
        System.out.println(s);
        System.out.println(s2);

        //����hashCode()
        /*hashCode()���������ڷ��ض�Ӧ����Ĺ�ϣ��ֵ
        * Ҳ����ͬ���������ز�ͬ�Ĺ�ϣ��ֵ
        * ���Դ������ɲ�ͬ����Ĺ�ϣ��ֵ���ǲ�ͬ��*/
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());
        System.out.println(s2.hashCode());

        //����equals()
        /*�������ײ���ж��߼���==�Ƚϣ�==�ȽϱȽϵ����������ߵ�ֵ����s��s2����������Student�Ķ��󣬱������������ͬ�ĵ�ֵַ�����Ե�ֵַ��ͬ��equals()����false*/
        System.out.println(s.equals(s2));//false

    }
}

class Student {
    String name;
    int age;

    //�޲ι���
    public Student() {
    }

    //���ι���
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override//��дtoString()
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //��дequals()��hashCode()
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
