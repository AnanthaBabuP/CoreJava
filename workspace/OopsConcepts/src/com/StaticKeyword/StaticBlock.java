package com.StaticKeyword;

public class StaticBlock {
	// nonstaticc veriable
	int empid;
	String empName;
	String desgination;
	double salary;
	static String companyName;
	static{
		companyName = "TVS Motors";
		System.out.println("Static Stated...");
	}
	
	public StaticBlock(int empid, String empName, String desgination,
			double salary) {
		this.empid = empid;
		this.empName = empName;
		this.desgination = desgination;
		this.salary = salary;
	}

	public String toString() {
		return "StaticBlock [empid=" + empid + ", empName=" + empName
				+ ", desgination=" + desgination + ", salary=" + salary +", Company Name="+companyName + "]";
	}

	public static void main(String[] args) {
		System.out.println("Main Block is Started...");
		StaticBlock sb1 = new StaticBlock(1001, "Ananth", "Software Developer", 50000);
		StaticBlock sb2 = new StaticBlock(1002, "Raja", "Software Tester", 45000);
		StaticBlock sb3 = new StaticBlock(1003, "Swatha", "Data Analysis", 32000);
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		System.out.println("main Block Ended...");
	}
}
