<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>로그아웃 되었습니다.</h1>
<%
	session.setAttribute("id", null);
	session.setAttribute("pass", null);
%>
<a href=login.html>login</a>&nbsp;
<a href=main.jsp>main</a>

</body>
</html>