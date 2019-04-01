package com.basic;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Redirect
 */
@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("city", "seoul");
		request.setAttribute("age", "25");
		
		// redirect 방식으로 화념 전환. 처음에 클라이언트로부터 받은 request 객체가 redirect된 서블릿으로 전달되지 않음.
		// 새로운 request
		response.sendRedirect("Result");
	}

}
