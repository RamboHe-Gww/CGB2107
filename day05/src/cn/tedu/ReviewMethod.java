package cn.tedu;

public class ReviewMethod {
	public static void main(String[] args) {
		//����ִ�е�������main()�����Ƶģ��Ƿ�����Լ�����˳��
		//��main������ͨ��"������+(�����б�)"��ʽ���÷���
		m1();
		
		m2("ram",24);
		
		int n = m3();//����ӷ���ֵ��main()�Ϳ���ʹ���������ֵ
		System.out.println(n);
	}
	
	//���������Ҫ����һ��ֵ����ô��Ҫ�޸ķ���ֵ����
	//����ͨ��return�ؼ��ַ��ؽ��
	private static int m3() {
		
		return 666;
	}

	//�����Ĳ����б������ɵģ��޲�/��1��/����Σ�����֮���ö��Ÿ���
	private static void m2(String name, int age) {
		System.out.println(name+"����"+age+"��");
	}

	//��ʽ�����������η�  ����ֵ����  ������(�����б�){���������}
	private static void m1() {
		System.out.println(1);
	}
}
