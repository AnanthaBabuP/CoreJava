package com.AccessorMutatorMethod;

public class Person {
	private String name;
	private int age;
	
	// Setter Method
	void setName(String name){
		this.name = name;
	}
	
	void setAge(int age){
		this.age = age;
	}
	
	// getter Method
	String getName(){
		return name;
	}
	int getAge(){
		return age;
	}
}
