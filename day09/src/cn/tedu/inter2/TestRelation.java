package cn.tedu.inter2;

/**
 * FileName��TestRelation
 * Date��2021/8/11 15:08
 */
/*�������ڲ��Խӿ�����֮��ĸ��ӹ�ϵ*/
public class TestRelation {
}

//�ӿ�1
interface Inter1 {
    void save();

    void find();
}

//�ӿ�2
interface Inter22 {
    void update();

    void delete();
}

//�ӿ�3
/*�ӿ��Ƿ���Լ̳нӿڣ�--���ԡ��������Լ̳У������Զ�̳У��ӿ�ʹ�ö��Ÿ���*/
//interface Inter3 extends Inter1, Inter22 {
//
//}

//�ӿ�3ʵ����
//class Inter3Impl implements Inter3 {
/*֮ǰѧϰ���ģ�һ����ֻ����һ�����࣬�����java�еġ����̳С������ڣ�һ������˿��Լ̳�һ���������⣬������ͬʱʵ�ֶ���ӿڣ��С���ʵ�֡�*/
class Inter3Impl implements Inter1, Inter22 {

    @Override
    public void save() {
        System.out.println("���ڱ�����...");
    }

    @Override
    public void find() {
        System.out.println("��ѯ");
    }

    @Override
    public void update() {
        System.out.println("����");
    }

    @Override
    public void delete() {
        System.out.println("ɾ��");
    }
}



