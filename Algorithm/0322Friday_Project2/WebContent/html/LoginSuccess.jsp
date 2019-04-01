<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
%>

	<h3><%=id %>님 로그인 되었습니다.!!!</h3>
	<a href="html/Book.html">도서 등록</a><br>
	<a href="#">로그아웃</a>
</body>
</html>
