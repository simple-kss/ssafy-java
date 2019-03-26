<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

</style>
</head>
<body>
<%
	String result = (String)request.getAttribute("result");
%>
	<div class="container">
		<h1>결과 페이지</h1>
		<h4><%= result %></h4>
		<div>
		<a href="Book.html">추가 등록</a> <a href="MainServlet?type=view">도서목록</a>
		</div>
	</div>
</body>
</html>