package cn.tedu.review;

import java.util.Objects;

/**
 * FileName��ReviewObject
 * Date��2021/8/13 9:04
 */
/*�������ڶ�������Object�ĸ�ϰ*/
public class ReviewObject {
    public static void main(String[] args) {
        Student s = new Student("ram", "2107");
        Student s1 = new Student("ram", "2107");
        //toString()��дǰ��ӡs�ĵ�ֵַ��toString()��д���ӡ���巵����ʽ����
        System.out.println(s);

        //����hashCode()
        //hashCode���ص�ʱ��ͬ�����Ӧ�Ĺ�ϣ��ֵ����ϣ����Ҫ�������ֲ�ͬ�Ķ���
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());

        //����equals()
        System.out.println(s == s1);//false
        /*equals()��Object�е�Ĭ��ʵ����ʹ��==���ж�
        * Student����д��equals()�����󣬱Ƚϵ�ʱ���������������ֵ*/
        System.out.println(s.equals(s1));//equals()��д֮ǰΪfalse����д��Ϊtrue

    }
}

class Student{
    String name;
    String sno;

    public Student(String name, String sno) {
        this.name = name;
        this.sno = sno;
    }

    @Override//��д
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
