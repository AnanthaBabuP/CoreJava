<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajax POST Method</title>
</head>
<body>
	<%
	String t=request.getQueryString();
	if(t != null){
		//out.print(t);
		Date today = new Date();
		out.println("This Page request at:"+today);
	}
	%>
</body>
</html>