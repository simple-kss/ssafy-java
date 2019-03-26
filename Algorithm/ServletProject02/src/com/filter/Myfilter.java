package com.filter;


import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class Myfilter
 */
@WebFilter(filterName="/Myfilter", urlPatterns= {"/TestServlet"})
public class Myfilter implements Filter {
	
    public Myfilter() {
    	System.out.println("filter 생성자");
    }

	public void destroy() {
		System.out.println("destory...");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//사전처리 작업
		System.out.println("before...");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		//사후처리 작업...
		System.out.println("after...");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init...");
	}

}
