package servlet;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Whattime.dd")
public class WhatTimeServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//필요한 작업을 수행(현재 시간 구함)
		Date date = new Date();
		
		// jsp에 전달할 내용을 req에 실어
		req.setAttribute("time", date);
		
		// jsp화면으로 포워드
		req.getRequestDispatcher("/WEB-INF/jsp/whattime.jsp").forward(req,resp);
	}
	
	


}
