package cn.tedu.forDemo;
/**�������ڽ�һ����ϰѭ���ṹ*/
public class TestFor2 {
	public static void main(String[] args) {
		//�������1-100�����������ĺ�
		int sum = 0;
		for (int i = 0; i < 101; i++) {
				sum+=i;
		}
		System.out.println("1-100�ĺ�Ϊ��"+sum);
		
		//�������1-100��������ż���ĺ�
		sum = 0;//����sum��ֵΪ0
		for (int i = 0; i <= 100; i=i+2) {
				sum+=i;
		}
		System.out.println("1-100���ڵ�ż����Ϊ��"+sum);
		
		//������1-100���������ĸ���
		int count=0;
		for (int i = 1; i < 101; i++) {
			if (i%2!=0) {
				count++;
				//count=count+1;
				//++count;
			}
		}
		System.out.println("1-100���������ĸ���Ϊ��"+count);
	}
}
