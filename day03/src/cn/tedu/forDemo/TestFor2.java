package cn.tedu.forDemo;
/**本类用于进一步练习循环结构*/
public class TestFor2 {
	public static void main(String[] args) {
		//需求：求出1-100以内所有数的和
		int sum = 0;
		for (int i = 0; i < 101; i++) {
				sum+=i;
		}
		System.out.println("1-100的和为："+sum);
		
		//需求：求出1-100以内所有偶数的和
		sum = 0;//重置sum的值为0
		for (int i = 0; i <= 100; i=i+2) {
				sum+=i;
		}
		System.out.println("1-100以内的偶数和为："+sum);
		
		//需求：求1-100以内奇数的个数
		int count=0;
		for (int i = 1; i < 101; i++) {
			if (i%2!=0) {
				count++;
				//count=count+1;
				//++count;
			}
		}
		System.out.println("1-100以内奇数的个数为："+count);
	}
}
