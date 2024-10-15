<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
	<h1>Expression Language</h1>
	<p>1 &lt; 2 : ${1<2} </p> <br>
	${(4*5)-2+15/3} <br>
	<%--    (20)-2+15/3 // () first preference
			(20)-2+5 // / second preference
			18+5 // - third preference then + fourth preference
			23 // Final Out put
				
	 --%>
	${100 lt 15} <br>
	${true and false} <br>
	
</body>
</html>