package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

/**
 *
 * 클라이언트 요청을 받아, BookDAO를 이용해서 DB에 작업 후 결과를 받아서
 * jsp화면에 결과를 전달
 * 
 *
 */
@WebServlet("/bookList.do")
public class BookListServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// BookDAO를 이용해서 책의 리스트 조회.
		BookDAO bookDAO = BookDAO.getInstance(); // 싱글톤
		List<BookVO> blist = bookDAO.selectAll();
		
		// attribute 에 실어
		req.setAttribute("blist", blist);
		
		// bookList.jsp에 포워드
		req.getRequestDispatcher("WEB-INF/jsp/bookList.jsp").forward(req, resp);
	}
		

}
