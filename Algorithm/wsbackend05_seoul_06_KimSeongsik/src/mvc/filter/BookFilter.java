package mvc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.controller.BookController;

/**
 * Servlet Filter implementation class BookFilter
 */

@WebFilter("*.mvc")
public class BookFilter implements Filter {
	BookController controller;

    public BookFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		req.setCharacterEncoding("euc-kr");
		
		//클라이언트로부터 들어오는 요청을 구분하는 문자열
		//http://localhost:7070/mvc/list.mvc
		String reqString = req.getServletPath();
		if(reqString.equals("/login.mvc")) {
			controller.login(req, res);
		}
		else if(reqString.equals("/loginSuccess.mvc")) {
			controller.loginSuccess(req, res);
		}
		else if(reqString.equals("/insert.mvc")) {
			controller.insert(req, res);
		}
		else if(reqString.equals("/register.mvc")) {
			controller.register(req, res);
		}
		else if(reqString.equals("/logout.mvc")) {
			controller.logout(req, res);
		}
		else if(reqString.equals("/Result.mvc")) {
			controller.result(req, res);
		}
		else if(reqString.equals("/BookList.mvc")) {
			controller.BookList(req, res);
		}
		else if(reqString.equals("/BookView.mvc")) {
			controller.BookView(req, res);
		}
		else if(reqString.equals("/delete.mvc")) {
			controller.delete(req, res);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
		controller = new BookController();
	}

}
