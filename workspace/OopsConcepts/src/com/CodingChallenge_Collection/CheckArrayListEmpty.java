package com.CodingChallenge_Collection;

import java.util.ArrayList;

public class CheckArrayListEmpty {

	public static void main(String[] args) {
		// Create a ArrayList
		ArrayList<String> ary = new ArrayList<>();
		
		// Calling isEmpty Check With System out
		System.out.println(isEmptyCheck(ary));
		
		// Add Element
		ary.add("Value 1");
		
		// After Calling isEmpty Check With System out
		System.out.println("After Added ArrayList Element");
		System.out.println(isEmptyCheck(ary));

	}
	/*
	 * Check if the ArrayList is empty
	 */
	private static String isEmptyCheck(ArrayList<String> ary) {
		if(ary.isEmpty()) {
			return "Array Is Empty";
		} else {
			return "Array Is Not Empty";
		}
	}

}
