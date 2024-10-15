<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <p>UserName : ${param.userName}</p>
  <p>Age : ${param.age}</p>
  <p>Area : <%= session.getAttribute("Area") %></p>
</body>
</html>