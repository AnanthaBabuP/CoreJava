package com.Sample;

public class ReturningObject {
	
	
	String name;
	double price;
	int model;
	
	ReturningObject(){
		System.out.println("Constroctor Inside");
	}
	
	static ReturningObject getCar(){
		ReturningObject pass = new ReturningObject(); // call Constructor
		pass.name = "Swift";
		pass.price = 150000;
		pass.model = 2017;
		return pass;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturningObject c = getCar();
		System.out.println("Car Name = "+c.name);
		System.out.println("Car price= "+ c.price);
		System.out.println("Car model= "+ c.model);
	}
}
