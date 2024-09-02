package com.GarpageColletion;

public class Student {

	int rollNo;
	String name;
	int age;
	public Student(int rollNo, String name, int age) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(" Corbage Collected...");
	}
}
