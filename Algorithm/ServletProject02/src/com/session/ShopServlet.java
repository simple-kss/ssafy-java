package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShopServlet
 */
@WebServlet("/ShopServlet")
public class ShopServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		out.println("<h1>my shopping mall</h1>");
		out.println("<form method=post action=CartServlet>");
		out.println("<input type=submit value=쇼핑백에토마토넣기 name=tomato>");
		out.println("<input type=submit value=쇼핑백에사과넣기 name=apple>");
		out.println("</form>");
		
		out.println("<form method=post action=Checkout>");
		out.println("<input type=submit value=쇼핑백보기 name=see>");
		out.println("<input type=submit value=계산하기 name=buy>");
		out.println("</form>");
	}


}
