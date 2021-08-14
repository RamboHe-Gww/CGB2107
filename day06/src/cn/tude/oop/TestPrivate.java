package cn.tude.oop;
/**本类用于测试封装*/
/**一个java文件中可以创建多个class，但是被public修饰的类只能有一个
 * 并且这个java文件的名字与此公共类的名字一致*/
/*总结：
 * 1》属性的封装：加private提供公共的set和get方法，供外界获取/设置属性
 * 2》方法的封装：加private在本类的公共方法调用这个私有方法
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

//1、准备学生这类事物的模板--通过class关键字
/**封装：将一类事物的特征与行为封装成一个类组件*/
class Student{
	/**前提：为了提高程序的安全性以及调用要按照我们指定的方式来调用
	 * 所以我们可以封装自己定义类的属性和方法*/
	//2、定义属性--成员变量
	String name;
	int sno;
	/**封装属性：在属性前加private
	 * 被private修饰的资源，只能在本类中使用*/
	private String subject;
	
	/**添加被private修饰变量的get和set方法，给外界提供公共属性获取/设置的方式*/
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	//3、定义功能--方法
	public void study() {
		System.out.println("学习");
		/**在本类的公共方法中访问私有方法*/
		eat();
	}
	
	/**方法的封装：将方法的访问修饰符修改为private*/
	private void eat() {
		System.out.println("干饭");
	}
}

