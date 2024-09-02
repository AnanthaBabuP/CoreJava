package com.ConstructorOverloading;

public class Point {
	int x,y;
	Point(){
		x=0;
		y=0;
	}
	Point(int p1,int p2){
		x=p1;
		y=p2;
	}
	Point(Point p){
		x=p.x;
		y=p.y;
	}
	
	void display(){
		System.out.println("X Value is : "+x);
		System.out.println("Y Value is : "+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.display();
		
		Point p2 = new Point(3,4);
		p2.display();
		
		Point p3 = new Point(p2);
		p3.display();
	}

}
