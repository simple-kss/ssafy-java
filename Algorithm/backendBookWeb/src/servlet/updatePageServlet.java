package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.glassfish.external.statistics.impl.StatsImpl;

import dao.BookDAO;
import vo.BookVO;

/**
 * Servlet implementation class deleteBookServlet
 */
@WebServlet("/updatePage.do")
public class updatePageServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String s = (String) req.getParameter("bookid");
		
		BookDAO bookdao = BookDAO.getInstance();
		
		BookVO book = bookdao.selectOne(Integer.parseInt(s));
		
		
		req.setAttribute("bookid", book.getBookid());
		req.setAttribute("price", book.getPrice());
		req.setAttribute("publisher", book.getPublisher());
		req.setAttribute("title", book.getTitle());
		req.setAttribute("year", book.getYear());
		
		// 도서의 전체 목록을 보여주는 bookList.do로 리다이렉션하자
		req.getRequestDispatcher("WEB-INF/jsp/updatePage.jsp").forward(req, res);
	}


}
