<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
 <h1 style="text-align: center;"> Login Form</h1>
 <fieldset>
 	<legend>Login</legend>
 	<div>
 		<form action="Action.jsp" method="post">
 			Name :<input type="text" name="userName">
 			Age :<input type="number" name="age">
 			<%session.setAttribute("Area", "Keelakalangal"); %>
 			<input type="submit" value="Register">
 		</form>
 	</div>
 </fieldset>
</body>
</html>