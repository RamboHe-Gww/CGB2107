package cn.tude.block;
/**�������ڲ���this�÷�1*/
public class TestThis1 {
	public static void main(String[] args) {
		//5.����Cat�����c���ó�Ա����eat()
		Cat c = new Cat();
		c.eat();
	}
}

//1.����Сè��
class Cat{
	//2.�����Ա����
	int sum = 20;
	int s = 30;
	
	//3.�����Ա����--��Ա��λ����-->����
	public void eat() {
		//4.�����ֲ�����
		int sum = 10;//�ֲ�����sum
		System.out.println(sum);/**�����ľͽ�ԭ��*/
		/**����Ա������ֲ�����ͬ��ʱ������ͨ��this�ؼ���
		 * ָ����Ա��������Ϊ��Ա������������Դ������ʧ����Ա�����Ż��ͷ�
		 * this������Ǳ��࣬������Cat this = new Cat();*/
		System.out.println(this.sum);//��Ա����this.sum
		System.out.println(s);//��Ա����s
	}
}


