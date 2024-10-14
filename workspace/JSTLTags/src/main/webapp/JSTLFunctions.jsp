<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Function</title>
</head>
<body>
	<h1>JSTL Function</h1>
	<c:set value=" I am a<course> java </course>full stack Developer" var="msg" />
	<c:set value ="${fn:split(msg,' ')}" var="msgArray" />
	<p> Message : ${msg}</p>
	<p>Message Contains 'Java' : ${fn:contains(msg,'Java')} // case sensitive</p>
	<p>Message Contains 'python' : ${fn:contains(msg,'python')}</p>
	<p>Message containsIgnoreCase 'Java' : ${fn:containsIgnoreCase(msg,'Java')} // Not case sensitive</p>
	<p>Message EndsWith 'developer' : ${fn:endsWith(msg,'Developer')} //case sensitive	</p>
	<p>Message With Escape XML : ${fn:escapeXml(msg)} //case sensitive	</p>
	<p>Message Index Of 'a' :${fn:indexOf(msg,'a')}</p>
	<p>Message Index Of 'z' :${fn:indexOf(msg,'z')}</p>
	<p>Message Array Join with '-' : ${fn:join(msgArray,'-')} </p>
	<p>Message Length : ${fn:length(msg)} </p>
	<p>Message Start With 'I': ${fn:startsWith(msg,'I')}</p>
	<p>Message replace 'Java'- 'python': ${fn:replace(msg,'java','python')} </p>
	<p>Message SubString Of 15-19 : ${fn:substring(msg,15,19)}</p>
	<p>Message SubString Before 'full stack' : ${fn:substringBefore(msg,'full stack')}</p>
	<p>Message SubString After 'full stack' : ${fn:substringAfter(msg,'full stack')}</p>
	<p>Message to UpperCase :${fn:toUpperCase(msg)}</p>
	<p>Message to LowerCase :${fn:toLowerCase(msg)}</p>
	<p>Message to Trim  :${fn:trim(msg)}</p>
	

</body>
</html>