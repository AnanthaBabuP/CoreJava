<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
 <% String str="raja";%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Success</title>
</head>
<body>
	<c:forEach items="${usr}" var="user">
		<%-- jsp Comments --%>
		<h1 style="color:green;">welcome back <c:out value="${user}"></c:out>  , <% request.getAttribute("userName"); %>You are SuccessFully Login...</h1>
		<form action="AnotherServlet" method="post">
			<input type="hidden" name="hidden_user" value="<c:out value="${user}"></c:out>">
			<input type="submit" value="Session Tracking Using Hidden form">
		</form>
		<div style="padding-top: 10px">
			<a href="AnotherServlet?userName=<c:out value="${user}"></c:out>" 
				style="border: 1px solid black;
				background-color: lightgray;
				color:black;
				text-align: center;
				text-decoration: none;"
			>Session Tracking with URL Rewrite</a>
		</div>
		
	</c:forEach>
</body>
</html>