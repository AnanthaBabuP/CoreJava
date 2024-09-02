package com.AbstactClass;

public class AbstacctClassTesting {

	public static void main (String[] args) {
		// new Animal(); // cannot create abstract class
		Animal a = new Dog(); //UpCasting
		a.makeSound();
		a.eating();
		
		Animal b = new Cat(); //UpCasting
		b.makeSound();
		b.eating();
	}
}
