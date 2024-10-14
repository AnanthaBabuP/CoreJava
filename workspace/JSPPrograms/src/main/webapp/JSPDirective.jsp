<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Directive</title>
</head>
<body>
	<p>
		Today Time is:<%=new Date().toString()%>
	</p>
	<%
		out.println("Random Math="+ Math.random() *100);
	%>
	
	<%
		ArrayList<String> al = new ArrayList<String>();
		al.add("JAVA");
		al.add("PHP");
		al.add("RUPE");
		for(String s: al){ %>
			<p style="color:red;align-content: center;"><%= s %></p>
		<%}
	%>
</body>
</html>