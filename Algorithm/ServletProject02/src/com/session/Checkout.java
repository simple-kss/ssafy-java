package com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


// Session안에 저장되어 있는 정보를 꺼내서 화면에 출려하거나 / 세션안의 정보 삭제 OR 세션 자체를 삭제

@WebServlet("/Checkout")
public class Checkout extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		
		// 1.session얻어내기
		HttpSession session = request.getSession(false);
		String msg = "";
		
		if(session == null) {
			out.println("<h1>바구니에 물건이 하나도 없습니다.</h1>");
			out.println("<a href=ShopServlet>쇼핑하러가기</a>");
		} else {
			int[] apple = (int[])session.getAttribute("apple");
			int[] tomato = (int[])session.getAttribute("tomato");
			
			if(request.getParameter("see") != null) {
				msg = apple[0] + "개의 사과와 " + tomato[0] + "개의 토마토를 가지고 있습니다.";
			} else { //계산하기
				msg = apple[0] + "개의 사과와 " + tomato[0] + "개의 토마토를 주문했습니다. 그리고 쇼핑백의 상품은 삭제되었습니다.";
				session.invalidate();
			}
			
			response.setHeader("pragma","no-cache"); // 브라우저에 캐쉬 정보 남아 있지 않도록
			out.println("<h1>" + msg + "</h1>");
			out.println("<a href=ShopServlet>back</a>");
		}
		
	} // end of function
}
