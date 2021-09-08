package cn.tedu.basic;

/**本类用于练习类型转换*/
public class ExchangeType {
	public static void main(String[] args) {
		/**小到大，直接转*/
		byte a = 15;
		int b = a;
		System.out.println(b);
		
		float c = 3.14f;
		double d = c;
		System.out.println(d);
		
		/**大到小，强制转*/
		int e = 128;
		byte f = (byte)e;
		System.out.println(f);
		
		int g = 12;
		byte h = (byte) g;
		//12没有超出小类型的范围，所以数据正确
		System.out.println(h);
		
		/**浮变整，小数没*/
		double i = 2.85;
		int j = (int)i;
		System.out.println(j);//2
		
		System.out.println("五条运算规则：");
		/**1、计算结果的数据类型，与最大类型保持一致*/
		System.out.println(3/2);//1，int/int->int
		System.out.println(3d/2);//1.5 double/int->double
		System.out.println(3d/2d);//1.5
		System.out.println(3/2d);//1.5 int/double->double
		System.out.println(3.0/2);//1.5
		
		/**2、byte short char三种比int小的类型
		 * 运算时会先自动提升成int再参与运算*/
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1+b2);//int1+int2=int3
		System.out.println(b3);
		
		/**3、现象：整数运算溢出问题，溢出后数据出错 */
		//需求：已知光速：3亿m/s，求光跑一年的距离
		System.out.println(300000000*60L*60*24*365);
		
		/**4、现象：浮点数运算不精确的问题*/
		System.out.println(1-0.8);
		
		/**5、现象：浮点数的特殊值*/
		System.out.println(10.0/0);//Infinity无穷
		System.out.println(0.0/0.0);//NaN--Not A Number
		
	}
}
