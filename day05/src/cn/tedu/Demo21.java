package cn.tedu;
import java.util.Scanner;
/**
* @author YFLin
* @date ����ʱ�䣺2021-8-4 15:47:55
* �����û����������,�ж��ڴ˷�Χ�������ĸ���
*/
public class Demo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num1=getshang();
        int num2=getxia();
        zhishuNum(num1,num2);
	}
	private static void zhishuNum(int num1, int num2) {
		// TODO Auto-generated method stub
		int count = 0;
		boolean tip = true;
		for(int i =num2;i<num1;i++) {
			tip = true;
			for(int j =2;j<i;j++) {
				if(i%j==0) {
					tip=false;
					break;
				}
			}
			if (tip) {
				count++;
			}
		}
		System.out.println("��"+num1+"��"+num2+"�ķ�Χ�ڣ�������"+count+"��");
	}

	@SuppressWarnings("resource")
	private static int getxia() {
		// TODO Auto-generated method stub
		System.out.println("���������ޣ�");
		int num2 = new Scanner(System.in).nextInt();
		return num2;
	}

	@SuppressWarnings("resource")
	private static int  getshang() {
		// TODO Auto-generated method stub
		System.out.println("���������ޣ�");
		int num1 = new Scanner(System.in).nextInt();
		return num1;
	}

}
