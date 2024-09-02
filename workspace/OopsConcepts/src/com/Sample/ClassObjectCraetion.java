package com.Sample;

class ClassObjectCraetion{
	public static void main(String[] args) {
		Car c; // c= object (or) Instance Variable
		c = new Car();
		
		c.start();
		c.run();
		c.stop();
		
		new Car().start();
	}
}