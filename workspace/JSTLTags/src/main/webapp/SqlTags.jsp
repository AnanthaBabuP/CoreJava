<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SQL Tags</title>
</head>
<body>
	 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
	 	url="jdbc:mysql://localhost:3306/student_details" user="root" password="Ananth@1999" />
	 <sql:query var="rs" dataSource="${db}">
	 	SELECT * FROM EMPLOYEE_1;
	 </sql:query>
	 
	
	 <table border="4" style="width:100%;" >
	 	<!-- <tr>
	 		<th>Emp_ID</th>
	 		<th>Emp_Name</th>
	 		<th>DOJ</th>
	 	</tr> -->
	 	<c:forEach var="table" items="${rs.rows }">
		 	<tr>
		 		<td><c:out value="${table.Emp_id}"></c:out></td>
		 		<td><c:out value="${table.emp_name}"></c:out></td>
		 		<td><c:out value="${table.doj}"></c:out></td>
		 	</tr>
	 	</c:forEach>
	 	
	 </table>
</body>
</html>