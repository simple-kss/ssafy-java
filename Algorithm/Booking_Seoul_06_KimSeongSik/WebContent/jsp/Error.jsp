<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String err = (String) request.getAttribute("e1");
	%>
	<h1><%=err%></h1>
	<h3>아이디 또는 패스워드가 다릅니다.</h3>
</body>
</html>