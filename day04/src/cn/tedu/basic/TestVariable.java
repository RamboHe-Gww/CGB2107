package cn.tedu.basic;
/**�������ڲ��Բ�ͬ���ͱ�����Ĭ��ֵ*/
public class TestVariable {
	int e;//��static���Σ���Ա����
	static String name;//��static���Σ������
	static byte a;
	static short b;
	static int c;
	static long d;
	static float f;
	static double g;
	static char h;
	static boolean i;
	
	public static void main(String[] args) {
		/**��������Ĭ��ֵΪ��null
		 * ���͵�Ĭ��ֵΪ��0
		 * �����͵�Ĭ��ֵΪ��0.0
		 * �������͵�Ĭ��ֵΪ��false
		 * �ַ��͵�Ĭ��ֵΪ\u0000������Ϊһ���ո�*/
		System.out.println(name);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		demo();
	}
	
	public static void demo() {
		int e = 100;
		System.out.println(e);
	}
}
