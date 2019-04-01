package com.hello;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

/**
 * Servlet implementation class CookieTest
 */
@WebServlet("/CookieTest")
public class CookieTest extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버가 저장했던 쿠키 정보 얻어내서 확인
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		if(cookies != null && cookies.length != 0) {
			for (int i = 0; i < cookies.length; i++) {
				String name = cookies[i].getName();
				String value = cookies[i].getValue();
				cookies[i].setValue("");
				out.println(name + ":" + value + "<br>");
			}
		}
		
		//cookie update ....
		Cookie idcookie = new Cookie("cnt", "1");
		Cookie passcookie = new Cookie("code", "100");
		
		idcookie.setMaxAge(-1);
		passcookie.setMaxAge(-1);
		
		response.addCookie(idcookie);
		response.addCookie(passcookie);
		
		
		
		
		
		
		
		
		
		
		
	}
}
