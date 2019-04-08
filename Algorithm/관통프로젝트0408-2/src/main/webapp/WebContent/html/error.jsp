<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SSAFY Project</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="dataParsing.js"></script>
<link rel="stylesheet" type="text/css" href="css.css">
</head>
<body>
<!-- 상단 네비 -->
	<jsp:include page="topnav.jsp" />
	
<!-- 메인 화면 중간 설명 -->
	<div class="container">
		<div class="jumbotron">
			<h1>오류!</h1>
			<br>
			<ul>
				<li><h4>오류가 발생했습니다. 다시 시도하세요.</h4></li>
			</ul>
		</div>
	</div>
				
<!-- 제품 설명 -->
	<div class="container">
		<div id="all_list"></div>
	</div>

<!-- 하단 바  -->
<jsp:include page="bottombar.jsp" />


</body>
</html>