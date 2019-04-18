<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="vo.ProductVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<table>

<h1><a href="productList.do"> 홈페이지 </a></h1>	
	<form action="selectBook.do" method="get">
		<select name="opt">
			<option value="name">이름</option>
		</select>
		<input type="text" name="content">
		<button type="submit"> 검색 </button>
	</form>
	<br>
	
	
	<h1>제품정보</h1>
	<tr>
		<th width="80">제품 번호</th>
		<th width="80">이름 </th>
		<th width="80">가격(원)</th>
	</tr>
	
	<c:forEach var="product" items="${list }">
		<tr>
			 <td>${product.isbn}</td>
             <td>${product.name}</td>
             <td>${product.price}</td>
             <td><a href="deleteProduct.do?isbn=${product.isbn}">제품삭제</a></td>
             <td><a href="updatePage.do?isbn=${product.isbn}">수정하기</a></td>
		</tr>
	</c:forEach>
</table>

<!-- 도서 추가버튼을 만들고,
클릭시 addBook.do Get방식 받고
addBook.do를 처리하는 Servlet
서블릿에서는 addBook.jsp에 포워드
addBook.jsp 화면에서 추가하 정보를 입력받아옴
addBook.do 돌아와서 서블릿에서 DB에 데이터를 INSERT
 -->
 
 	<tr>
 		<td colspan="5" align="right"><a href="addPage.do">제품추가</a></td>
 	</tr>


</body>
</html>