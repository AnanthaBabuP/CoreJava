package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandligBlock {

	public static void main(String[] args) {

		int a,b;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Number");
		a=s.nextInt();
		System.out.println("Enter Second Number");
		b=s.nextInt();
		
		try { // single try block contain to one or more try block
			int c = a/b; // 10/0 ArithmeticException
			
			int[] arr= {
					10,
					20,
					30
			};
			
			System.out.println(arr[3]); // array contain only 0,1,2 index 3 is not available
		} catch(ArithmeticException e) {
			System.out.println("Inside Arithmatic Expresion ");
			System.out.println(e.getMessage()); // show message only not show on class
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array Index out of Bounds");
			System.out.println(e.getMessage());
		} finally { // this block execute if try or not both  Run every time
			System.out.println("Inside Finally Executed ...");
		}
	}

}
