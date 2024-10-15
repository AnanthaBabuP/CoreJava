<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body>
	<jsp:useBean id="userInfo" class="com.Details" />
	<jsp:setProperty property="*" name="userInfo" />
	You Have entered below details: <br>
	<br> User Name : <jsp:getProperty property="userName" name="userInfo"/>
	<br> Age : <jsp:getProperty property="age" name="userInfo"/>
</body>
</html>