package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;encoding=UTF-8");
		PrintWriter out =  response.getWriter();
		
        //forward 방식으로 전환, 처음에 클라잉너트로부터 받은 request 객체가 계속해서 forward된 서블렛으로 전달됨
        //RequestDispatcher dispatcher=request.getRequestDispatcher("Result");//화면 넘길 준비		
		RequestDispatcher dispatcher=request.getRequestDispatcher("html/Result.html");
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		
		if(id.equals("ssafy") && pw.equals("1111")) {
//			response.sendRedirect("html/Result.html");
//			request.setAttribute("city", "osaka");
//			request.setAttribute("age", "22");
			dispatcher.forward(request,response);
		}
		else {
			dispatcher=request.getRequestDispatcher("html/login.html");
			dispatcher.forward(request,response);
//			response.sendRedirect("html/login.html");
		}

	}

}

