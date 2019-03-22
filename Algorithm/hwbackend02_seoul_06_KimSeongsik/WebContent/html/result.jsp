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
int num = 1;
String name = (String)request.getAttribute("name");
String price = (String)request.getAttribute("price");
String summary = (String)request.getAttribute("summary");
%>
<h1>상품이 저장되었습니다.</h1>
상품 번호	<%= num++ %> <br>
상 품 명	<%= name %><br>
상품 가격	<%= price %><br>
상품 설명	<%= summary %><br>

<a href="#">상품 목록</a>
</body>
</html>