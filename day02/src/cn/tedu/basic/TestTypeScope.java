package cn.tedu.basic;

/**����������ϰ��ӡ�������͵�ȡֵ��Χ*/
public class TestTypeScope {
	public static void main(String[] args) {
		byte byteMin = Byte.MIN_VALUE;
		byte byteMax = Byte.MAX_VALUE;
		System.out.println("byte������Сֵ�ǣ�"+byteMin);
		System.out.println("byte�������ֵ�ǣ�"+byteMax);
		
		System.out.println("-----------------------------");
		
		short shortMin = Short.MIN_VALUE;
		short shortMax = Short.MAX_VALUE;
		System.out.println("������Сֵ�ǣ�"+shortMin);
		System.out.println("�������ֵ�ǣ�"+shortMax);
		
		System.out.println("-----------------------------");
		
		int intMin = Integer.MIN_VALUE;
		int intMax = Integer.MAX_VALUE;
		System.out.println("������Сֵ�ǣ�"+intMin);
		System.out.println("�������ֵ�ǣ�"+intMax);
		
		System.out.println("-----------------------------");
		
		long longMin = Long.MIN_VALUE;
		long longMax = Long.MAX_VALUE;
		System.out.println("Long������Сֵ�ǣ�"+longMin);
		System.out.println("Long�������ֵ�ǣ�"+longMax);
		
		System.out.println("-----------------------------");
		
		float floatMin = Float.MIN_VALUE;
		float floatMax = Float.MAX_VALUE;
		System.out.println("float������Сֵ�ǣ�"+floatMin);
		System.out.println("float�������ֵ�ǣ�"+floatMax);
		
		System.out.println("-----------------------------");
		
		double doubleMin = Double.MIN_VALUE;
		double doubleMax = Double.MAX_VALUE;
		System.out.println("double������Сֵ�ǣ�"+doubleMin);
		System.out.println("double�������ֵ�ǣ�"+doubleMax);
		
		System.out.println("-----------------------------");
		
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
		/**char���͵�������Ҫʹ�� ' ' �����Ű�����char���ͱ����ʱ�����ַ�*/
		/**���char���ͱ���������֣���ȥASCII����в�ѯ*/
		char c1 = 'a';
		char c2 = 97;
		char c3 = '��';
		char c4 = '9';
		char c5 = 56;
		
		System.out.println("-----------------------------");
		System.out.println(c1);//a
		System.out.println(c2);//a
		System.out.println(c3);//��
		System.out.println(c4);//9
		System.out.println(c5);//8
		
		
	}
}
