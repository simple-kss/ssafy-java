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

/* $(document).ready(function(){
	$.ajax( {
	    url : 'res/foodInfo.xml',            
	    dataType : 'xml',           
	    success : function( result ) {//result:서버에서 온 xml data
	        if ( $(result).find('foods').length > 0 ) {//find(): xml문서 안에서 원하는 태그 찾기
	            $(result).find('food').each(function() {//each(): 찾은  book 태그 각각에 대하여 반복작업 수행
	                var div = $('<div class="pdlist col-md-3"></div>').css('margin-bottom','30px');
	                
	            	
	                div.append($('<p>' + $(this).find('code').text() + '</p>').css('display', 'none'));
	            	
	            	
	                div.append($('<h4>' + $(this).find('name').text() + '</h4>').css('text-align','center'));
	                
	                div.append($('<p></p>'));
	                var a = $('<a href="product_specific.jsp"></a>');
	                a.append($('<img class="col-md-12">').attr('src', $(this).find('image').text()));
	                div.append(a);
	                
	                
	                div.append($('<p>' + $(this).find('maker').text() + '</p>').css('font-style','italic'));
	                div.append($('<span>' + $(this).find('material').text() + '</span>').css('display','inline-block').css('overflow','hidden').css('width','200px').css('height','100px'));
	                

	                    
	                    
	                $('.cont').append(div);
	            });
	        }
	    }
	}); 
	
	
	
	 $('#btn_search').click(function(){
		 console.log("123");
         $('.cont').empty();
         $.ajax({
             url : 'res/foodInfo.xml',            
             dataType : 'xml',
             success : function( result ) {//result:서버에서 온 xml data
                 if ( $(result).find('foods').length > 0 ) {//find(): xml문서 안에서 원하는 태그 찾기
                     $(result).find('food').each(function() {//each(): 찾은  book 태그 각각에 대하여 반복작업 수행
                         if($(this).find('maker').text().includes($('#search').val()) || $(this).find('material').text().includes($('#search').val()) || $(this).find('name').text().includes($('#search').val())){
                             var div = $('<div class="pdlist col-md-3"></div>').css('margin-bottom','30px');
                             
//                           div.append($('<p id="code">' + $(this).find('code').text() + '</p>').css('display', 'none'));
                             div.append($('<h4>' + $(this).find('name').text() + '</h4>').css('text-align','center').css('font-weight','bold'));
                             div.append($('<p></p>').append($('<img class="col-md-12">').attr('src', $(this).find('image').text())));
                             div.append($('<p>' + $(this).find('maker').text() + '</p>').css('font-style','italic'));
                             div.append($('<span>' + $(this).find('material').text() + '</span>').css('display','inline-block').css('overflow','hidden').css('width','200px').css('height','100px'));
                             $('.cont').append(div);
                         }   
                     });
                 }
             }
         });
     });
}); */

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


<h1> 전체 상품</h1>
<div id="wrap">
	<div id="content">
	
		
			<% request.setCharacterEncoding("euc-kr"); %>
			<% List<Food> list = (List)request.getAttribute("list"); %>
			<%
				for(int i = 0; i < list.size(); i++) {
			%>
				<div class="pdlist col-md-3 item" >
				<%-- <p style="display:none" ><%=list.get(i).getCode() %></p> --%>
				<h3 style="text-align:center" ><%=list.get(i).getName() %></h3>
				<p></p>
				
				<a href="specific.mvc?id=<%=list.get(i).getCode()%>">
				<img class="col-md-12" src="<%=list.get(i).getImg() %>">
				</a>
				<p><%=list.get(i).getMaker()%></p>
				
				<%-- <span><%=list.get(i).getMaterial()%></span> --%>
			</div>
			<% } %>
		
	
			
	</div> <!-- content -->
	
</div> <!-- wrap -->



</body>

</body>
</html>