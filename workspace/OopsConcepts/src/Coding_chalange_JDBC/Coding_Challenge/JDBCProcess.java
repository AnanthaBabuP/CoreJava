package Coding_chalange_JDBC.Coding_Challenge;

import java.sql.Connection;
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
		System.out.println("2.Displayemployeeswiththesamedesignation");
		System.out.println("3.Findhighestsalaryemployeedetails");
		System.out.println("4.Findemployeeswithasalarylessthanorequalto5000/-updatetheirsalaryto 15000/-");
		System.out.println("5.Deleteemployeeswhoseageislessthan20:\n");
		
		// Get Process Number From User
		System.out.println("Enter Process Number:");
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
				System.out.println("Findemployeeswithasalarylessthanorequalto5000/-updatetheirsalaryto 15000/-");
//				updateEmployee(con);
				break;
			case 5:
				System.out.println("Deleteemployeeswhoseageislessthan20:");
//				deleteChildEmployee(con);
				break;

			default:
				System.out.println("Invalid Process");
				break;
			}
			
		}
		
		scan.close();
		con.close();
	}

	

	private static void displaySameDesgination(Connection con, Scanner scan) {
		try {
			Statement s = con.createStatement();
			System.out.println("Enter Employee Desgination : ");
			String desgination = scan.next();
			
			System.out.println("NAME \t ADDRESS \t CONTACT_NUMBER \t SALARY \t AGE \t DESIGINATION");
			System.out.println("------------------------------------------------------------------------------------");
			ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE WHERE DESIGINATION = '"+desgination+"'");
			while(rs.next()) {
				System.out.println(rs.getString("NAME")+"\t"+
									rs.getString("ADDRESS")+"\t  "+
									rs.getString("CONTACT_NUMBER")+"\t"+"\t"+
									rs.getDouble("SALARY")+"\t"+"\t"+
									rs.getInt("AGE")+"\t"+
									rs.getString("DESIGINATION"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void findHighestSalaryEmployee(Connection con) throws Exception {
		Statement s = con.createStatement();
		System.out.println("NAME \t ADDRESS \t CONTACT_NUMBER \t SALARY \t AGE \t DESIGINATION");
		System.out.println("------------------------------------------------------------------------------------");
		ResultSet rs = s.executeQuery("SELECT * FROM EMPLOYEE WHERE SALARY = (SELECT MAX(SALARY) FROM EMPLOYEE)");
		while(rs.next()) {
			System.out.println(rs.getString("NAME")+"\t"+
								rs.getString("ADDRESS")+"\t  "+
								rs.getString("CONTACT_NUMBER")+"\t"+"\t"+
								rs.getDouble("SALARY")+"\t"+"\t"+
								rs.getInt("AGE")+"\t"+
								rs.getString("DESIGINATION"));
		}
		
	}

}
