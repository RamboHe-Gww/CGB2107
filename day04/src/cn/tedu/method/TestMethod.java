package cn.tedu.method;
/**�����������������Ű���*/
public class TestMethod {
	/**public�Ƿ��������η�����ʾ�����ģ���˭������ʹ���������
	 * privateҲ�Ƿ��������η�����ʾ˽�еģ�˽����Դֻ���ڱ���ʹ��*/
	public static void main(String[] args) {
		/**���÷����ĸ�ʽ��������(�����б�)*/
		method1();
		System.out.println(666);
		method1();
		System.out.println(999);
		
		method2(5,5);
		
		method3("�ɴ���",5);
	}
	
	//���������ڽ�һ����ϰ�����Ĳ���
	private static void method3(String name, int i) {
		System.out.println(name+"��������Ҫ����"+i+"����׷�");
	}

	//���������ڲ��Է����Ĳ���
	/**�����Ķ����൱�ڷ����ġ�˵���顱�������ʱ����ô���壬���õ�ʱ�����Ҫ���ն��������ã���������������˲��������÷���ʱ���밴�ն���Ĳ���������������������򱨴������б��ж���������ö��Ÿ���*/
	private static void method2(int a, int b) {
		System.out.println(a+b);
//		System.out.println("���౦������"+age+"��");
	}

	/**��������ĸ�ʽ��
	 * ���������η�  ��̬���η�  ����ֵ����  ������( �����б� )  { ������ }*/
	private static void method1() {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
	}
}
