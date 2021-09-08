package cn.tedu.basic;

/**本类用于练习打印基本类型的取值范围*/
public class TestTypeScope {
	public static void main(String[] args) {
		byte byteMin = Byte.MIN_VALUE;
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("byte类型最小值是："+byteMin);
		System.out.println("byte类型最大值是："+byteMax);
		
		System.out.println("-----------------------------");
		
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		System.out.println("类型最小值是："+shortMin);
		System.out.println("类型最大值是："+shortMax);
		
		System.out.println("-----------------------------");
		
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		System.out.println("类型最小值是："+intMin);
		System.out.println("类型最大值是："+intMax);
		
		System.out.println("-----------------------------");
		
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("Long类型最小值是："+longMin);
		System.out.println("Long类型最大值是："+longMax);
		
		System.out.println("-----------------------------");
		
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		System.out.println("float类型最小值是："+floatMin);
		System.out.println("float类型最大值是："+floatMax);
		
		System.out.println("-----------------------------");
		
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		System.out.println("double类型最小值是："+doubleMin);
		System.out.println("double类型最大值是："+doubleMax);
		
		System.out.println("-----------------------------");
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		/**char类型的数据需要使用 ' ' 单引号包裹，char类型保存的时单个字符*/
		/**如果char类型保存的是数字，会去ASCII码表中查询*/
		char c1 = 'a';
		char c2 = 97;
		char c3 = '中';
		char c4 = '9';
		char c5 = 56;
		
		System.out.println("-----------------------------");
		System.out.println(c1);//a
		System.out.println(c2);//a
		System.out.println(c3);//中
		System.out.println(c4);//9
		System.out.println(c5);//8
		
		
	}
}
