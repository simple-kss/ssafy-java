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

import mvc.controller.CustomerController;

@WebFilter("*.mvc")
public class CustomerFilter implements Filter {
	
	CustomerController controller;

    public CustomerFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		req.setCharacterEncoding("euc-kr");
		
		//클라이언트로부터 들어오는 요청을 구분하는 문자열
		//http://localhost:7070/mvc/list.mvc
		String reqString = req.getServletPath();
		if(reqString.equals("/list.mvc")) { // 초기화면 요청
			controller.list(req, res);
		}
		else if(reqString.equals("/read.mvc")) { // 상세정보화면 요청
			controller.read(req, res);
		}
		else if(reqString.equals("/insertFrom.mvc")) { // 상세정보화면 요청
			controller.insertFromPrint(req, res);
		}
		else if(reqString.equals("/insertProcess.mvc")) { // 상세정보화면 요청
			controller.insert(req, res);
		}
		else if(reqString.equals("/delete.mvc")) { // 상세정보화면 요청
			controller.delete(req, res);
		}
		
		
		
		// 사전처리
//		chain.doFilter(request, response);
		// 사후처리
	}

	public void init(FilterConfig fConfig) throws ServletException {
		controller = new CustomerController(); // 1개만 만들어짐
	}

}
