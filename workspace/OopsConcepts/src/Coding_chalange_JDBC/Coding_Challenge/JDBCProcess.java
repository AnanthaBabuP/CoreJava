package Coding_chalange_JDBC.Coding_Challenge;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Coding_chalange_JDBC.EmployeeTable.EmployeeTableConnection;

public class JDBCProcess {

	public static void main(String[] args) throws Exception {
		// Create Scanner to get input from User
		Scanner scan = new Scanner(System.in);
		
		// Print the list of Process in Console
		System.out.println("PROCESS DETAILS");
		System.out.println("-----------------------");
		System.out.println("2. DETAILS FOR SAME DESIGINATION EMPLOYEES");
		System.out.println("3. MAX SALARY EMPLOYEE DETAIL");
		System.out.println("4. FIND EMPLOYEE SALARY < 5000/- UPDATE SALARY = 15000/-");
		System.out.println("5. DELETE EMPLOYEE WHOSE AGE IS LESSTHEN 20\n");
		
		// Get Process Number From User
		System.out.print("Enter Process Number: ");
		int process = scan.nextInt();
		
		
		// Get Connection
		Connection con = EmployeeTableConnection.employeeTableConnection();
		if(con != null) {
			switch (process) {
			case 2:
				System.out.println("DETAILS FOR SAME DESIGINATION EMPLOYEES:\n");
				displaySameDesgination(con, scan);
				break;
			case 3:
				System.out.println("MAX SALARY EMPLOYEE DETAIL:\n");	
				findHighestSalaryEmployee(con);
				break;
			case 4:
				System.out.println("FIND EMPLOYEE SALARY < 5000/- UPDATE SALARY = 15000/- \n");
				updateEmployee(con);
				break;
			case 5:
				System.out.println("DELETE EMPLOYEE WHOSE AGE IS LESSTHEN 20:\n");
				deleteChildEmployee(con);
				break;

			default:
				System.err.println("Invalid Process");
				break;
			}
		}
		
		// close all connections
		scan.close();
		con.close();
	}

	/**
	 *  DETAILS FOR SAME DESIGINATION EMPLOYEES:
	 * @param con
	 * @param scan
	 */
	private static void displaySameDesgination(Connection con, Scanner scan) {
		try {
			Statement s = con.createStatement();
			System.out.println("Enter Employee Desgination : ");
			String desgination = scan.next();
			
			System.out.println("NAME \t ADDRESS \t CONTACT_NUMBER \t SALARY \t AGE \t DESIGINATION");
			System.out.println("------------------------------------------------------------------------------------");
			ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE WHERE DESIGINATION = '"+desgination+"'");
			// Print Statement
			while(rs.next()) {
				System.out.println(rs.getString("NAME")+"\t"+
									rs.getString("ADDRESS")+"\t  "+
									rs.getString("CONTACT_NUMBER")+"\t"+"\t"+
									rs.getDouble("SALARY")+"\t"+"\t"+
									rs.getInt("AGE")+"\t"+
									rs.getString("DESIGINATION"));
			}
			
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * MAX SALARY EMPLOYEE DETAIL
	 * @param con
	 * @throws Exception
	 */
	private static void findHighestSalaryEmployee(Connection con) throws Exception {
		Statement s = con.createStatement();
		System.out.println("NAME \t ADDRESS \t CONTACT_NUMBER \t SALARY \t AGE \t DESIGINATION");
		System.out.println("------------------------------------------------------------------------------------");
		ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE)");
		// Print Statement
		while(rs.next()) {
			System.out.println(rs.getString("NAME")+"\t"+
								rs.getString("ADDRESS")+"\t  "+
								rs.getString("CONTACT_NUMBER")+"\t"+"\t"+
								rs.getDouble("SALARY")+"\t"+"\t"+
								rs.getInt("AGE")+"\t"+
								rs.getString("DESIGINATION"));
		}
		s.close();
	}

	
	/**
	 * DELETE EMPLOYEE WHOSE AGE IS LESSTHEN 20:
	 * @param con
	 */
	private static void deleteChildEmployee(Connection con) {
		try {
			String query = "DELETE FROM EMPLOYEE WHERE AGE < 20";
			PreparedStatement ps = con.prepareStatement(query);
			int count = ps.executeUpdate();
			if(count > 0) 
				System.out.println(count+" Records Deleted...");
			else
				System.out.println("No Records Affected");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * FIND EMPLOYEE SALARY < 5000/- UPDATE SALARY = 15000/-
	 * @param con
	 */
	private static void updateEmployee(Connection con) {
		try {
			String query = "UPDATE EMPLOYEE SET SALARY=15000 WHERE SALARY < 5000;";
			PreparedStatement ps = con.prepareStatement(query);
			int count = ps.executeUpdate();
			if(count > 0) 
				System.out.println(count+" Records UPDATED...");
			else
				System.out.println("No Records Affected");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
