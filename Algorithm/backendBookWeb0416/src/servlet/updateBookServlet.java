package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

/**
 * Servlet implementation class updateBookServlet
 */
@WebServlet("/updateBook.do")
public class updateBookServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		BookVO book = new BookVO();
		book.setBookid(Integer.parseInt(req.getParameter("bookid")));
		book.setPrice(Integer.parseInt(req.getParameter("price")));
		book.setPublisher(req.getParameter("publisher"));
		book.setTitle(req.getParameter("title"));
		book.setYear(req.getParameter("year"));
		
		BookDAO bookdao = BookDAO.getInstance();
		
		bookdao.updateBook(book);
		
		res.sendRedirect("bookList.do");
	}

}
