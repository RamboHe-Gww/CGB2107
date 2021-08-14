package cn.tude.oop;
/**�������ڲ��Է�װ*/
/**һ��java�ļ��п��Դ������class�����Ǳ�public���ε���ֻ����һ��
 * �������java�ļ���������˹����������һ��*/
/*�ܽ᣺
 * 1�����Եķ�װ����private�ṩ������set��get������������ȡ/��������
 * 2�������ķ�װ����private�ڱ���Ĺ��������������˽�з���
 * */
import cn.tude.ooptest.Person;

public class TestPrivate {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.name = "aaa";
		s.sno = 41;
		System.out.println(s.name);
		System.out.println(s.sno);
		
		s.setSubject("Java");
		System.out.println(s.getSubject());
		
		s.study();
		
		Person p = new Person();
		p.setGrade("2107");
		System.out.println(p.getGrade());
		p.study();
		
		
	}
}

//1��׼��ѧ�����������ģ��--ͨ��class�ؼ���
/**��װ����һ���������������Ϊ��װ��һ�������*/
class Student{
	/**ǰ�᣺Ϊ����߳���İ�ȫ���Լ�����Ҫ��������ָ���ķ�ʽ������
	 * �������ǿ��Է�װ�Լ�����������Ժͷ���*/
	//2����������--��Ա����
	String name;
	int sno;
	/**��װ���ԣ�������ǰ��private
	 * ��private���ε���Դ��ֻ���ڱ�����ʹ��*/
	private String subject;
	
	/**��ӱ�private���α�����get��set������������ṩ�������Ի�ȡ/���õķ�ʽ*/
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	//3�����幦��--����
	public void study() {
		System.out.println("ѧϰ");
		/**�ڱ���Ĺ��������з���˽�з���*/
		eat();
	}
	
	/**�����ķ�װ���������ķ������η��޸�Ϊprivate*/
	private void eat() {
		System.out.println("�ɷ�");
	}
}

