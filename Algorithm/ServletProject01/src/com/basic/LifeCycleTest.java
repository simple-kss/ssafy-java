package com.basic;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycleTest")
public class LifeCycleTest extends HttpServlet {
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init.....");
	}
	public void destroy() {
		System.out.println("destroy.....");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("deGet.....SSSSSSSSSSSS");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		System.out.println("dePost.....");
	
	}

}
