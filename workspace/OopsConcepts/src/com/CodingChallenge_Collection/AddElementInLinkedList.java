package com.CodingChallenge_Collection;

import java.util.LinkedList;
import java.util.Scanner;

public class AddElementInLinkedList {

	public static void main(String[] args) {
		// Get Input from User using Scanner Class
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The Number of Elements");
		int elementCount = scan.nextInt();
		
		// Get Element one by one From User
		System.out.println("Enter the Element One by One ");

		LinkedList<String> elements = new LinkedList<>();
		for(int i=0;i<elementCount;i++) {
			elements.add(scan.next());
		}
		
		// Get New Element And Position From User Using Scanner Class
		System.out.println("Enter The New Element");
		String element = scan.next();
		
		System.out.println("Enter The Position of New Element");
		int position = scan.nextInt();
		
		
		// Check position is Less Then Equal to elementCount
		if(position >=0 && position <= elementCount) {
			// Add to New Element in LinkedList
			elements.add(position, element);
			
			System.out.println("After Adding New Element LinkedList is :");
			// Print After Added Element LinkedList 
			for(String ele:elements)
				System.out.println(ele);
		} else { 
			System.err.println("Enter Valid Position...");
		}
		
		scan.close();
	}

}
