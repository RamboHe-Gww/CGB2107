package cn.tedu.oop;
/**��������OOP���Ű���*/
public class TestCreateClass {
	public static void main(String[] args) {
		//newһ���µ�Phone�����p
		Phone.brand = "��Ϊ";
		Phone p = new Phone();
		//����Phone��ķ���
		Phone.call();
		p.send();
		p.video();
		//����Phone�������
//		p.brand = "aaa";
		System.out.println(Phone.brand);
		System.out.println(p.color);
		System.out.println(p.size);
		System.out.println(p.price);
		
		//new��2������
		Phone p2 = new Phone();
//		Phone.brand = "��Ϊ";
		p2.color = "black";
		p2.size = 5.2;
		p2.price = 3000.0;
		System.out.println(Phone.brand);
		System.out.println(p2.color);
		System.out.println(p2.size);
		System.out.println(p2.price);
	}
	
}

////����ģ��--ͨ��class�ؼ��������ֻ���������
////�ص㣺Ʒ�� ��ɫ �ߴ� �۸�
////���ܣ���绰 ������ ��ֱ��
///**��װ����һ���������������Ϊ��װ��һ�������*/
//class Phone{
//	/**�������*/
//	static String brand;//Ʒ��
//	String color;
//	double size;
//	double price;
//	
//	/**��ķ���*/
//	//������ʽ�����η�  ����ֵ����  ������(�����б�){������}
//	public static void call() {
//		System.out.println("��绰");
//	}
//	
//	public void send() {
//		System.out.println("������");
//	}
//	
//	public void video() {
//		System.out.println("��ֱ��");
//	}
//	
//	public void name(String brand, String color) {
//		Phone.brand = brand;
//		this.color = color;
//	}
//	
//}
