package cn.tedu;

/**
 * FileName��ReviewExtends
 * Date��2021/8/10 9:05
 */
/*�������ڼ̳еĻع�*/
public class ReviewExtends {
    public static void main(String[] args) {
        Animal a = new Animal("Animal��");
        Dog d = new Dog();
        WangCai w = new WangCai();
        M m = new M();
//        a.eat();
//        d.eat();
//        w.eat();
//        System.out.println(w.age);
//        System.out.println(w.name);//���಻���Ե��ø���˽����Դ
    }
}

//1.үү��
class Animal{
    public void eat(){
        System.out.println("Animal��");
    }

    public void play(){
        System.out.println("Animal��");
    }

    public Animal(String n){
        System.out.println("С������"+n);
    }
}

//2.����
class Dog extends Animal{
    int age;
    private String name;

    public Dog(){
        super("Dog��ͷ");
    }
    @Override
    public void play(){
        System.out.println("Dog����д����");
    }

//    public Dog(String n){
//        System.out.println("С������"+n);
//    }
}
/*������Dog�ֶ�����˺��ι�����������඼����
* 1�������ֶ�����˺��ι����Ĭ�ϵ��޲ι���ᱻ����
* 2.����Ҳ����Ĭ�ϵ��޲ι��죬���ҹ��캯���ĵ�һ����super()����ʾ���ø�����޲ι���
* 3�����ڸ�����޲ι����ѱ����ǣ��޿��ù��캯�������Ա���
* ���������
* ǰ�᣺���ഴ������ʱ������ù��캯�����ȸ��๹�캯��&�����๹�캯����
* ע�⣺���ಢ�����ĵ��õ��Ǹ�����ĸ����캯����ֻҪ��һ���ɵ��ü��ɣ��������е��ø�����������캯������ʽsuper(����);--����д������*/

//3.������
class WangCai extends Dog{
    public WangCai(){
        super();
    }
}

class XiaoBai extends Dog{
    public XiaoBai(){
        super();
    }
}

class M extends XiaoBai{

}