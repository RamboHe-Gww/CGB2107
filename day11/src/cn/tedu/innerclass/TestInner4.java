package cn.tedu.innerclass;

/**
 * FileName��TestInner4
 * Date��2021/8/13 16:12
 */
/*�������ڲ��Ծֲ��ڲ���*/
public class TestInner4 {
    public static void main(String[] args) {
        new Outer4().show();
        /*���ʹ���ڲ������Դ��
        * ע�⣺ֱ�Ӵ����ⲿ��������show()�޷������ڲ��๦��
        * ��Ҫ���ⲿ���д����ڲ�������ҵ����ڲ���Ĺ��ܣ��Żᱻ����*/
    }
}

class Outer4{

    public void show(){
        System.out.println("�����ⲿ�����ͨ����show()...");

        /*�ֲ��ڲ��ࣺ������*/
        class Inner4{
            //�ֲ��ڲ���������뷽��
            final String name = "Ram";
            final int age = 18;
            public void eat(){
                System.out.println("���Ǿֲ��ڲ������ͨ����eat()...");
            }
        }

        /*���ʹ�þֲ��ڲ���Ĺ���?*/
        //��show()�д����ڲ�����󲢵��ù���
        Inner4 i = new Inner4();
        i.eat();
        System.out.println(i.age);
        System.out.println(i.name);
    }
}
