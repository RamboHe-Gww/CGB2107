package cn.tedu;
import java.util.Scanner;
/**
* @author YFLin
* @date 创建时间：2021-8-4 15:47:55
* 接收用户输入的数字,判断在此范围内质数的个数
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
		System.out.println("在"+num1+"到"+num2+"的范围内，质数有"+count+"个");
	}

	@SuppressWarnings("resource")
	private static int getxia() {
		// TODO Auto-generated method stub
		System.out.println("请输入下限：");
		int num2 = new Scanner(System.in).nextInt();
		return num2;
	}

	@SuppressWarnings("resource")
	private static int  getshang() {
		// TODO Auto-generated method stub
		System.out.println("请输入上限：");
		int num1 = new Scanner(System.in).nextInt();
		return num1;
	}

}
