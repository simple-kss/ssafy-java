package com.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Include")
public class Include extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 서버에서 클라이언트로 나갈 문서의 타입 지정(mime type)
		response.setContentType("text/html;charset=euc-kr");
		
		//응답 내보낼 때 사용할 출력 스트림 얻기
		PrintWriter out = response.getWriter();
		
		//forward 방식으로 화면 전환, 처음에 클라이언트로부터 받은 request 객체가 계쏙해서 forward된 서블릿으로 전달됨.
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/result.jsp");
		request.setAttribute("city", "osaka");
		request.setAttribute("age", "22");
		
		
		
		
		
	}

}
