package cn.tedu.basic;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		for(int i = 1;i <= 100; i++) {
			//在每一次循环中都要提示并接收用户输入的数字
			System.out.println("请输入数字:");
			int input = new Scanner(System.in).nextInt();
			if(input != 88) {//用户输入的不是88
				continue;//直接继续输入
				/**注意,不管是不是加continue,都可以在猜不对的情况下继续输入
				 * 只不过加了continue后效率更高,只要数据不等于88,就无需执行后面的代码
				 * 直接进行下一轮的猜数字即可* */
			/**break或者continue之后都不允许写代码,都是不可到达的代码*/
			//System.out.println(0);//Unreachable code
			}
			System.out.println("我是用来测试continue有没有跳过循环后半部分代码的哦");
			if(input == 88) {//找到88了
				System.out.println("恭喜您,猜对了!");
				break;//结束程序
				//System.out.println(0);//Unreachable code
			}
		}
	}
}
