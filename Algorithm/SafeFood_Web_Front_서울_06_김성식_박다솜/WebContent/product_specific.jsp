<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['영양성분', 'Percent per Day'],
          ['탄수화물',     11],
          ['지방',      2],
          ['단백질',  2],
          ['비타민', 2],
          ['무기질',    7]
        ]);

        var options = {
          title: 'My nutrition '
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>

<style>
#back {
	text-align: center;
	width: 100%;
	height: 100px;
	background-color: rgb(192, 192, 192);
}

#center {
	display: inline-block;
}

#content {
	/* margin: 0px auto; */
	/* text-align: center; */
	display: inline-block;
}

#product {
	display: inline-block;
}

#ptable {
	border-spacing: 50px;
}

img {
	width: 300px;
	height: 300px;
}

#wrap {
	text-align: center;
	width: 100%;
}

.cont {
	text-align: center;
	width: 900px;
}

.inline {
	display: inline-block;
	height: 100%;
}
</style>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

</head>
<body>
	<jsp:include page="./nav.html" />

	

	<div id="wrap">
		<div id="content">
			<h2>
				<b>제품 정보</b>
			</h2>
			<i></i>

			<div id="product">
				<span><img src="img/맥심티오피마스터라떼.jpg"></span>
				<div>
					<table id="ptable">
						<tr>
							<td>제품명</td>
							<td><label id="pname"></label></td>
						</tr>

						<tr>
							<td>제조사</td>
							<td><label id="produc"></label></td>
						</tr>

						<tr>
							<td>원재료</td>
							<td><label id="ma">새우 밀가루 우유어쩌 </label></td>
						</tr>

						<tr>
							<td>알레르기<br>성분
							</td>
							<td><label id="al"> </label></td>
						</tr>


					</table>
					
					<div>
						<label>Quantity</label> <input type="number" id="quantity">
					</div>
					<div class="btn-group">
						<button type="button" class="btn btn-primary">추가</button>
						<button type="button" class="btn btn-primary">찜</button>
					</div>



				</div>

			</div>

		</div>
	</div>
	
	<div id="piechart" style="width: 900px; height: 500px;"></div>




</body>
</html>