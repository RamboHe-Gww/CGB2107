package cn.tedu.basic;
/**�������ڲ��������*/
public class TestOperator {
	public static void main(String[] args) {
		System.out.println(25/10);//2
		System.out.println(25%10);//5��ȡ����
		
		int x = 59;
		System.out.println(x/10);//��ӡʮλ
		System.out.println(x%10);//��ӡ��λ
		
		int y = 147;
		System.out.println(y/100);//��ӡ��λ
		System.out.println(y%100/10);//��ӡʮλ
		System.out.println(y%10);//��ӡ��λ
		
		/**�����Լ������--�����ı���������ֵ
		 * ++ ��ʾ������ֵ+1   --  ��ʾ������ֵ-1
		 * ��׺ʽ��a++ a--   �����ں���ʹ�ñ������ٸ�������ֵ
		 * ǰ׺ʽ��++a --a   ������ǰ���ȸı������ֵ����ʹ�ñ���
		 * */
		System.out.println("----------------------------------");
		
		int a = 1;
		System.out.println(a++);//1�������ں���ʹ���ٱ仯
		System.out.println(a);//��ӡ����������2
		
		int b = 1;
		System.out.println(++b);//2��������ǰ���ȱ仯��ʹ��
		
		int c = 1;
		System.out.println(--c);
		System.out.println(c);
		/**ǰ��Ĵ����Ժ���Ĵ������Ӱ��*/
		/**��ͨ���������㲻��ı���������ֵ*/
		System.out.println(--c-c-c--);
		System.out.println(c);
		
		int d = 1;
		System.out.println(d--);//1
		System.out.println(d);//0
	}
}
