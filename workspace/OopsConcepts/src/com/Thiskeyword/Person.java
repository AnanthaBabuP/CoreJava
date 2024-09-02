package com.Thiskeyword;

public class Person {
	private String name;
	private int age;
	Person(String name,int age){
		/*
		 name = name;
		 age = age;
		 */
		this.name = name;
		this.age  = age;
	}
	
	void display(){
		System.out.println("name :" + name);
		System.out.println("Age : "+ age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Guru", 21);
		p.display();
	}

}
