<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax POST Method</title>
</head>
<body>
	<%
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		out.println("Welcome "+fname+" "+lname);
		out.println("Thank You For visiting my web page");
	%>
</body>
</html>