package com.AbstactClass;

public abstract class Animal {
	
	Animal(){
		
	}
	abstract void makeSound();
	abstract void eating();
	
	void moving() {
		System.out.println("Animals are moving..");
	}
}

class Dog extends Animal{ // Subclass-1
	@Override
	void makeSound() {
		System.out.println("Dogs Are Barking...");
	}
	
	@Override
	void eating() {
		System.out.println("Dog Are Eating Food and Bones..");
	}
}

class Cat extends Animal{ // subclass-2
	@Override
	void makeSound() {
		System.out.println("Cat Are Meowing...");
	}
	
	@Override
	void eating() {
		System.out.println("Cat Are Eating Fish..");
	}
}
