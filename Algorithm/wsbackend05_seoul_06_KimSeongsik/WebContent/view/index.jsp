<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">

</script>
<style type="text/css">
	.container{
		text-align: center;
	}
	a {
		size: 20px;
	}

</style>
</head>
<body>
	<div class="container">
		<h1>메뉴 선택 </h1>
<!-- 			<h2><a href="MainServlet?type=view">도서 목록</a></h2> -->
			<h2><a href="register.mvc">도서 등록 하기</a><br></h2>
			<h2><a href="BookList.mvc">도서 목록</a></h2>
			<h2><a href="logout.mvc">로그아웃</a></h2>
	</div>
	
</body>
</html>