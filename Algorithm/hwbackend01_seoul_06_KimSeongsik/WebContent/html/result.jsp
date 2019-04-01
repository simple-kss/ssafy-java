<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String name = (String) request.getParameter("name");
	String price = (String) request.getParameter("price");
	String explain = (String) request.getParameter("explain");
%>



상품    명: <%= name  %>
상품 가격: <%= price  %>
상품 설명: <%= explain  %>
</body>
</html>