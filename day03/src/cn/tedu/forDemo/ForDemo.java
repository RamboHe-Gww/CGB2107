package cn.tedu.forDemo;
/**��������forѭ�����Ű���*/
public class ForDemo {
	public static void main(String[] args) {
		//���󣺴�ӡ10�λ�ӭ��䣺С�ɰ��ǽ���ҲҪ���͡�
		//��ʽ��for(��ʼ����;ѭ������;��������){ѭ����}
		/*һ��ѭ������ִ�м��Σ�ȡ����ѭ����������ȡ������ֵ*/
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//���󣺴�ӡ0-10������̨��ѭ��ִ����11��
		for (int i=0;i<11;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//���󣺴�ӡ10-1������̨
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//���󣺴�ӡ8,88,888,8888
		for (int i=8;i<=8888;i=i*10+8) {
			System.out.print(i+",");
		}
	}
}
