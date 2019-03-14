<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<style type="text/css">
#out {
	text-align: center;
}

#in {
	display: inline-block;
}
</style>


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	
	$(document).ready(function () {
		$('#button').click(function () {
			alert("수정 완료");
		});
	});
</script>

</head>
<body>
	<jsp:include page="./nav.html" />

	<form>
		<div id="out">

			<div id="in">
				<br>
				<div>
					<h2>회원 정보 수정</h2>
					<br>
				</div>
				<table>

					<tr>
						<td><label for="id">ID </label></td>
						<td><input type="text" class="form-control" id="id"
							placeholder="ID" readonly></td>
						</td>
					</tr>



					<tr>
						<td><label for="pass">Password </label></td>
						<td><input type="text" class="form-control" id="pass"
							placeholder="Password"></td>
					</tr>

					<tr>
						<td><label for="name">Name </label></td>
						<td><input type="text" class="form-control" id="name"
							placeholder="name"></td>
					</tr>

					<tr>
						<td><label for="address">Address </label></td>
						<td><input type="text" class="form-control" id="address"
							placeholder="Address"></td>
					</tr>

					<tr>
						<td><label for="phone">Phone </label></td>
						<td><input type="text" class="form-control" id="phone"
							placeholder="phone"></td>
					</tr>


				</table>


				<fieldset class="al">
					<legend id="alid">
						<h5>알레르기</h5>
					</legend>
					<div class="checkbox">
						<label><input type="checkbox" value="">대두</label> <label><input
							type="checkbox" value="">땅콩</label> <label><input
							type="checkbox" value="">우유</label> <label><input
							type="checkbox" value="">게</label>
					</div>
					<div class="checkbox disabled">
						<label><input type="checkbox" value="">새우</label> <label><input
							type="checkbox" value="">참치</label> <label><input
							type="checkbox" value="">연어</label> <label><input
							type="checkbox" value="">쑥</label>
					</div>

				</fieldset>

				<button id="button" type="submit" class="btn btn-default">수정
					완료</button>
			</div>

		</div>
	</form>


</body>
</html>