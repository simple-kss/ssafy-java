<%@page import="com.ssafy.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>도서 정보</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style type="text/css">
	.container{
		text-align: center;
	}
	table{
		margin: 20px;
		width: 70%;
	}
	table thead tr th{
		background-color: #A4A4A4;
		text-align: center;
	}
	table tbody tr th{
		background-color: #A4A4A4;
		text-align: center;
	}
	table tbody tr td{
		text-align: left;
		padding: 10px;
		width: 700px;
	}
	table tr th{
		margin: 10px;
		padding: 10px;
	}
	h1{
		padding-right: 300px;
	}
	.links{
		padding-right: 300px;
	}

</style>
</head>
<body>
	<div class="container">
		<h1>입력된 도서 정보</h1>
		<%
			Book now = (Book)request.getAttribute("book");
		%>
		<table border="2">
			<thead>
				<tr>
					<th colspan="5">도서 정보</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<th>도서명</th>
					<td><%=now.getTitle() %></td>
				</tr>
				<tr>
					<th>도서번호</th>
					<td><%=now.getIsbn() %></td>
				</tr>
				<tr>
					<th>도서분류</th>
					<td><%=now.getCatalogue() %></td>
				</tr>
				<tr>
					<th>도서국가</th>
					<td><%=now.getNation() %></td>
				</tr>
				<tr>
					<th>출판일</th>
					<td><%=now.getPublishDate() %></td>
				</tr>
				<tr>
					<th>출판사</th>
					<td><%=now.getPublisher() %></td>
				</tr>
				<tr>
					<th>저자</th>
					<td><%=now.getAuthor() %></td>
				</tr>
				<tr>
					<th>도서가격</th>
					<td><%=now.getPrice() %> <%=now.getCurrency() %></td>
				</tr>
				<tr>
					<th>도서설명</th>
					<td><%=now.getDescription() %></td>
				</tr>
			</tbody>
		</table>
		<div class="links">
			<a href="MainServlet?type=view">도서목록으로 돌아가기</a>
			<a href="MainServlet?type=delete&isbn=<%=now.getIsbn() %>">도서삭제</a>
		</div>
	</div>
</body>
</html>