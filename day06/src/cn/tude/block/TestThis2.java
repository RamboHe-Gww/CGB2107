package cn.tude.block;
/**�������ڲ���this�÷�2*/
public class TestThis2 {
	public static void main(String[] args) {
		Dog d = new Dog("Rambo");
		System.out.println(d);
	}
}

/**this����ʵ�ֹ��췽���ĵ���
 * ע�⣺�ǵ�������ã��������ص��ã��������ѭ��
 * this();--���ñ�����޲ι���
 * this(����)--���ñ��ຬ�ι���
 * this��ص�������д�ڵ�һ��*/
//1.����С����
class Dog{
	//2.�����޲ι����뺬�ι���
	public Dog() {
		//Constructor call must be the first statement in a constructor ���캯������this��this�����ǹ��캯���еĵ�һ�����
		this("Rambo");/**���д�������ã����޲ι����е��ú��ι���*/
		System.out.println("�޲ι���");
	}
	
	public Dog(String s) {
//		this();/**���ι�������޲ι���*/
		System.out.println("���ι���"+s);
	}
}
