package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.vo.Book;
import mvc.dao.BookDAO;

// FrontController에서 넘어온 요청을 DAO에 넘겨서 작업 지시하는 객체
// DAO에게 일시키고, DAO의 결과를 받는 애
// DAO한테서 받은 결과를 저장하고 JSP로 넘어감 (forward방식으로).. request dispatcher가 필요함
public class BookController {
	BookDAO dao;

	public BookController() {
		dao = new BookDAO();
	} // end of func

	public void login(HttpServletRequest req, HttpServletResponse res) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/login.html");
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	} // end of func

	public void loginSuccess(HttpServletRequest req, HttpServletResponse res) {
		String id = req.getParameter("id");
		String pass = req.getParameter("pass");
		
		HttpSession session = req.getSession();
		// session에 저장하기
		// JSP 기본객체와 활성범위

		
		RequestDispatcher dispatcher = null;
		if(id.equals("ssafy") && pass.equals("1234")) {
			dispatcher = req.getRequestDispatcher("/view/index.jsp");
			session.setAttribute("id", id);
			session.setAttribute("pass", pass);
		}
		else {
			dispatcher = req.getRequestDispatcher("/view/login.html");
		}
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	}
	
	public void register(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/Book.jsp");
		dispatcher.forward(req, res);
	}


	public void insert(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html; charset=UTF-8");
		
		String []book = req.getParameterValues("book");
		String title = req.getParameter("bookName");
		String catalogue = req.getParameter("booktype");
		String author = req.getParameter("writer");
		if(book == null || title.equals("") || catalogue.equals("") || author.equals(""))
			res.sendRedirect("Book.jsp");
		String isbn = book[0] + "-" + book[1] + "-" + book[2];
		String nation = req.getParameter("nation");
		String publishDate = req.getParameter("date");
		String publisher = req.getParameter("publisher");
		int price = Integer.parseInt(req.getParameter("price"));
		String currency = req.getParameter("money");
		String description = req.getParameter("content");
		
		dao.insert(new Book(isbn, title, catalogue, nation, publishDate, publisher, author, price, currency, description));
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/Result.jsp");
		req.setAttribute("result", "성공적으로 저장되었습니다!!");
		dispatcher.forward(req, res);
	}

	public void logout(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/logout.jsp");
		dispatcher.forward(req, res);
	}


	public void result(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/Result.jsp");
		dispatcher.forward(req, res);
		
	}
	
	public void BookList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ArrayList<Book> list = dao.selectAll(); // 컨트롤러에게 공개 안하는 메소드
		req.setAttribute("list", list);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/BookList.jsp");
		dispatcher.forward(req, res);
	}

	public void BookView(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String isbn = req.getParameter("isbn");
		Book b = dao.selectOne(isbn); // 컨트롤러에게 공개 안하는 메소드
		req.setAttribute("element", b);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/BookView.jsp");
		dispatcher.forward(req, res);
	}

	public void delete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String isbn = req.getParameter("isbn");
		dao.delete(isbn);
		
		this.BookList(req, res);
	}
}
