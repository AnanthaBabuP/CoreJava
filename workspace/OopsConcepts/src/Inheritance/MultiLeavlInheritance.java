package Inheritance;

class A{ // suber class
	int a=10;
	void m1(){
		System.out.println("m1 is A Class");
	}
}

class B extends A{	//sub Class1 [leavel1]
	int b=20;
	int sum = a+b;
	void m2(){
		m1();
		System.out.println("m2 is B Class");
		System.out.println("Sum ="+ sum);
	}
}

class C extends B{ // sub class2 [leavel 2]
	int c = 30;
	int mul = a*b*c;
	void m3(){
		m2();
		System.out.println("m3 is C Class");
		System.out.println("Multiplication = "+ mul);
	}	
}
public class MultiLeavlInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.m3();
	}

}
