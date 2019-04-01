<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.hello.Customer" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	ArrayList<String> list = new ArrayList<>();
	list.add("spring");
	list.add("spring1");
	list.add("spring2");
	list.add("spring3");
	
	request.setAttribute("list",list);
	
	ArrayList<Customer> list2 = new ArrayList<>();
	Customer c = new Customer("111","data","la");
	list2.add(c);
	
	request.setAttribute("list2",list2);
	
	
%>

<c:forEach items="${list }" var="i">
	${i }<br>

</c:forEach>

<c:forEach items="${list2 }" var="i">
	num: ${i.num }<br>
	name: ${i.name }<br>
	address: ${i.address }<br>
	<hr>
</c:forEach>
</body>
</html>