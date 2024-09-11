package com.CollectionIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_demo {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("java");
		a1.add("python");
		a1.add("php");
		
		System.out.println(a1);
		
		Iterator itr = a1.iterator ();
//		System.out.println(itr.next()); // if a1 is empty that line will be execute fot exception in NoSuchElementException
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove(); //  it use before next() it throws IllegalStateException 
		}
		System.out.println(a1);
	}

}
