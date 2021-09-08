package cn.tedu.oop;

/**
 * FileName��DesignTeacher
 * Date��2021/8/11 10:30
 */
/*����������������̣������ʦ��*/
/*����abstract�Ǻ����ع��Ľ��*/
public class DesignTeacher {
    public static void main(String[] args) {
        //�������
        CGBTeacher ct = new CGBTeacher();
        ACTTeacher at = new ACTTeacher();
        SCDTeacher st = new SCDTeacher();
        ct.ready();
        ct.teach();
        at.ready();
        at.teach();
        st.ready();
        st.teach();
        //��̬����
        Teacher t = new CGBTeacher();
        t.teach();
    }
}

abstract class Teacher{
    int id;
    String name;
    abstract public void ready();
    abstract public void teach();
}

class CGBTeacher extends Teacher{
    @Override//��д
    public void ready(){
        System.out.println("���ڱ���CGB");
    }
    @Override
    public void teach(){
        System.out.println("����ѧϰCGB");
    }

}
class ACTTeacher extends Teacher{
    @Override//��д
    public void ready(){
        System.out.println("���ڱ���Java������ǿ+��ܼ�ǿ+���¼���");
    }
    @Override
    public void teach(){
        System.out.println("����ѧϰJava������ǿ+��ܼ�ǿ+���¼���");
    }
}

class SCDTeacher extends Teacher{
    @Override//��д
    public void ready(){
        System.out.println("���ڱ��δ�������չģ��");
    }
    @Override
    public void teach(){
        System.out.println("����ѧϰ��������չģ��");
    }
}
