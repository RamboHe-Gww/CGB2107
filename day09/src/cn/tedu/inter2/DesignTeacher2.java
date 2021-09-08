package cn.tedu.inter2;

/**
 * FileName��DesignTeacher2
 * Date��2021/8/11 14:20
 */
/*������������ӿڱ��֮�����ʦ����*/
/*�ӿ���������ƵĽ��*/
public class DesignTeacher2 {
    public static void main(String[] args) {
        CGBTeacher c = new CGBTeacher();
        ACTTeacher a = new ACTTeacher();
        c.ready();
        c.teach();
        a.ready();
        a.teach();
    }
}

//����Teacher2�ӿ�--��ȡ���ԣ��γɳ���㣬���ֽӿڣ��ӿڶ����ʱ����
/*ͨ��interface�ؼ��ֶ���ӿ�*/
interface Teacher2 {
    /*�ӿ��еĶ��ǳ��󷽷����ɼ�д��Ĭ��ƴ��public abstract*/
    //�ӿ��еĳ��󷽷�
    void ready();

    void teach();
}

//�ӿ�ʵ����
/*���ʵ������Ҫʹ�ýӿڵĹ��򣬾���Ҫ��ӿڽ���ʵ�ֹ�ϵ���ؼ���implements*/
class CGBTeacher implements Teacher2 {
    @Override
    public void ready() {
        System.out.println("���ڱ���Java������");
    }

    @Override
    public void teach() {
        System.out.println("�����ڿ�Java������");
    }
}

class ACTTeacher implements Teacher2 {
    @Override
    public void ready() {
        System.out.println("���ڱ��θ��ּ�н");
    }

    @Override
    public void teach() {
        System.out.println("�����ڿθ��ּ�н");
    }
}



