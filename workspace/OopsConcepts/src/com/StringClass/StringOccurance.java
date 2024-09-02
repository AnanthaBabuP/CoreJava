package com.StringClass;

import java.util.Scanner;

public class StringOccurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String ...");
		String str = scan.next();
		
		String pi="";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			
			if(pi.indexOf(c) != -1)
				continue;
			pi+=c;
			int d = getCount(str,c);
			System.out.println(c+"="+d);
		}

	}

	private static int getCount(String str, char c) {
		String s= str.replace(c+"", "");
		return str.length()-s.length();
	}

}
