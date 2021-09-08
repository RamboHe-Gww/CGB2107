package cn.tedu.basic;

/**本类用于测试选择结构switch*/


public class TestSwitch {
	public static void main(String[] args) {
		//1、定义一个变量
		int a = 3;
		//2、完成选择结构
		/**总结：
		 * 1、变量a支持的类型：byte short char int String
		 * 2、执行顺序：用a变量的值依次与每个case后的值作比较，如果不加break，会向后输出所有case，包括default
		 * 3、如果设置了“保底选项default”，并且没有任何case被匹配到的话会执行保底选项内容
		 * 4、break与default是可选的，根据自己的业务来决定加或不加
		 * */
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println(0);
		}
		
		
		String s = "星期二";
		switch (s) {
		case "星期一":
			System.out.println("火锅");
			break;
		case "星期二":
			System.out.println("橙子");
			break;
		case "星期三":
			System.out.println("小龙虾");
			break;
		case "星期四":
			System.out.println("牛腩");
			break;
		case "星期五":
			System.out.println("砂锅粥");
			break;
		default:System.out.println("爱吃啥吃啥");
		}
	}
}
