<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		text-align: left;
	}
	div div{
		display: inline-block;
	}
	span h3{
		
		display: inline-block;
	}
</style>
</head>
<body>
<%
	String num1 = (String) request.getParameter("num1");
	String num2 = (String) request.getParameter("num2");
	String num3 = (String) request.getParameter("num3");
	String title = (String) request.getParameter("title");
	String kind = (String) request.getParameter("kind");
	String country = (String) request.getParameter("country");
	String day = (String) request.getParameter("day");
	String publicer = (String) request.getParameter("publicer");
	String name = (String) request.getParameter("name");
	String price = (String) request.getParameter("price");
	String price2 = (String) request.getParameter("price2");
	String context = (String) request.getParameter("context");
%>
<div>
	<div>
		<h2>도서정보</h2>
		<span><h3>도서번호  </h3><%= num1  %>-<%= num2  %>-<%= num3  %></span><br>
		<span><h3>도서명  </h3><%= title %></span><br>
		<span><h3>도서분류  </h3><%= kind %></span><br>
		<span><h3>도서국  </h3><%= country %></span><br>
		<span><h3>출판일  </h3><%= day %></span><br>
		<span><h3>출판사  </h3><%= publicer %></span><br>
		<span><h3>저자  </h3><%= name %></span><br>
		<span><h3>도서가격  </h3><%= price %><%= price2 %></span><br>
		<span><h3>도서설명  </h3><%= context %></span><br>
		<br>
		<a href="#">도서 등록</a>
	</div>
</body>
</html>