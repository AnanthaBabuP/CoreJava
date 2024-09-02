package com.Aggregation;

public class Student {
	
	int rollNo;
	String name;
	Address addr;
	
	

	public Student(int rollNo, String name, Address addr) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.addr = addr;
	}

	

	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", addr="
				+ addr + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address adr = new Address("Tirunelveli","TamilNadu","India");
		Student s1 = new Student(1, "Anandh", adr);
		Student s2 = new Student(2, "Bala", adr);
		Student s3 = new Student(3, "chandran", adr);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
