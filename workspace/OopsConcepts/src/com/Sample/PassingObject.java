package com.Sample;

public class PassingObject {
	
	String name;
	double price;
	int model;
	
	void passingObject(){
		System.out.println("Constroctor Inside");
	}
	
	void display(PassingObject c){
		System.out.println("Car Name = "+c.name);
		System.out.println("Car price= "+ c.price);
		System.out.println("Car model= "+ c.model);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingObject pass = new PassingObject();
		pass.name = "Swift";
		pass.price = 150000;
		pass.model = 2017;
		
		pass.display(pass);
		
	}

}
