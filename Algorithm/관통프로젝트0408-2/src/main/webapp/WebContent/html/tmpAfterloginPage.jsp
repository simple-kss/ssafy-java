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
	<jsp:include page="topnavAfterlogin.jsp" />
	
<!-- 메인 화면 중간 설명 -->
	<div class="container">
		<div class="jumbotron">
			<h1>안전 먹거리 Project!</h1>
			<br>
			<ul>
				<li><h4>식품별 첨가물과 영양 성분의 데이터를 분석을 확인하세요!</h4></li>
				<li><h4>식품 별 알레르기 유의사항을 표시하여 안전한 먹거리를 선택하세요!</h4></li>
				<li><h4>고객이 섭취한 식품들을 통해 어는 정도의 영양분을 섭취 했는지 분석결과를 확인하세요!</h4></li>
			</ul>
			<!-- 			<p> -->
			<!-- 				<a class="btn btn-primary btn-lg" href="#" role="button">Learn -->
			<!-- 					more</a> -->
			<!-- 			</p> -->
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