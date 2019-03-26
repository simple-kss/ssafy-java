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
	String id = (String)session.getAttribute("id");
	if(id == null) { // login 안하는 것
%>
	<a href="login.html">login</a>
<%}else{ %>
	welcome, <%=id %>!
	<a href="logout.jsp">logout</a>
<%} %>


</body>
</html>