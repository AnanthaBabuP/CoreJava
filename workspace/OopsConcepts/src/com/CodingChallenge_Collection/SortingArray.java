package com.CodingChallenge_Collection;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1001, "Murugan", 55000.0);
		Employee emp2 = new Employee(1004, "Ganeshan", 45000.0);
		Employee emp3 = new Employee(1003, "Samuvel", 62000.0);
		Employee emp4 = new Employee(1002, "Kumar", 32000.0);
		Employee emp5 = new Employee(1005, "Raja", 18000.0);

		Employee[] emps = {emp1, emp2, emp3, emp4, emp5};
		
		// Sorting Employee Name Using Comparable Interface ...
		System.err.println("Sort With Employee Name Using Comparable Interface ...");
		Arrays.sort(emps);
		
		// Print Employee Values One By One
		printEmployee(emps);
		
		// Sorting Employee Id Using Comparator Interface with Lambda Expression
		System.err.println("\nAfter Sorting Employee Id Using Comparator Interface With Lambda Expression....");
		Arrays.sort(emps,(Employee x, Employee y) -> {
			if(x.empId == y.empId)
				return 1;
			else if(x.empId > y.empId)
				return 0;
			else 
				return -1;
		});
		
		// Sorting Employee Id using Comparator
		printEmployee(emps);
		
		// Sorting Employee Name Length Using Comparator Interface with Lambda Expression
		System.err.println("\nAfter Sorting Employee Name length Using Comparator Interface With Lambda Expression....");
		Arrays.sort(emps,(Employee x, Employee y) -> {
			if(x.empName.length() == y.empName.length())
				return 1;
			else if(x.empName.length() > y.empName.length())
				return 0;
			else 
				return -1;
		});
		
		// Sorting Employee Name length using Comparator
		printEmployee(emps);
		
		// Sorting Employee Salary Using Comparator Interface with Lambda Expression
		System.err.println("\nAfter Sorting Employee Salary Using Comparator Interface With Lambda Expression....");
		Arrays.sort(emps,(Employee x, Employee y) -> {
			if(x.salary == y.salary)
				return 1;
			else if(x.salary > y.salary)
				return 0;
			else 
				return -1;
		});
		
		// Sorting Employee Name length using Comparator
		printEmployee(emps);
	}

	private static void printEmployee(Employee[] emps) {
		for(Employee emp : emps) {
			System.out.println(emp);
		}
	}
}
