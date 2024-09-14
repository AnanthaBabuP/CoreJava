package com.FileIOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		
		try {
			FileInputStream fi = new FileInputStream("D:\\coreJava\\FileStream\\inmakes.txt");
			// public int read();
			// public int read(byte b[])
			// public int read(byte[] b,int offset,int length)
			
			
//			char a = (char)fi.read(); // TypeCasting
			char a;
			try {
				while((a = (char)fi.read()) != -1) 
				
				System.out.print(a);
				fi.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
