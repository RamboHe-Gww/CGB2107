package cn.tedu.basic;

import java.util.Scanner;

/**����������ϰ��Ʒ���۰���*/
public class TestDiscount {
	public static void main(String[] args) {
		//���󣺽����û��������Ʒ�۸���10000����ۣ���5000��5�ۣ���3000��8�ۣ���1000��9�ۣ����۲�������Ľ�����
		Scanner input = new Scanner(System.in);
		System.out.println("�û������ԭ�ۣ�");
		double price = input.nextDouble();
		double result = price;
		input.close();
		if (price>=10000) {
			result = price*0.1;
		}else if (price>=5000) {
			result = price*0.5;
		}else if (price>=3000) {
			result = price*0.8;
		}else if (price>=1000) {
			result = price*0.9;
		}
		System.out.println("����ԭ��Ϊ��"+price+"ʵ��֧���۸�Ϊ��"
				+result);
		
	}

}
