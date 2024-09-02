package com.method;

public class Dog {
	// Class variables(STATE)
	String name = "German shaphed";
	String color;
	int price=10000;
	
	// Method (BEHAVIOUR)
	/* [ACCESS_Modifer] [Non_AccessModifier] returnType method_name(Arrguments){
			Block of code
			Return Value
		  }
	*/	
	void barking(){
		System.out.println("Dogs Are barking");
		System.out.println("Dog name:"+name);
		System.out.println("Dog price :"+price);
	}
	
	void fetching(){
		System.out.println("Dogs are Fetching food");
	}
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog(); // referanvce of Dog class
		d.barking();
		d.fetching();

	}

}
