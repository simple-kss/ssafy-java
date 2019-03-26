<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style type="text/css">
	.container{
		text-align: center;
	}
	.container div{
		background-color: #E6E6E6;
		padding: 2px;
	}
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