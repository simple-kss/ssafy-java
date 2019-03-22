package com.forward;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("city", "seoul");
		request.setAttribute("age", "25");
		
		//Redirect 방식으로 화면 전환. 처음에 클라이언트로부터 받은 request 객체가 계속해서 Redirect된 서블릿으로 전달됨
		response.sendRedirect("Result");
	}

}
