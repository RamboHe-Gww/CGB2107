package cn.tedu.array;

import java.util.Arrays;

/**������������Ĵ���*/
public class TestCreateArray {
	public static void main(String[] args) {
		//1����̬����
		char[] c2 = new char[] {'h','e','l','l','o'};
		char[] c1 = {'h','e','l','l','o'};
		//2����̬����
		char[] c3 = new char[5];
		/**ͨ��������±��������ľ���Ԫ�أ�ע�������±��0��ʼ*/
		c3[0] = 'h';
		c3[1] = 'e';
		c3[2] = 'l';
		c3[3] = 'l';
		c3[4] = 'o';

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(Arrays.toString(c1));
		
		String[] s = {"a","b","c"};
		/**sΪ�������ͱ��������������ֵַ
		 * ����Java��char�������˵ײ㴦������char[]����ֱ�Ӵ�ӡ��������
		 * ����char���ͣ������κ����͵�������Ҫ�鿴�����еľ���Ԫ��
		 * ��Ҫʹ������Ĺ�����Arrays��toString(������)�����*/
		System.out.println(s);
		System.out.println(Arrays.toString(s));
 	}
}
