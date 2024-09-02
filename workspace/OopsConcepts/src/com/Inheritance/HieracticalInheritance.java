package com.Inheritance;

class DomasticAnimal1 extends Animal{
	void eating(){
		sound(); // calling sound method from animal class
		System.out.println("Eating vegitable");
	}
}

class WildAnimal extends Animal{
	void eating(){
		sound(); // calling sound method from animal class
		System.out.println("Eating non-vegitarian");
	}
}

public class HieracticalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DomasticAnimal1 d = new DomasticAnimal1();
		d.eating();
		WildAnimal w = new WildAnimal();
		w.eating();
	}

}
