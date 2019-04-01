<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="java.util.ArrayList"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	// session에 저장하기
	// JSP 기본객체와 활성범위
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	response.sendRedirect("index.jsp");
%>

</body>
</html>