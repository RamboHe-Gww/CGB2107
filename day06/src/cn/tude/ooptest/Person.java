package cn.tude.ooptest;

public class Person {
	String name;
	int age;
	private String grade;
	
	public void study() {
		System.out.println("ѧ");
		sleep();
	}
	
	private void sleep() {
		System.out.println("˯");
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
