package cn.tude.oop;
/**����������ϰ���췽��2*/
public class TestConstructor2 {
	public static void main(String[] args) {
		/**һ������Ĭ�ϴ����޲ι��죬������������������Ĺ��췽��
		 * Ĭ�ϵ��޲ι���ᱻ���ǣ�����Ϊ�˴������󷽱㣬��Ҫ�ֶ�����޲ι���*/
		//4.ͨ���޲ι��촴���������dog1
		Dog dog1 = new Dog();
		System.out.println(dog1);
		//5.ͨ���вι��촴���������dog
		Dog dog = new Dog("����", 3, "ram");
		System.out.println(dog);
	}
}

//1.����С����
class Dog{
	//2.����С���������
	String name;
	int age;
	String host;
	
	//6.������޲ι���
	public Dog() {
		
	}
	
	//3.����ĺ��ι���
	public Dog(String name, int age, String host) {
		System.out.println("ȫ�ι��죬С������"+name+","+age+"��"
				+ "������"+host);
		this.name = name;
		this.age = age;
		this.host = host;
	}
	
	
}
