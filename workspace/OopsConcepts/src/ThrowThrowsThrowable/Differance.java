package ThrowThrowsThrowable;

import java.io.IOException;

public class Differance {

	public static void main(String[] args) {
		m1();
	}
	
	static void m1() {
		throw new ArithmeticException("This is Arithmatic Exprestion:");
//		throw new IOException(); // Error checked exception cannot use in throw
	}
	
	static void m2() throws IOException,ArithmeticException{
		System.out.println("");
		throw new IOException(); // using checked exception using throws
	}
	
	// throw     - create a instant, keyword, single Exception Handling
	// throws    - reference for a class , keyword, multiple exception Handling
	// throwable - Class, super most class for exception handling
}
