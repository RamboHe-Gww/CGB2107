package cn.tedu.forDemo;
/**本类用于for循环入门案例*/
public class ForDemo {
	public static void main(String[] args) {
		//需求：打印10次欢迎语句：小可爱们今天也要加油。
		//格式：for(开始条件;循环条件;更改条件){循环体}
		/*一个循环究竟执行几次，取决于循环变量可以取到几个值*/
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//需求：打印0-10到控制台，循环执行了11次
		for (int i=0;i<11;i++) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//需求：打印10-1到控制台
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		
		System.out.println("------------");
		
		//需求：打印8,88,888,8888
		for (int i=8;i<=8888;i=i*10+8) {
			System.out.print(i+",");
		}
	}
}
