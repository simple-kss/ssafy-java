package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
import dao.ProductDAO;
import vo.ProductVO;
import vo.ProductVO;

// FrontController에서 넘어온 요청을 DAO에 넘겨서 작업 지시하는 객체
// DAO에게 일시키고, DAO의 결과를 받는 애
// DAO한테서 받은 결과를 저장하고 JSP로 넘어감 (forward방식으로).. request dispatcher가 필요함
public class ProductController {
	ProductDAO dao;

	public ProductController() {
		dao = ProductDAO.getInstance();
	} // end of func

	public void register(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/Product.jsp");
		dispatcher.forward(req, res);
	}


	public void productList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ArrayList<ProductVO> list = (ArrayList<ProductVO>) dao.selectAll(); // 컨트롤러에게 공개 안하는 메소드
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/productList.jsp");
		dispatcher.forward(req, res);
		
	}

	public void addProduct(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		// addProduct.jsp에서 폼태그로 받은 추가할 책 정보를 담어왔음
		// 파라미터로 넘어온 값을 꺼내서 ProductVO 객체로 만들어야해
		ProductVO Product = new ProductVO();
		Product.setIsbn(req.getParameter("isbn"));
		Product.setName(req.getParameter("name"));
		Product.setPrice(Integer.parseInt( req.getParameter("price")));
		
		// DB에 INSERT 작업 진행(ProductVO)
		ProductDAO Productdao = ProductDAO.getInstance();
		Productdao.insertProduct(Product);
		
		// 도서의 전체 목록을 보여주는 ProductList.do로 리다이렉션하자
		res.sendRedirect("productList.do");
	}

	public void deleteProduct(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String s = (String) req.getParameter("isbn");
		
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		// DB에 DELETE 작업 진행(ProductVO)
		ProductDAO Productdao = ProductDAO.getInstance();
		Productdao.deleteProduct(s);
		
		// 도서의 전체 목록을 보여주는 ProductList.do로 리다이렉션하자
		res.sendRedirect("productList.do");
	}

	public void updatePage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String s = (String) req.getParameter("isbn");
		
		ProductDAO Productdao = ProductDAO.getInstance();
		
		ProductVO Product = Productdao.selectOne(s);
		
		req.setAttribute("isbn", Product.getIsbn());
		req.setAttribute("name", Product.getName());
		req.setAttribute("price", Product.getPrice());
		
		// 도서의 전체 목록을 보여주는 ProductList.do로 리다이렉션하자
		req.getRequestDispatcher("WEB-INF/jsp/updatePage.jsp").forward(req, res);
	}
	

	public void updateProduct(HttpServletRequest req, HttpServletResponse res) throws IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		ProductVO Product = new ProductVO();
		Product.setIsbn(req.getParameter("isbn"));
		Product.setName(req.getParameter("name"));
		Product.setPrice(Integer.parseInt(req.getParameter("price")));
		
		ProductDAO Productdao = ProductDAO.getInstance();
		Productdao.updateProduct(Product);
		
		res.sendRedirect("productList.do");
	}

	public void addPage(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.getRequestDispatcher("WEB-INF/jsp/addProduct.jsp").forward(req, res);
	}

	public void selectProduct(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String name = req.getParameter("content");
		
		List<ProductVO> list = dao.selectName(name);
		System.out.println(list);
		req.setAttribute("list", list);
		
		req.getRequestDispatcher("WEB-INF/jsp/productList.jsp").forward(req, res);
		
	}
}
