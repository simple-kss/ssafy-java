<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Main 페이지</h1>
<jsp:include page="loginCheck.jsp"></jsp:include>
<hr>
<%
	ArrayList<String> list = (ArrayList<String>) session.getAttribute("list");
	for(String color: list) {
%>
	<p><%= color %></p>
	<%} %>

<%-- Welcome,,, <%= session.getAttribute("id") %> !!!
<hr>
<a href="logout.jsp">logout</a>
 --%>
</body>
</html>