package com.CodingChallenge_Collection;

public class Employee implements Comparable<Employee>{
	int empId;
	String empName;
	double salary;
	
	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}

	// Employee Name Sorting
	@Override
	public int compareTo(Employee e) {
		// TODO Auto-generated method stub
		return empName.compareTo(e.empName);
	}
	
	// Sort to Employee Id
	public int compareToempId(Employee e) {
		// TODO Auto-generated method stub
		if(empId == e.empId)
			return 1;
		else if(empId > e.empId)
			return 0;
		else
			return -1;
	}
	// Sort to Employee Salary
	public int compareToSalary(Employee e) {
		// TODO Auto-generated method stub
		if(salary == e.salary)
			return 1;
		else if(salary > e.salary)
			return 0;
		else
			return -1;
	}
}
