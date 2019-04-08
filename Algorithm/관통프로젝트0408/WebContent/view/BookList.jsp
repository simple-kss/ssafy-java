<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="mvc.vo.Food"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 목록</title>
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

</script>
<style type="text/css">
	.container{
		text-align: center;
	}
	form{
		margin: 10px;
		float: right;
	}
	table{
		margin: 20px;
		width: 100%;
	}
	table thead tr th{
		background-color: #A4A4A4;
		text-align: center;
	}
	table tbody tr th{
		text-align: center;
	}
	table tr th{
		margin: 10px;
		padding: 10px;
	}

</style>
</head>
<body>
	<div class="container">
		<h1>도서 목록 화면</h1>
		<jsp:include page="print.jsp"/>
			<form method="get" action="MainServlet">
				<select name="search" size="1">
					<option value="Title">도서명</option>
					<option value="Publisher">출판사</option>
					<option value="Isbn">도서번호</option>
					<option value="Price">가격</option>
				</select>
				<input type="hidden" name="type" value="search">
				<input type="text" name="data">
				<input type="submit" value="검색">
			</form>
			<table class="BookList" border="3">
				<thead>
					<tr>
						<th>도서번호</th>
						<th>도서명</th>
						<th>도서분류</th>
						<th>저자</th>
					<tr>
				<tbody>
					<c:forEach items="${list }" var="c">
					 <tr>
					 	<th> ${c.isbn }</th>
						<th> <a href="BookView.mvc?isbn=${ c.isbn } ">
						 ${c.title }</a></th>
						<th> ${c.catalogue }</th>
						<th> ${c.author }</th>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="register.mvc">도서 등록</a>
	</div>
	
</body>
</html>

