package cn.tedu.oop;

//����ģ��--ͨ��class�ؼ��������ֻ���������
//�ص㣺Ʒ�� ��ɫ �ߴ� �۸�
//���ܣ���绰 ������ ��ֱ��
/**��װ����һ���������������Ϊ��װ��һ�������*/
public class Phone {
	/**�������*/
	static String brand;//Ʒ��
	String color;
	double size;
	double price;
	
	/**��ķ���*/
	//������ʽ�����η�  ����ֵ����  ������(�����б�){������}
	public static void call() {
		System.out.println("��绰");
	}
	
	public void send() {
		System.out.println("������");
	}
	
	public void video() {
		System.out.println("��ֱ��");
	}
	
	public void name(String brand, String color) {
		Phone.brand = brand;
		this.color = color;
	}
}
