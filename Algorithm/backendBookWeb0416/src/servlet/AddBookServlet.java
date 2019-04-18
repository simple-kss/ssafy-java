package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BookDAO;
import vo.BookVO;

@WebServlet("/addBook.do")
public class AddBookServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//추가할 책 데이터가 없는 상태로 넘어온 경우임
		//고대로 다시 forward
		request.getRequestDispatcher("/WEB-INF/jsp/addBook.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		// addBook.jsp에서 폼태그로 받은 추가할 책 정보를 담어왔음
		// 파라미터로 넘어온 값을 꺼내서 BookVO 객체로 만들어야해
		BookVO book = new BookVO();
		book.setTitle(req.getParameter("title"));
		book.setPublisher(req.getParameter("publisher"));
		book.setYear(req.getParameter("year"));
		book.setPrice(Integer.parseInt( req.getParameter("price")));
		
		// DB에 INSERT 작업 진행(BookVO)
		BookDAO bookdao = BookDAO.getInstance();
		bookdao.insertBook(book);
		
		// 도서의 전체 목록을 보여주는 bookList.do로 리다이렉션하자
		resp.sendRedirect("bookList.do");
	}
}