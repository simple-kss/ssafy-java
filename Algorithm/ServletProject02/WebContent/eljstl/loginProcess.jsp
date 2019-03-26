<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="id" value="${param.id}"/>
<c:set var="pass" value="${param.pass}"/>
id: ${id }<br>
pass: ${pass }<br>

<c:if test="${empty id}">
	<h1>아이디를 입력해 주세요</h1>
</c:if>

<!-- else태그가 없다. -->
<c:if test="${!empty id}">
	<c:if test="${id == 'tom' && pass==123 }">
		<h1>welcome! ${id }</h1>
	</c:if>
	
	<c:if test="${id ne 'tom' or pass ne 123 }">
		<h1>try again...!</h1>
	</c:if>
</c:if>



</body>
</html>