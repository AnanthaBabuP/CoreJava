package JDBC.com.files;

import java.sql.*;

import Connection_test.Connection_get;

public class SelectRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = Connection_get.getStusent_DetailConnection();
			if(con != null) {
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("Select * FROM employee_1");
				while(rs.next()) {
					System.out.println(rs.getInt(1)+ " \t "+rs.getString(2)+" \t "+rs.getString(3) );
				}
			} else {
				System.out.println("Connection Fail...");
			}
			
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
