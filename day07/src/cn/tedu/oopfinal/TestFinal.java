package cn.tedu.oopfinal;

/**
 * FileName��TestFinal
 * Date��2021/8/9 17:10
 */
/*��������final��ѧϰ*/
public class TestFinal {
    public static void main(String[] args) {
        //6.2��������������
        Son s = new Son();
//        s.name = "�ɷ���";//name����Ϊ���������ܱ��޸�
        System.out.println(s.name);
        s.work();
    }
}

/*final��ʾ���գ�������������
* ���Ǳ�final�������������࣬�޷����̳У�Ҳ����û�����࣬��final���ε��౾�����Ҷ�ӽڵ�*/
//1.����
//final class Father{}//�����࣬��final����
class Father{
    //4.�������ͨ����
    /*final�����������η�������final���εķ������������������ʵ�֣������Ա���д*/
//    final public void work(){}//������д����overridden method is final ���ǵķ���ʱ���յ�
    public void work(){
        System.out.println("�ڳ����ϰ�");
    }
}

//2.����
class Son extends Father{
    //6.1������Ա����
    /*final�����������α�����ע����ʵ���Ǳ��������ǳ���
    * �����Ĳ����Ա�����
    * ���峣������Ҫ������ͬʱ��ֵ�������ȶ����ٸ�ֵ���������﷨*/
    final String name = "����";
    final int a = 0;
    //5.��д���෽��work()
    @Override//������д
    public void work(){
        System.out.println("�ڸ��Ӽ����ϰ�");
    }
}