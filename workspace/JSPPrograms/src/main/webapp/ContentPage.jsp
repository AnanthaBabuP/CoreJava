<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Content Page</title>
</head>
<body>
	<header style="height:100px; ">
		<div>
		<%@ include file="Header.jsp" %>
		</div>	
	</header>
	
	<div style="text-align: center;height: 500px">
		<p>Hai</p>
		<%@ include file="JSPDirective.jsp" %>
	</div>
	<footer>
		<div style="height: 100px;">
			<%@ include file="Footer.jsp" %>
		</div>
	</footer>
</body>
</html>