<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Date now = (Date)request.getAttribute("time");
	//Date now = new Date();
	
%>

현재시간 : <%= now %>
2: ${time }
<!--  EL : 서블릿이 출력에 사용할 데이터를 Attribute에 실어 보내준 것을
			JSP에서 꺼내기위한 용도
			-->

</body>
</html>