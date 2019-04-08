<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
	import="java.util.*, com.ssafy.vo.*"    
    %>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
	#back {
		text-align: center;
		width : 100%;
		height : 100px;
		background-color: rgb(192,192,192);	
	}
	
	#center {
		display: inline-block;
	}
	
	#content{
		/* margin: 0px auto; */
		/* text-align: center; */
		display: inline-block;
		text-align: center;
	}
	
	img {
		width:300px;
		height:300px;
	}
	
	#wrap{
		text-align: center;
		width : 100%;
	}
	
	.cont{
		text-align: center;
		width:900px;
	}
	
	.inline {
		display: inline-block;
		height: 100%;
	}
	
	h1 {
		text-align: center;
	}
	
	
	.item {
		margin-bottom: 30px;
	}


</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script>
</script>

</head>
<body>

<jsp:include page="./nav.html" />

	<div id="back">
		<div id="center">
			<div class="input-group">
				<form method="get" action="search.mvc" >
					<input id="search" name="data" type="text" class="form-control" placeholder="Search">
					<div class="input-group-btn">
						<button type="submit" id="btn_search" class="btn btn-default" >
							<i class="glyphicon glyphicon-search"></i>
						</button>
					</div>
				</form>

			</div>
		
		</div>
	</div>


<h1> 상세 상품 정보</h1>
<div id="wrap">
	<div id="content">
			<% request.setCharacterEncoding("utf-8"); %>
			<% Food it = (Food) request.getAttribute("item"); %>
				<div class="pdlist col-md-3 item" >
				<p style="display:none" ><%=it.getCode() %></p>
				<h4 style="text-align:center" ><%=it.getName() %></h4>
				<p></p>
				
				<a href="specific.mvc?id=<%=it.getCode()%>">
				<img class="col-md-12" src="<%=it.getImg() %>">
				</a>
				<p><%=it.getMaker()%></p>
				
				<span><%=it.getMaterial()%></span>
			</div>
		
	
			
	</div> <!-- content -->
	
</div> <!-- wrap -->



</body>

</body>
</html>