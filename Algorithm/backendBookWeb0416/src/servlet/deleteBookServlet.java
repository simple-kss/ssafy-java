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
@WebServlet("/deleteBook.do")
public class deleteBookServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String s = (String) req.getParameter("bookid");
		
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		// DB에 DELETE 작업 진행(BookVO)
		BookDAO bookdao = BookDAO.getInstance();
		bookdao.deleteBookid(Integer.parseInt(s));
		
		// 도서의 전체 목록을 보여주는 bookList.do로 리다이렉션하자
		res.sendRedirect("bookList.do");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
