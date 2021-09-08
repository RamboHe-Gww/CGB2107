package cn.tedu.basic;

import java.util.Scanner;

/**本类用于练习商品打折案例*/
public class TestDiscount {
	public static void main(String[] args) {
		//需求：接收用户输入的商品价格，满10000打骨折，满5000打5折，满3000打8折，满1000打9折，打折并将计算的结果输出
		Scanner input = new Scanner(System.in);
		System.out.println("用户输入的原价：");
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
		System.out.println("您的原价为："+price+"实际支付价格为："
				+result);
		
	}

}
