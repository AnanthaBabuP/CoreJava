package CRUD_OPERATIONS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Connection_test.Connection_get;

public class SelectRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection con = Connection_get.getStusent_DetailConnection();
			if(con != null) {
				Statement s = con.createStatement();
				ResultSet rs = s.executeQuery("SELECT * FROM CUSTOMER where city=\'chennai\'");
				System.out.println("CUSTOMER_ID \t CUSTOMER_NAME \t CUTOMER_ADDRESS \t CITY");
				while(rs.next()) {
//					System.out.println(rs.getInt(1)+ " \t "+rs.getString(2)+" \t "+rs.getString(3) );
					System.out.println(rs.getInt("customer_id")+"\t"+rs.getString("custom_name")+"\t"+rs.getString("address")+"\t"+rs.getString("city"));
				}
			} else {
				System.out.println("Connection Fail...");
			}
			
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
