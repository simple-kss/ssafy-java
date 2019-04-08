<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
		<nav class="navbar navbar-default navbar-fixed-top navbar"
			role="navigation" style="margin-top: 50px;">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-ex1-collapse">
						<span class="sr-only">toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a href="mainPage1.jsp">
						<img alt="ssafy" src="../img/ssafy.png">
					</a>
				</div>
<!-- 메인 nav -->
				<div class="collapse navbar-collapse navbar-right navbar-ex1-collapse">
					<ul class="nav navbar-nav">
						<li><a href="#">공지 사항</a></li>
						<li><a href="#">식품 정보</a></li>
						<li><a href="#">베스트 섭취 정보</a></li>
						<li><a href="#">내 섭취 정보</a></li>
						<li><a href="#">예상 섭취 정보</a></li>
					
<!-- 분류 dropbox -->
						<li><div class="dropdown" style="display: inline-block">
							<button class="btn btn-default dropdown-toggle" type="button"
							id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">	분류 <span class="caret"></span>
							</button>	
							<ul class="dropdown-menu" role="menu"	aria-labelledby="dropdownMenu1">
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">상품명</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">제조사</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">원재료</a></li>
								<li role="presentation"><a role="menuitem" tabindex="-1"
									href="#">알레르기</a></li>
							</ul>
						</div>
						</li>
<!-- 검색 input -->
						<li>
							<form action="find.html" class="navbar-form navbar-left"
								role="search">	
								<div class="form-group">
									<input type="text" class="form-control" placeholder="검색">
								</div>
								<button type="submit" class="btn btn-default">검색</button>
							</form>
						</li>		
					</ul>
				</div>
			</div>
		</nav>
		
<!-- 최상단 정보 nav -->
		<nav class="navbar navbar-default navbar-fixed-top" id="topbar">
			<div class="container">
				<div class="navbar-myinfo">
				<%
				HttpSession userSession = request.getSession();
				String username=(String)userSession.getAttribute("name");
				if (userSession.getAttribute("name") != null) {
				%>
					<label><span class="glyphicon glyphicon-off" aria-hidden="true"></span>	<a href="logout.jsp"><%=username%>환영합니다 </a></label>
					<label><span class="glyphicon glyphicon-off" aria-hidden="true"></span>	<a href="logout.jsp">로그아웃</a></label>
					<label> <span class="glyphicon glyphicon-user" aria-hidden="true"></span>	<a href="myinfo.jsp">내 정보</a></label>
				<% } else { %>
					<label>	<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> <a href="join.jsp">회원가입</a></label>
					<label><span class="glyphicon glyphicon-off" aria-hidden="true"></span>	<a href="login.jsp">로그인</a></label>
				<% } %>
				</div>
			</div>
		</nav>
	</div>
</body>
</html>