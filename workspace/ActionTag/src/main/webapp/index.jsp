<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tags In JSP</title>
<style type="text/css">
	a{
		margin-left:20px;
		text-decoration: none;
		color: white;
		background-color: gray;
		width: 300px;
		height: 30px;
		display:inline-block;
		text-align: center;
		padding-top:10px; 
		cursor: pointer;
		border: 2px solid aqua;
		border-radius: 15px;
	}
</style>
</head>
<body>
	<h1>Action Tag - Standard</h1>
	<div style="display: block;">
		<a href="include.jsp">JSP:INCLUDE</a>
		<a href="useBean.jsp">JSP:USEBEAN</a>
		<a href="get_set_property.jsp">JSP:SET/GETPROPERTY</a>
	</div> <br>
	<h1>Action Tag - Custom</h1>
	<div style="display: block;">
		<a href="Test.jsp">Custom Tag</a>
	</div>
	<h1>Express Elements</h1>
	<div style="display: block;">
		<a href="/ActionTag/ExpressionLanguage/ExpressionLanguage.jsp">Expression Language</a>
		<a href="/ActionTag/ExpressionLanguage/LoginForm.jsp">Expression Language Login Form</a>
	</div>
	
</body>
</html>