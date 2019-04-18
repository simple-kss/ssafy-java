package filter;

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

import controller.ProductController;

/**
 * Servlet Filter implementation class BookFilter
 */

@WebFilter("*.do")
public class ProductFilter implements Filter {
	ProductController controller;

    public ProductFilter() {
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
		if(reqString.equals("/productList.do")) {
			controller.productList(req, res);
		}
		else if(reqString.equals("/addProduct.do")) {
			controller.addProduct(req, res);
		}
		else if(reqString.equals("/addPage.do")) {
			controller.addPage(req, res);
		}
		else if(reqString.equals("/deleteProduct.do")) {
			controller.deleteProduct(req, res);
		}
		else if(reqString.equals("/updatePage.do")) {
			controller.updatePage(req, res);
		}
		else if(reqString.equals("/updateProduct.do")) {
			controller.updateProduct(req, res);
		}
		else if(reqString.equals("/selectBook.do")) {
			controller.selectProduct(req, res);
		}
		
		

	}

	public void init(FilterConfig fConfig) throws ServletException {
		controller = new ProductController();
		System.out.println("123");
	}

}
