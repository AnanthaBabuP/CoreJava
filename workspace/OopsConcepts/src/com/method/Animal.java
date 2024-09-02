package com.method;

public class Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		a.move("Elephant");
		a.makeSound();
		a.makeSound();
	}
	
	void move(String name){ // name is local parameter
		// name is used for only inside method
		System.out.println(name+" Animal moving"); 
	}
	void makeSound(){
		System.out.println("Animal make sound");
		
	}
	void eatingFood(){
		System.out.println("Animal Eating foot");
		
	}

}
