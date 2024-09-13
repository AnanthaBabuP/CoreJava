package com.LambdaExprstion;

// Important points for FunctionalInterface
//2.@fuctionalInterfaces
@FunctionalInterface
public interface MyInterface{

	// Without Parameter
//	public void show(); // 1.public abstract method
	
	
	// similare parameter
//	public void show(String msg1, String msg2);
	
	// Difference Parameter
//	public void show(String msg1, int xs);
	
	// return Value
	double add(double d,int i);
	
	// 3.functionalInterfacce contain single abstract method not use multiple methods
	//	public void name();
}
