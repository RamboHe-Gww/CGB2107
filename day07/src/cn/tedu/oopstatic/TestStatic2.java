package cn.tedu.oopstatic;

/**
 * FileName��TestStatic2
 * Date��2021/8/9 16:06
 */
/*�������ڲ��Ծ�̬�ĵ��ù�ϵ*/
/*�ܽ᣺
* 1����ͨ��Դ���ȿ��Ե�����ͨ��Դ��Ҳ���Ե��þ�̬��Դ
* 2����̬��Դֻ�ܵ��þ�̬��Դ*/
public class TestStatic2 {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Teacher.ready();
    }
}

//1.��ʦ��
class Teacher{
    //2.��ͨ��Դ
    String name;
    public void teach(){
        System.out.println("�����ڿ�....");
        /*��ͨ��Դ�Ƿ���Ե��þ�̬��Դ��--����*/
        System.out.println(age);//��̬����age
        ready();//��̬����
    }

    //3.��̬��Դ
    static int age;
    public static void ready(){
        System.out.println("���ڱ���.........");
//        ready();//Recursive call �ݹ����
        /*��̬��Դ�ܷ������ͨ��Դ��--������*/
//        System.out.println(name);
//        teach();

    }
    public static void eat(){
        System.out.println("�Է���....");
        /*��̬��Դ�ܷ���þ�̬��Դ��--����*/
        System.out.println(age);
        ready();
    }
}

