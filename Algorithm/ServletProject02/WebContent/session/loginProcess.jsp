<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	ArrayList<String> list = new ArrayList<>();
	
	// session에 저장하기
	// JSP 기본객체와 활성범위
	
	list.add(id);
	list.add("red");
	list.add("pink");
	list.add("blue");
	session.setAttribute("id", id);
	session.setAttribute("pass", pass);
	session.setAttribute("list", list);
	response.sendRedirect("main.jsp");


%>

</body>
</html>