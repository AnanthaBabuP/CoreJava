package Connection_test;

import java.sql.*;

public class Connection_get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getStusent_DetailConnection();
	}

	public static Connection getStusent_DetailConnection() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Ananth@1999");
			if(con != null) {
				System.out.println("Database Connected>>>>...");
			} else {
				System.out.println("Database Connection Failed>>>>...");
			}
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
