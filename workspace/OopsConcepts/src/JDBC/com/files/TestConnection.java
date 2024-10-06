package JDBC.com.files;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Ananth@1999");
			Statement s1 = con1.createStatement();
			
			Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/notdbname","root","Ananth@1999");
			Statement s2 = con1.createStatement();
			
			if(con1 != null) {
				System.out.println("Database Connected>>>>...");
			} else {
				System.out.println("Database Connection Failed>>>>...");
			}
			
			if(con2 != null)
				System.out.println("Database2 Connected>>>>...");
			else
				System.out.println("Database Connection2 Failed>>>>...");
//			ResultSet rs = s.executeQuery("Select * FROM employee_1");
//			while(rs.next()) {
//				System.out.println(rs.getString(1)+ " : "+rs.getString(2)+" : "+rs.getString(3) );
//			}
			con1.close();
			con2.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
