<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.ssafy.book.BookMgr,com.ssafy.book.Book,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Book> bList = (ArrayList) request.getAttribute("bList");
		String title = (String) request.getAttribute("title");
		Book b = new Book();
	%>
	<h1>입력된 도서 정보</h1>
	<%
		for (Book e : bList)
		{
			if (e.getTitle().equals(title))
			{
				b = e;
			}
		}
	%>
	도서명 :
	<%=b.getTitle()%>
	<br> 도서번호 :
	<%=b.getIsbn()%>
	<br> 도서분류 :
	<%=b.getCatalogue()%>
	<br> 도서국가 :
	<%=b.getNation()%>
	<br> 출판일 :
	<%=b.getPublishDate()%>
	<br> 출판사 :
	<%=b.getPublisher()%>
	<br> 저자 :
	<%=b.getAuthor()%>
	<br> 도서가격 :
	<%=b.getPrice()%>
	<br> 도서설명 :
	<%=b.getDescription()%>
	<br>
	<a href='MainServlet?do=list'>도서 목록으로 돌아가기</a>
	<a href='MainServlet?do=delete&isbn=<%=b.getIsbn()%>'>도서 삭제</a>
</body>
</html>