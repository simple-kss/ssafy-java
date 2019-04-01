<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
<jsp:useBean id="h" class="com.hello.HelloBean" scope="request"/>
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
%>
<h1> welcome< <%= id %> !!!</h1>
<h1> welcome< <%= pass %> !!!</h1>

<br>
<a href="login.html">back</a>
<hr>
<jsp:include page="login.html" />

</body>
</html>