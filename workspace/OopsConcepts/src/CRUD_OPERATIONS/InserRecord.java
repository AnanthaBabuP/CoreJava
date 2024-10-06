package CRUD_OPERATIONS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Connection_test.Connection_get;

public class InserRecord {

	
	public static void main(String[] args) {
		int emp_id;
		String emp_name,date;
		Date doj;
		int count = 0;
		try {
			// Connection Process
			Connection con = Connection_get.getStusent_DetailConnection();
			PreparedStatement ps = con.prepareStatement("INSERT INTO EMPLOYEE_1 (EMP_ID,EMP_NAME,DOJ) VALUES(?,?,?)");
			
			Scanner	scan = new Scanner(System.in);
			
			System.out.println("Eneter Employee Id:");
			emp_id = scan.nextInt();
			System.out.println("Eneter Employee Name:");
			emp_name = scan.next();
			System.out.println("Eneter Employee DOJ For (dd-MM-yyyy) Formate:");
			date=scan.next();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			doj = sdf.parse(date);
			java.sql.Date dateOfJoin = new java.sql.Date(doj.getTime());
			
			// Insert Process
			ps.setInt(1, emp_id);
			ps.setString(2, emp_name);
			ps.setDate(3, dateOfJoin);
			
			// Using Statement()
//			Statement s = con.createStatement();
//			String query  = "INSERT INTO EMPLOYEE_1 (EMP_ID,EMP_NAME,DOJ) VALUES("+emp_id+",'"+emp_name+"','"+dateOfJoin+"')";
//			count = s.executeUpdate(query);
			
			// Execute Query
			count = ps.executeUpdate();
			if(count != 0)
				System.out.println(count + " Rows Inserted....");
			ps.close();
			con.close();
			scan.close();
			
		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
