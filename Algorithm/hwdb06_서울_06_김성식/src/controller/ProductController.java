package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ProductDAO;
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
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/Book.jsp");
		dispatcher.forward(req, res);
	}


	public void productList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ArrayList<ProductVO> list = (ArrayList<ProductVO>) dao.selectAll(); // 컨트롤러에게 공개 안하는 메소드
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsb/productList.jsp");
		dispatcher.forward(req, res);
		
	}
}
