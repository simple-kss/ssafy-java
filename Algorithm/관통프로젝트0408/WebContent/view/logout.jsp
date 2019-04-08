<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>로그아웃 되었습니다.
<%
	session.setAttribute("id", null);
	session.setAttribute("pass", null);
%>
<a href=login.mvc>login</a>&nbsp;</h2>

</body>
</html>