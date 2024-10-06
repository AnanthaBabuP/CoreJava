package JDBC.com.files;

import java.sql.*;

public class SelectRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Ananth@1999");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("Select * FROM employee_1");
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+ " : "+rs.getString(2)+" : "+rs.getString(3) );
//			}
			
			rs = s.executeQuery("show Tables");
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
