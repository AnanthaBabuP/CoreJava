package CRUD_OPERATIONS;

import java.sql.*;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Ananth@1999");
			PreparedStatement ps = con.prepareStatement("DELETE FROM EMPLOYEE_1 WHERE EMP_ID = ?");
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Delete Emp_id :");
			int emp_id = scan.nextInt();
			
			ps.setInt(1, emp_id);
			int count = ps.executeUpdate();
			if(count != 0)
				System.out.println(count+" Rows Deleted....");
			else
				System.err.println("No Rows Deleted....");
			
			ps.close();
			con.close();
			scan.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
