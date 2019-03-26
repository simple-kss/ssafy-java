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
	<H1>for each</H1>
	<c:forEach begin="1" end="10" step="1" var="i">
		${i }. hello
		<hr>
	</c:forEach>
</body>
</html>