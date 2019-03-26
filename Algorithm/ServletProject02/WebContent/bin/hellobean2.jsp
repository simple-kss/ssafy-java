<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id = "hello" class = "com.hello.HelloBean" scope="application" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name: <%= hello.getName() %>

<%  hello.setName("123"); %>


name: <%= hello.getName() %>


</body>
</html>