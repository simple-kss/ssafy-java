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

<link rel="stylesheet" type="text/css" href="detailCss.css">
</head>
<body>
	<!-- 상단 네비 -->
	<jsp:include page="topnav.jsp" />

	<!-- 제품 정보 -->
	<div class="container" style="text-align: center">
		<h1 style="display: inline-block">제품 정보</h1>
	</div>

	<br>
	<div class="container">
		<div style="text-align: center;">
			<img alt="비타500칼슘.jpg" src="../img/비타500칼슘.jpg"
				style="width: 300px; height: 300px; display: inline-block;">

		</div>
		<br>
		<div>
			<table class="table table-hover"
				style="display: inline-block; padding: 20px">
				<tr>
					<th>제품명</th>
					<th>비타500칼슘</th>
				</tr>
				<tr>
					<th>제조사</th>
					<th>광동제약</th>
				</tr>
				<tr>
					<th>원재료</th>
					<th>정제수,액상과당,농축사과과즙 ( 당도 72Brix이상 , 뉴질랜드산 ),비타민C 0.5% ( 900%
						),퓨라칼 (칼슘12%이상)0.05%,합성착향료 ( 드링크향 ),구연산,케이디비타
						2800,구연산삼나트륨,펙틴,타우린,DL-사과산,오렌지추출물</th>
				</tr>
				<tr>
					<th>알레르기 성분</th>
					<th></th>
				</tr>
			</table>
		</div>
		<div style="text-align: center">
			<img style="display: inline-block" alt="" src="../img/tmpChart.jpg">
		</div>

<!-- 오른쪽 배너 -->
		<div class="banner"	style="position: fixed; right: 300px; top: 200px; width: 150px; height: 180px;">
			<label for="example-number-input" >Quantity</label>
				<div>
				  <input class="form-control" type="number" value="1" id="example-number-input">
				</div>
			<br>
			<button type="button" class="btn btn-primary btn-lg active">추가</button>
			<button type="button" class="btn btn-default btn-lg active">찜</button>
		</div>
		
	</div>
	<!-- 하단 바  -->
	<jsp:include page="bottombar.jsp" />
</body>
</html>