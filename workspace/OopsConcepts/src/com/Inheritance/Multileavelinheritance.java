package com.Inheritance;


class DomasticAnimal extends Animal{
	void eating(){
		sound(); // calling sound method from animal class
		System.out.println("Eating vegitable occubationly Eating non-veg");
	}
}

class Cat extends DomasticAnimal{
	void makeSound(){
		eating();
		System.out.println("Cat are Bowing...");
		type = "Hiper Active..";
		System.out.println("Animal Type is : "+type);
	}
}
public class Multileavelinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.makeSound();
	}

}
