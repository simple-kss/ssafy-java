<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.ssafy.BookMgr"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String result = (String) request.getAttribute("result");
		BookMgr mgr = (BookMgr) request.getAttribute("mgrObj");
		request.setAttribute("mgrObj", mgr);
	%>
	<h1>결과 페이지</h1>
	<h3><%=result%></h3>
	<a href="html/Book.html">추가 등록</a>
	<a href="MainServlet?do=list">도서 목록</a>
</body>
</html>