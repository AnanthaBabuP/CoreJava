package com.Sample;

public class Car {
	// State(variable)
	String name;
	Double price;
	int model;
	
	// Behavior(Methods)
	void start(){
		System.out.println("Car Started...");
	}
	void run(){
		System.out.println("Car Runing...");
	}
	void stop(){
		System.out.println("Car Stoped...");
	}
}
