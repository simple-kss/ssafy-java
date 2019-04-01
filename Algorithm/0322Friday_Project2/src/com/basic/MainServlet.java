package com.basic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	
	private BookMgr mgr = new BookMgr();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 도서 검색 및 삭제는 get방식
		process(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 도서 등록은 포스트방식
		save(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 역할별 분리 메소드
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String type = request.getParameter("type");
		if(type.equals("view"))
			view(request, response);
		else if(type.equals("search"))
			search(request, response);
		else if(type.equals("list"))
			list(request, response);
		else if(type.equals("delete"))
			delete(request, response);
	}
	
	public void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		String search = request.getParameter("search");
		if(search == null)
			view(request, response);
		else {
			Book[] results = new Book[1];
			String data = request.getParameter("data");
			switch (search) {
			case "Title":
				results = mgr.searchByTitle(data);
				break;
			case "Publisher":
				results = mgr.searchByPublisher(data);
				break;
			case "Isbn":
				results[0] = mgr.searchByIsbn(data);
				break;
			case "Price":
				results = mgr.searchByPrice(Integer.parseInt(data));
				break;
			default:
				break;
			}
			if(data.equals("")) {
				List<Book> lb = mgr.search();
				results = lb.toArray(new Book[lb.size()]);
			}
			ArrayList<Book> send = new ArrayList<>(Arrays.asList(results));
			request.setAttribute("booklist", send);
			dispatcher.forward(request, response);
		}
	}
	
	public void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookView.jsp");
		String isbn = request.getParameter("isbn");
		request.setAttribute("book", mgr.searchByIsbn(isbn));
		dispatcher.forward(request, response);
	}
	
	public void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/BookList.jsp");
		request.setAttribute("booklist", mgr.search());
		dispatcher.forward(request, response);
	
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Result.jsp");
		String isbn = request.getParameter("isbn");
		mgr.delete(isbn);
		request.setAttribute("result", "정상적으로 삭제 되었습니다");
		dispatcher.forward(request, response);
	}
	
	public void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String []book = request.getParameterValues("book");
		String title = request.getParameter("bookName");
		String catalogue = request.getParameter("booktype");
		String author = request.getParameter("writer");
		if(book == null || title.equals("") || catalogue.equals("") || author.equals(""))
			response.sendRedirect("Book.html");
		String isbn = book[0] + "-" + book[1] + "-" + book[2];
		String nation = request.getParameter("nation");
		String publishDate = request.getParameter("date");
		String publisher = request.getParameter("publisher");
		int price = Integer.parseInt(request.getParameter("price"));
		String currency = request.getParameter("money");
		String description = request.getParameter("content");
		
		mgr.add(new Book(isbn, title, catalogue, nation, publishDate, publisher, author, price, currency, description));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Result.jsp");
		request.setAttribute("result", "성공적으로 저장되었습니다!!");
		dispatcher.forward(request, response);
	}

}
