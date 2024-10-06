package JDBC.com.files;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class StoreProcedureCall {

	public static void main(String[] args) {
		int emp_id;
		Scanner scan = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Ananth@1999");
			CallableStatement cs = con.prepareCall("{call find_employee(?)}");
			
			System.out.println("Enter Employee Id :");
			emp_id = scan.nextInt();
			cs.setInt(1, emp_id);
			ResultSet rs =  cs.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			
			rs.close();
			con.close();
			scan.close();
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
