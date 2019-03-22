package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<html><body>");
		out.println("<h3>boyru<h3>");
		out.println("<a href=HelloServlet>돌아가기</a>");
		out.println("<a href=InsertForm?num=123&pass=abc&address=서울>InsertForm서블릿으로 가기</a>");
		out.println("</body></html>");
		
	}


}
