<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.ssafy.BookMgr,com.ssafy.Book,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#bt").click(
				function() {
					var data = $("#val").val();
					var opt = $("#opt").val();
					location.href = 'MainServlet?do=search&opt=' + opt
							+ '&val=' + data;
		})
	});
</script>
<title>Insert title here</title>
</head>
<body>
	<%
		List<Book> bList = (ArrayList) request.getAttribute("bList");
/* 		BookMgr mgr = (BookMgr) request.getAttribute("mgrObj"); */
		String opt = (String) request.getAttribute("opt");
		String val = (String) request.getAttribute("val");
	%>
	<h1>도서 목록 화면</h1>
	<div style="float: right">
		<select size='1' class='select' id="opt">
			<option value='all'>구분</option>
			<option value='oIsbn'>도서번호</option>
			<option value='oTitle'>도서명</option>
			<option value='oPrice'>도서가격</option>
			<option value='oPublisher'>출판사</option>
		</select>
		<input type="text" id="val">
		<input id="bt" type="button" value="검색">
	</div>
	<br>
	<table>
		<tr align="center">
			<td>도서번호</td>
			<td>도서명</td>
			<td>도서분류</td>
			<td>저자</td>
		</tr>
		<%
			for (Book b : bList)
			{
		%>
		<tr>
			<td><%=b.getIsbn()%></td>
			<td>
				<a href="MainServlet?do=view&name=<%=b.getTitle()%>"><%=b.getTitle()%></a>
			</td>
			<td><%=b.getCatalogue()%></td>
			<td><%=b.getAuthor()%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>