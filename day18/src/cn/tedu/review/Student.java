package cn.tedu.review;

/**
 * FileName��Student
 * Date��2021/8/24 9:03
 */
/*���Է���������*/
public class Student {
    public String a;
    protected int b;
    double c;
    private char d;

    public Student() {
    }

    public Student(String a, int b, double c, char d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void study(String name, int num) {
        System.out.println(name+"����Ҫ��"+num+"�д���");
    }

    private void sleep(){
        System.out.println("sleep()����");
    }

    public char getD() {
        return d;
    }

    public void setD(char d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Student{" +
                "a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
