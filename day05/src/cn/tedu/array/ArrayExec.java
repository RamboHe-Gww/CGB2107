package cn.tedu.array;
/**����������ϰ����ı���*/
//�������һ����ÿһ���·ݵ��������磺1����31��
public class ArrayExec {
	public static void main(String[] args) {
		int[] a = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			System.out.println((i+1)+"����"+a[i]+"��");
		}
	}
}
