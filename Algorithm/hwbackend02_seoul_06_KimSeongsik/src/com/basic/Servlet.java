package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String summary = request.getParameter("summary");
		request.setAttribute("name", name);
		request.setAttribute("price", price);
		request.setAttribute("summary", summary);
		RequestDispatcher dispatcher = request.getRequestDispatcher("html/result.jsp");
		dispatcher.forward(request, response);
	}

}
