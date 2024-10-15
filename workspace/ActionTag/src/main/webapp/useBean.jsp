<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UseBean Example</title>
</head>
<body>
	<h1>Use Bean</h1>
	<jsp:useBean id="obj" class="com.Message"></jsp:useBean>
	<%
		String msg = obj.getMessage();
		out.print(msg);
	%>
</body>
</html>