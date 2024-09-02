package com.AccessorMutatorMethod;

public class AccessorMutorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		/*
		p1.name = "Anandh"; //Error
		p1.age = 21; // ERROR
		*/
		p1.setName("Anandh");
		p1.setAge(25);
		System.out.println("Name : "+ p1.getName());
		System.out.println("Age : "+p1.getAge());
	}

}
