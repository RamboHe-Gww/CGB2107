package cn.tude.block;
/**�����������������Ű���*/
public class TestBlock {
	public static void main(String[] args) {
		//˳��
		//��������->���췽��->���󴴽��ɹ�->�ֲ������
		/**1.��������ʱ��������Զ����ù��췽��������й�������
		 * ������ִ�й���������ȡ���й���Ĺ��Թ��ܣ���ִ�й��췽����������
		 * 2.���󴴽��ú󣬿���ͨ��������÷��������������оֲ�����飬�ͻ�ִ�ж�Ӧ�ľֲ������*/
		Teacher teach = new Teacher();
		m();
		Teacher teach1 = new Teacher("CGB");
		m();
		teach.teach();
		m();
		teach1.teach();	
	}
	
	public static void m() {
		System.out.println("--------------------------");
	}
}

//1.����һ����ʦ��
class Teacher{
	//2.������ʦ�������
	String course = "Java-CGB";//course--����--��Ա����
	String subject;
	//5.���幹������
	/*�������飺
	 * λ�ã����﷽����
	 * ִ��ʱ����ÿ���ڵ��ù��췽��ʱ���������������빹�췽��ִ��
	 * ���ã�������ȡ���й��췽���Ĺ��Թ���*/
	{
//		course = "Java-CGB";
		subject = "Python";
		System.out.println("���ǹ�������");
	}
	
	//3.1����������޲ι���
	public Teacher() {
		System.out.println("Teacher...�޲ι���"+course);
	}
	
	//3.2��������ĺ��ι��죬������course
	public Teacher(String c) {
		System.out.println("Teacher...���ι���"+course);
//		course = c;
//		System.out.println("Teacher...���ι���"+course);
		
	}
	
	//4.������ͨ����
	//���η� ����ֵ���� ������(�����б�){������}
	public void teach() {
		System.out.println("�����ڿ�ing...");
		//6.����ֲ������
		/*�ֲ������
		 * λ�ã�������
		 * ִ��ʱ�������ñ���������ڵķ���ʱ���Żᴥ��
		 * ���ã����Ʊ��������÷�Χ������������ԽСԽ��*/
		{
			int i = 10;
			System.out.println("�ֲ������"+i);
		}
	}
}
