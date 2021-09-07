package cn.tedu.design;

/**
 * FileName��Singleton1
 * Date��2021/8/24 11:24
 */
/*�������ڲ��Ե������ģʽʵ�ַ���һ*/
public class Singleton1 {
    public static void main(String[] args) {
        //ֱ��ͨ���������þ�̬��Դ
        MySingle single1 = MySingle.getSingle();
        MySingle single2 = MySingle.getSingle();
        System.out.println(single1==single2);//true

    }
}

//������������
class MySingle {

    /*���췽��������ͬ����û�з���ֵ���͵ķ��������ڴ�������
     * ˽�л����췽�����������������ã�ʵ����/new����*/
    private MySingle() {
    }

    //����MySingle��˽�л�����
    private static MySingle single = new MySingle();

    //�ṩһ������ȫ�ַ��ʵ�
    public static MySingle getSingle() {
        //�ѱ��ഴ���Ķ���ͨ��return�ؼ��ַ��ص�����λ��
        //���һ�����������˷���ֵ���ͣ����������������ͬ���͵ķ���ֵ
        return single;
    }

}

