package cn.tedu.basic;

/**�������ڲ���ѡ��ṹswitch*/


public class TestSwitch {
	public static void main(String[] args) {
		//1������һ������
		int a = 3;
		//2�����ѡ��ṹ
		/**�ܽ᣺
		 * 1������a֧�ֵ����ͣ�byte short char int String
		 * 2��ִ��˳����a������ֵ������ÿ��case���ֵ���Ƚϣ��������break��������������case������default
		 * 3����������ˡ�����ѡ��default��������û���κ�case��ƥ�䵽�Ļ���ִ�б���ѡ������
		 * 4��break��default�ǿ�ѡ�ģ������Լ���ҵ���������ӻ򲻼�
		 * */
		switch (a) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		case 4:
			System.out.println(4);
			break;
		default:
			System.out.println(0);
		}
		
		
		String s = "���ڶ�";
		switch (s) {
		case "����һ":
			System.out.println("���");
			break;
		case "���ڶ�":
			System.out.println("����");
			break;
		case "������":
			System.out.println("С��Ϻ");
			break;
		case "������":
			System.out.println("ţ��");
			break;
		case "������":
			System.out.println("ɰ����");
			break;
		default:System.out.println("����ɶ��ɶ");
		}
	}
}
