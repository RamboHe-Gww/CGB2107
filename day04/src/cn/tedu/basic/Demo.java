package cn.tedu.basic;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		for(int i = 1;i <= 100; i++) {
			//��ÿһ��ѭ���ж�Ҫ��ʾ�������û����������
			System.out.println("����������:");
			int input = new Scanner(System.in).nextInt();
			if(input != 88) {//�û�����Ĳ���88
				continue;//ֱ�Ӽ�������
				/**ע��,�����ǲ��Ǽ�continue,�������ڲ²��Ե�����¼�������
				 * ֻ��������continue��Ч�ʸ���,ֻҪ���ݲ�����88,������ִ�к���Ĵ���
				 * ֱ�ӽ�����һ�ֵĲ����ּ���* */
			/**break����continue֮�󶼲�����д����,���ǲ��ɵ���Ĵ���*/
			//System.out.println(0);//Unreachable code
			}
			System.out.println("������������continue��û������ѭ����벿�ִ����Ŷ");
			if(input == 88) {//�ҵ�88��
				System.out.println("��ϲ��,�¶���!");
				break;//��������
				//System.out.println(0);//Unreachable code
			}
		}
	}
}
