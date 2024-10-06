package com.CallByValueVsCallByReferance;

public class CallByValue {

	int change(int b){
		++b;
		return b;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		CallByValue obj = new CallByValue();
		
		int x = obj.change(a);
		
		System.out.println("Check With befor a value: "+a);
		System.out.println("Check With After x value: "+x);
	}

}
