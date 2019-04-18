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
 * Servlet implementation class selectBookServlet
 */
@WebServlet("/selectBook.do")
public class selectBookServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		
		String opt = req.getParameter("opt");
		String content = req.getParameter("content");
		
		List<BookVO> rlist = null;
		
		BookDAO bookdao = BookDAO.getInstance();
		
		if(opt.equals("publisher")) {
			rlist = bookdao.selectPublisher(content);
		}
		else if(opt.equals("title")) {
			rlist = bookdao.selectTitle(content);
		}
		
		req.setAttribute("blist", rlist);
		req.getRequestDispatcher("WEB-INF/jsp/bookList.jsp").forward(req, res);
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
