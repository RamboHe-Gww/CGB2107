package cn.tedu.basic;

import java.util.Scanner;

/**����������ƽ�����갸��*/
public class TestYear {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ�жϵ���ݣ�");
		int year = input.nextInt();
		String result = "ƽ��";
		/**����֧�ṹ��
		 * if(�ж�����){�����ж�������Ҫִ�еĴ��� }
		 * */
		if ((year%4==0 && year%100 !=0) || year%400==0) {
			result = "����";
		}
		System.out.println(year+result);
//		if ((year%4==0 && year%100 !=0)||(year%400==0)) {
//			result = "����";
//			System.out.println(year+result);
//		}else {
//			result = "ƽ��";
//			System.out.println(year+result);
//		}
		input.close();
	}
}

