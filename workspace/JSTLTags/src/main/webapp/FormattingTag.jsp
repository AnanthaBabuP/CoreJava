<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formating Tag</title>
</head>
<body>
	<c:set var="balance" value="120000.2309" />
		<p>Format Number(1):
			<fmt:formatNumber value="${balance}" type="currency"></fmt:formatNumber>
		</p>
		<p>Format Number(2):
			<fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="3"></fmt:formatNumber>
		</p>
		<p>Format Number(3):
			<fmt:formatNumber value="${balance}" type="number" maxFractionDigits="2"></fmt:formatNumber>
		</p>
		<p>Format Number(4):
			<fmt:formatNumber value="${balance}" type="number" groupingUsed="false"></fmt:formatNumber>
		</p>
		<p>Format Number(5):
			<fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3"></fmt:formatNumber>
		</p>
		
		<p>Format Number(6):
			<fmt:formatNumber value="${balance}" type="percent" minFractionDigits="10"></fmt:formatNumber>
		</p>
		<p>Format Number(7):
			<fmt:formatNumber value="${balance}" type="percent" minIntegerDigits="3"></fmt:formatNumber>
		</p>
		<p>Format Number(8):
			<fmt:formatNumber value="${balance}" type="number" pattern="###.###E0"></fmt:formatNumber>
		</p>
		<p>Currency in USA:
			<fmt:setLocale value="en_US"/>
			<fmt:formatNumber value="${balance}" type="currency" />
		</p>
</body>
</html>