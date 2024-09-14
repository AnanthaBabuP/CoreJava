package com.SequenceStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceStream {

	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("D:/coreJava/FileStream/t1.txt");
			FileInputStream f2 = new FileInputStream("D:/coreJava/FileStream/t2.txt");

			SequenceInputStream input = new SequenceInputStream(f1, f2);
			
			int x;
			while((x=input.read()) != -1) {
				System.out.print((char)x);
			}
		f1.close();
		f2.close();
		input.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
