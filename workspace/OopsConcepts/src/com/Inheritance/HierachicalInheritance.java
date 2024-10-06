package com.Inheritance;

class D{
	void m1(){
		System.out.println("m1 is D class :");
	}
}

class E extends D{
	void m1(){
		System.out.println("m1 is E class");
	}
}

class F extends D{
	void m1(){
		System.out.println("m1 is F Class");
	}
}

class G extends D{
	void m1(){
		System.out.println("m1 id G Class");
	}
}
public class HierachicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d = new D();
		d.m1();
		
		d= new E(); // UPCASTING // Assign to d class object at E class
		d.m1(); // calling e class m1 method
		
		d= new F();// UPCASTING // Assign to d class object at F class
		d.m1(); // calling F class m1 method
		
		d= new G();// UPCASTING // Assign to d class object at G class
		d.m1(); // calling G class m1 method
		
	}

}
