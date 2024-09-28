<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
<h1></h1>
	<table border="1">
		<tr bgcolor="gray">
			<th>Employee_Id</th>
			<th>Employee_Name</th>
			<th>Employee_Address</th>
		</tr>
		<%
		try{
			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Ananth@1999");
			Statement stmt = con.createStatement();
			
			int Emp_id = Integer.parseInt(request.getParameter("Empid"));
			
			ResultSet  rs = stmt.executeQuery("Select * from employee Where Empid="+Emp_id);
			
			while(rs.next()){
				out.println("<tr><td>");
				out.println(rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><tr>");
			}
			out.println("</table>");
			
		}catch(Exception e){
			out.println(e);
		}
		%>
	</table>
</body>
</html>