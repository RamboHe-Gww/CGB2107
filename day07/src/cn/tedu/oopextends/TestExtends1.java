package cn.tedu.oopextends;

/**
 * FileName��TestExtends1
 * Date��2021/8/9 11:13
 */
/*�������ڲ��Լ̳��г�Ա������ʹ��*/
public class TestExtends1 {
    public static void main(String[] args) {
        //5.��������
        Son s = new Son();
        s.eat();
    }
}

//1.����
class Father{
    //6.�����Ա����
    int count = 1;
    int sum = 2;
    public void eat(){
        int sum = 20;
    }

}

//2.����
class Son extends Father{
    //3.1�����Ա����
    int sum = 100;
    //4.������ͨ����
    public void eat(){
        //3.2����ֲ�����
        int sum = 10;
        System.out.println(sum);//10���ֲ�����sum
        System.out.println(this.sum);//100����Ա����sum

        /*��������ʹ�ø����sum��Դ����Ҫʹ��super����ָ��
        * super��ʾ����Ķ��󣬿������ɣ�Father super = new Father(); */
        //7.ʹ�ø����Ա����
        System.out.println(super.sum);//�����븸�������ĳ�Ա����
        System.out.println(count);//���ø�����г�Ա����
    }
}
