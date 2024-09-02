package com.method;

// Static & non-static method
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1(); // ststic method easy to call for another method without object inside another static method
	}
	static void m1(){
		new Example().m2();
		System.out.println("Example for Static method");
	}
	void m2(){
		m3();
		System.out.println("Example for non Static Method");
	}
	
	void m3(){
		
	}

}
