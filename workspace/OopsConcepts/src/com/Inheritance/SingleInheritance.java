package com.Inheritance;

class Animal2{
	void sound(){
		System.out.println("Check animal Sounds :");
	}
}
//class Cat extends Animal2{
//	sound();
//}
class Dog extends Animal2{ 
	void makeSound(){
		sound(); // calling sound method from animal class
		System.out.println("Dogs are barking");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.makeSound();
		
	}

}
