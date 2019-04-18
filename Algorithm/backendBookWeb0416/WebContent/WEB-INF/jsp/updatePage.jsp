<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>업데이트</h1>
    <form action="updateBook.do" method="post">
    <input style="display:none;" type="text" name="bookid" value="${bookid }">
        제목 : <input type="text" name="title" value="${title }">  <br>
        출판사 : <input type="text" name="publisher" value="${publisher }">  <br>
        년도 : <input type="text" name="year" value="${year }">  <br>
        가격 : <input type="text" name="price" value="${price }">  <br>
        <button type="submit">수정하기</button>
    </form>
</body>
</html>