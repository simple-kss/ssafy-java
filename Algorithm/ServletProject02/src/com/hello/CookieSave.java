package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSave
 */
@WebServlet("/CookieSave")
public class CookieSave extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		
		Cookie idcookie = new Cookie("id",id);
		Cookie passcookie = new Cookie("pass", pass);
		
		idcookie.setMaxAge(-1);
		passcookie.setMaxAge(-1);
		
		response.addCookie(idcookie);
		response.addCookie(passcookie);
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>로그인 정보를 쿠키에 저장했습니다.");
		out.println("<a href=CookieTest>cookie");
		out.println("</body></html>");
		
	} 
}
