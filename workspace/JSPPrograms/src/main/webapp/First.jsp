<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First JSP</title>
</head>
<body>
	<%-- Declaration Variable --%>
	<%! 
		int x= 10; 
		int y=15;
		String message="hellow World!";
		
		int cube(int n){
			return(n*n*n);
		}
		
	%>
	<%-- Expression Tag --%>
	<% int z = x+y; %>
	<%-- Scriplet Tag --%>
	<%
		out.println("Result = "+z);
		out.println("<h1 style='color:blue;'>"+ message+"</h1>");
		out.println("Cube of 2 : "+ cube(2));
	%>
</body>
</html>