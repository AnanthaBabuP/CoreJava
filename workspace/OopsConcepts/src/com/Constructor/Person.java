package com.Constructor;

public class Person {
	String name;
	int age;
	Person(){ // Default Constructor
		name = null;
		age=0;
	}
	
	Person(String n,int a){// parameterized Constructor
		name = n;
		age=a;
	}
	
	Person (Person p){ // Copy Constructor
		name = p.name;
		age = p.age;
	}
	
	void display(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); // Calling Default Constructor
		p1.display();
		
		Person p2 = new Person("Anandh",25); // Calling Parameterized Constructor
		p2.display();
		
		Person p3 = new Person(p1); // Calling Copy Constructor
		p3.display();
	}

}
