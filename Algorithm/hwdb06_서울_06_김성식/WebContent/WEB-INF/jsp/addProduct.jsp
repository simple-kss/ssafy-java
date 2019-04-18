<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>제품 추가</h1>
    <form action="addProduct.do" method="post">
    isbn : <input type="text" name="isbn">  <br>
    name : <input type="text" name="name">  <br>
        가격 : <input type="text" name="price">  <br>
        <button type="submit">제품추가</button>
    </form>
</body>
</html>