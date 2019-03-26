<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>Customer Data</h1>
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">번호</th>
		      <th scope="col">이름</th>
		      <th scope="col">주소</th>
		    </tr>
		  </thead>
		  <tbody>
			 <c:forEach items="${list }" var="c">
			 <tr>
				<td> ${c.num }</td>
				<td><a href="read.mvc?num=${c.num }">${c.name }</a></td>
				<td> ${c.address }</td>
			</tr>
			</c:forEach>
		  </tbody>
		</table>
		<a href="insertFrom.mvc">고객추가<</a>
	</center>
</body>
</html>