package com.Functional_Programming;

public class Employee {

	int empId;
	String empName;
	String designation;
	double salary;
	
	public Employee(int empId, String empName, String designation, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
}
