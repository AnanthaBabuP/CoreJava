package com.CollectionSetinterface;

public class Student {
	
	String name;
	int mark;
	int age;
	
	public Student(String name, int mark, int age) {
		super();
		this.name = name;
		this.mark = mark;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + ", age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return age;
	}
	
	@Override
	public boolean equals(Object x) {
		// TODO Auto-generated method stub
		if(!(x instanceof Student))
			return false;
		else {
			Student s1 = (Student)x; // Downcasting
			return name.equals(s1.name) && mark == s1.mark && age == age;
		}
	}
}
