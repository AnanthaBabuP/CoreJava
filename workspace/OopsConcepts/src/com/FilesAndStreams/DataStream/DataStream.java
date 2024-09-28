package com.FilesAndStreams.DataStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataStream {

	public static void main(String[] args) {
		int a;
		float b;
		char c;
		double d;
		boolean e;
		try {
			FileInputStream fin = new FileInputStream("D:\\coreJava\\FileStream\\sample.txt");
			DataInputStream dis = new DataInputStream(System.in);
			
			System.out.println("Enter The integer:");
//			a= dis.readInt();
			a= Integer.parseInt(dis.readLine());
			
			System.out.println("Enter The Float:");
//			b = dis.readFloat();
			b= Float.parseFloat(dis.readLine());
			
			System.out.println("Enter The Character:");
//			c = dis.readChar();
			c= dis.readLine().charAt(0);
			
			System.out.println("Enter The Double:");
//			d = dis.readDouble();
			d = Double.parseDouble(dis.readLine());
			
			System.out.println("Enter The Boolean:");
//			e = dis.readBoolean();
			e = Boolean.parseBoolean(dis.readLine());
			
			/*
			 System.out.println("Print All Values"); System.out.println(a);
			 System.out.println(b); System.out.println(c); System.out.println(d);
			 System.out.println(e);
			 */
			
			// FileOutputStream
			FileOutputStream fout = new FileOutputStream("D:\\coreJava\\FileStream\\sample.txt");
			DataOutputStream dos = new DataOutputStream(fout);
			dos.writeInt(a);
			dos.writeFloat(b);
			dos.writeChar(c);
			dos.writeDouble(d);
			dos.writeBoolean(e);
			
			// Print Statement
			DataInputStream dis2  = new DataInputStream(fin);
//			int x;
//			while((x=dis2.read()) != -1) {
//				System.out.println((char)x);
//			}
			System.out.println(dis2.readInt());
			System.out.println(dis2.readFloat());
			System.out.println(dis2.readChar());
			System.out.println(dis2.readDouble());
			System.out.println(dis2.readBoolean());
		
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

	}

}
