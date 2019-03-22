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
public class MainServlet extends HttpServlet
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// 1. 클라이언트가 보낸 데이터 받기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String booknum1 = request.getParameter("booknum1");
		String booknum2 = request.getParameter("booknum2");
		String booknum3 = request.getParameter("booknum3");
		String title = request.getParameter("title");
		String kind = request.getParameter("kind");
		String region[] = request.getParameterValues("region");
		String date = request.getParameter("date");
		String publisher = request.getParameter("publisher");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String summary = request.getParameter("summary");
		RequestDispatcher dispatcher = request.getRequestDispatcher("html/LoginSuccess.jsp");

		if (id == null && pass == null)
		{
			dispatcher = request.getRequestDispatcher("html/Sucess.jsp");
			
			dispatcher.forward(request, response);
		}
		else
		{
			if (id.equals("ssafy") && pass.equals("1111"))
			{
				dispatcher.forward(request, response);
			}
			else
			{
				String err = "도서 정보 관리 ERROR";
				dispatcher = request.getRequestDispatcher("html/Error.jsp");
				request.setAttribute("e1", err);
				dispatcher.forward(request, response);
			}
		}
	} // end of doPost
	
	private void process(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	private void search(HttpServletRequest request, HttpServletResponse response) {
		
	}
	
	private void list(HttpServletRequest request, HttpServletResponse response) {

	}
	
	private void view(HttpServletRequest request, HttpServletResponse response) {

	}
	
	private void delete(HttpServletRequest request, HttpServletResponse response) {

	}
	
	private void save(HttpServletRequest request, HttpServletResponse response) {

	}
	
	
	
	

}
