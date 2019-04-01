<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="id" value="${param.id }"/>
<c:set var="pw" value="${param.pw }"/>
<c:if test="${id !='tom' || pw !='123'}">
    <c:redirect url="login.html">
    </c:redirect>
</c:if>
<h1>로그인 성공</h1>
</body>
</html>
