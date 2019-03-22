package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Survey
 */
@WebServlet("/Survey")
public class Survey extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		String[] a = request.getParameterValues("ide");
		out.println("<html><body>");
		for (int i = 0; i < a.length; i++) {
			out.println("<h3>" + a[i] +"<h3>");
		}
		

		out.println("</body></html>");
	}

}
