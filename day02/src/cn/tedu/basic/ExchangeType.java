package cn.tedu.basic;

/**����������ϰ����ת��*/
public class ExchangeType {
	public static void main(String[] args) {
		/**С����ֱ��ת*/
		byte a = 15;
		int b = a;
		System.out.println(b);
		
		float c = 3.14f;
		double d = c;
		System.out.println(d);
		
		/**��С��ǿ��ת*/
		int e = 128;
		byte f = (byte)e;
		System.out.println(f);
		
		int g = 12;
		byte h = (byte) g;
		//12û�г���С���͵ķ�Χ������������ȷ
		System.out.println(h);
		
		/**��������С��û*/
		double i = 2.85;
		int j = (int)i;
		System.out.println(j);//2
		
		System.out.println("�����������");
		/**1�����������������ͣ���������ͱ���һ��*/
		System.out.println(3/2);//1��int/int->int
		System.out.println(3d/2);//1.5 double/int->double
		System.out.println(3d/2d);//1.5
		System.out.println(3/2d);//1.5 int/double->double
		System.out.println(3.0/2);//1.5
		
		/**2��byte short char���ֱ�intС������
		 * ����ʱ�����Զ�������int�ٲ�������*/
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte)(b1+b2);//int1+int2=int3
		System.out.println(b3);
		
		/**3��������������������⣬��������ݳ��� */
		//������֪���٣�3��m/s�������һ��ľ���
		System.out.println(300000000*60L*60*24*365);
		
		/**4�����󣺸��������㲻��ȷ������*/
		System.out.println(1-0.8);
		
		/**5�����󣺸�����������ֵ*/
		System.out.println(10.0/0);//Infinity����
		System.out.println(0.0/0.0);//NaN--Not A Number
		
	}
}
