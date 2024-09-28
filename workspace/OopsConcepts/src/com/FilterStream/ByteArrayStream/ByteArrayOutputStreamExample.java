package com.FilterStream.ByteArrayStream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {

	public static void main(String[] args) {

		String s = "I AM A JAVA DEVELOPER";

		byte[] b = s.getBytes(); // Byte Array

		ByteArrayOutputStream output = new ByteArrayOutputStream(); // default size is 32
		try {
			output.write(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ByteArrayInputStream input = new ByteArrayInputStream(b);
		int x;

		System.out.println();

		// public void skip()
		// public int available()
		System.out.println("Available bytes : " + input.available());
		input.read();
		input.read();
		System.out.println("Available bytes : " + input.available());
		
		 while((x = input.read()) != -1) {
			 input.skip(2);
			 System.out.print((char)x); 
			}
		
		try {
			output.close();
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
