package CRUD_OPERATIONS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		int emp_id;
		String emp_name,date;
		java.util.Date doj;
		java.sql.Date sqlDOJ;
		try {
			// Create Connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Ananth@1999");
			// Make PreparedStatment
			PreparedStatement ps = con.prepareStatement("UPDATE EMPLOYEE_1 SET EMP_NAME = ? , DOJ =? WHERE EMP_ID= ?" );
			
			// Create Scanner Class
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Modification Employee Id :");
			emp_id = scan.nextInt();
			
			System.out.println("Enter Upadated Name :");
			emp_name = scan.next();
			
			System.out.println("Enter Updated DOJ (dd-MM-yyyy)Format :");
			date = scan.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			doj = sdf.parse(date);
			sqlDOJ = new java.sql.Date(doj.getTime());
			
			
			
			//Set Update Process:
			ps.setString(1,emp_name);
			ps.setDate(2, sqlDOJ);
			ps.setInt(3, emp_id);
			
			int count = ps.executeUpdate();
			if(count !=0) {
				System.out.println(count+" Rows Updated...");
			} else {
				System.out.println("Update Failed");
			}
			ps.close();
			con.close();
			scan.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
