package cn.tedu.oopstatic;

/**
 * FileName��TestStatic1
 * Date��2021/8/9 15:23
 */
/*����������̬�����Ű���*/
public class TestStatic1 {
    public static void main(String[] args) {
        /*��̬��Դ����ͨ������ֱ�ӵ���
        * ԭ�򣺾�̬��Դ�����ڶ�����м��أ�����������ļ��ض����صģ��ȶ����ȼ��ؽ��ڴ棬����û����ʱ����ͨ������ֱ�ӵ���*/
        System.out.println(Student.name);
        //4.�����������
        Student s = new Student();
        System.out.println(s.sno);
        System.out.println(s.name);
        s.study();
        //6.���Ծ�̬����
        s.name = "���ҹ�ͷ";
        System.out.println(s.name);
        System.out.println(Student.name);
        //7.�������������в���
        /*��̬��Դ��ȫ�����ж�����*/
        Student s2 = new Student();
        System.out.println(s2.name);
        System.out.println(Student.name);
    }
}

//1.ѧ����
class Student{
    /*ͨ��static�ؼ��������γ�Ա�����ͷ��������η���һ��д��Ȩ�����η�֮��
    * ��static���ε���Դ������̬��Դ*/
    //2.��������
    int sno;//ѧ��,�����
    static String name;//��������

    //3.���巽��
    public static void study(){
        System.out.println("ѧϰJava");
    }
    public void speak(){
        System.out.println("����˵����");
    }
}

