package cn.tedu.basic;
/**�������ڽ�һ�����Ա�����ʹ��*/
public class TestVariable2 {
	/**2����Ա����
	 * 1��λ�ã����﷽����
	 * 2��ʹ�÷�Χ�����������ж�����Ч������ʧ�������Ż��ͷ�
	 * 3��ע����������ֶ���ʼ�������Զ������Ӧ���͵�Ĭ��ֵ
	 * */
	static int sum = 200;
	static int count;
	
	public static void main(String[] args){
		System.out.println(count);
		System.out.println(sum);
		/**1���ֲ�����
		 * 1��λ�ã��ڷ�����/�ֲ��������
		 * 2��δ�÷�Χ�������ﶨ���������ʹ��
		 * ����Ӧ�ķ���/�ֲ����������󣬶�Ӧ�ľֲ�����Ҳ�ᱻ�ͷ�
		 *3�� ע������ֲ����������ֶ���ʼ��--��ֵ*/
		int sum = 100;
		System.out.println(sum);/**�����оͽ�ԭ��*/
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}
//		System.out.println(i);
		//�ᱨ����Ϊ�ֲ�����iֻ����forѭ�������ʹ��
	}
}
