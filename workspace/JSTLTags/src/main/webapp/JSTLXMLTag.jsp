<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL XML TAGS</title>
</head>
<body>
	<h1>Vegetable Information</h1>
	<c:set var="vegetables">
		<Vegetables>
			<Vegetable>
				<name>Onion</name>
				<price>50</price>
			</Vegetable>
			<Vegetable>
				<name>Potato</name>
				<price>42</price>
			</Vegetable>
			<Vegetable>
				<name>Tomato</name>
				<price>45</price>
			</Vegetable>
			<Vegetable>
				<name>Chilli</name>
				<price>23</price>
			</Vegetable>
			<Vegetable>
				<name>carbage</name>
				<price>120</price>
			</Vegetable>
			<Vegetable>
				<name>Onion</name>
				<price>50</price>
			</Vegetable>
		</Vegetables>
	</c:set>
	<x:parse xml="${vegetables}" var="veg" />
	
	<b>Vegetable Name :<x:out select="$veg/Vegetables/Vegetable[1]/name"/></b><br>
	<b>Vegetable Price :<x:out select="$veg/Vegetables/Vegetable[1]/price"/></b>
	<br><br>
	<b>Vegetable Name :<x:out select="$veg/Vegetables/Vegetable[2]/name"/></b><br>
	<b>Vegetable Price :<x:out select="$veg/Vegetables/Vegetable[2]/price"/></b>
	<br><br>
	<b>Vegetable Name :<x:out select="$veg/Vegetables/Vegetable[3]/name"/></b><br>
	<b>Vegetable Price :<x:out select="$veg/Vegetables/Vegetable[3]/price"/></b>
	<br><br>
	<b>Vegetable Name :<x:out select="$veg/Vegetables/Vegetable[4]/name"/></b><br>
	<b>Vegetable Price :<x:out select="$veg/Vegetables/Vegetable[4]/price"/></b>
	<br><br>
	<b>Vegetable Name :<x:out select="$veg/Vegetables/Vegetable[5]/name"/></b><br>
	<b>Vegetable Price :<x:out select="$veg/Vegetables/Vegetable[5]/price"/></b>
	<br><br>
	<h1>Print Using forEach </h1>
	<x:forEach var="vegetable" select="$veg/Vegetables/Vegetable">
        <b>Vegetable Name: <x:out select="name" /></b><br>
        <b>Vegetable Price: <x:out select="price" /></b><br><br>
    </x:forEach>
    <br><br>
    <h1>Print For Table Format </h1>
    <table border=2 width="100%" height="300px">
	    <tr>
	    	<th>Name</th>
	    	<th>Price</th>
	    </tr>
	    <x:forEach var="vegetable" select="$veg/Vegetables/Vegetable">
	    	<tr>
	    		<td><x:out select="$vegetable/name"/> </td>
	    		<td><x:out select="$vegetable/price"/> </td>
	    	</tr>
	    </x:forEach>
    </table>
</body>
</html>