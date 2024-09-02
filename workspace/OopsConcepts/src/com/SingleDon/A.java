package com.SingleDon;

public class A {
	// create a private static object
	private static A obj; // null
	
	// create a private constructor
	private A(){
		
	}
	
	// Create a factory method
	public static A getInstance(){
		if(obj == null){
			obj = new A(); // create new Instance
		}
		return obj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}

}
