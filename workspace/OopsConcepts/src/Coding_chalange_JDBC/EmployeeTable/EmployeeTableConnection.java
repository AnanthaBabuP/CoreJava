package Coding_chalange_JDBC.EmployeeTable;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeTableConnection {
	public static void main(String[] args) {
		
		employeeTableConnection();
		
	}

	public static Connection employeeTableConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coding_challenge","root","Ananth@1999");
			return con;
		} catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
	}

}
