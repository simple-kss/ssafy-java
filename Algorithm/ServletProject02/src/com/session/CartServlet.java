package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//이전화면에서 넘어온 값을 받아서 session에 정보 저장

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 예전에 만들어 놓은 세션이 있는지 체크해서
		// 없으면 새로하나 만들어주고
		// 있으면 그것을 리턴해준다.
		
		// 없으면 새로 만들어줌 --> true
		// 없으면 null을 리턴 --> false
		
		
		response.setContentType("text/html;charset=euc-kr");
		HttpSession session = request.getSession(true);
		PrintWriter out = response.getWriter();
		String msg = "";
		
		if(session.isNew()) {
			// 수량을 증가시켜야하니까 배열을 1개씩 만들어놓았따.
			session.setAttribute("apple", new int[] {0});
			session.setAttribute("tomato", new int[] {0});
		}
		
		// 세션안에 저장되어있는 데이터 꺼냄
		int[] apple = (int[])session.getAttribute("apple");
		int[] tomato = (int[])session.getAttribute("tomato");
		
		if(request.getParameter("apple") != null) {
			apple[0]++;
			msg ="사과를 쇼핑백에 추가했습니다.";
		}
		else {
			tomato[0]++;
			msg ="토마토를 쇼핑백에 추가했습니다.";
		}
		
		out.println("<h1>" + msg + "</h1>");
		
	} // end of func

}
