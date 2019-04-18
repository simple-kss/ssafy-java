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
    <form action="updateProduct.do" method="post">
    <input style="display:none;" type="text" name="isbn" value="${isbn }">
        이름 : <input type="text" name="name" value="${name }">  <br>
        가격 : <input type="text" name="price" value="${price }">  <br>
        <button type="submit">수정하기</button>
    </form>
</body>
</html>