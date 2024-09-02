package com.Abstaction;

public class AbstactionTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vahicle v;
		BiCycle obj1 = new BiCycle();
		v= obj1;
		System.out.println("Display BiCycle");
		v.speedUp(6);
		v.gearUp(5);
		v.handleBrack(2);
		obj1.display();
		
		Bike obj2 = new Bike();
		v= obj2;
		System.out.println("Display BiCycle");
		v.speedUp(6);
		v.gearUp(5);
		v.handleBrack(2);
		obj2.display();
		
	}

}
