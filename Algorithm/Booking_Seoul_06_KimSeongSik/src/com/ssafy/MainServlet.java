package com.ssafy;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet
{
	private BookMgr mgr = new BookMgr();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		process(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		save(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		switch (request.getParameter("do"))
		{
		case "list":
			list(request, response);
			break;
		case "view":
			view(request, response);
			break;
		case "delete":
			delete(request, response);
			break;
		case "search":
			search(request, response);
			break;

		default:
			break;
		}
	}

	protected void search(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String val = request.getParameter("val");
		List<Book> rList = null;
		// 해당하는 book list만 반환....
		switch (request.getParameter("opt"))
		{
		case "all":
//			list(request, response);
			rList = mgr.search();
			break;

		case "oIsbn":
			rList = mgr.searchByIsbn(val);
			break;

		case "oTitle":
			rList = mgr.searchByTitle(val);
			break;

		case "oPublisher":
			rList = mgr.searchByPublisher(val);
			break;

		case "oPrice":
			rList = mgr.searchByPrice(Integer.parseInt(val));
			break;

		default:
			break;
		}
		request.setAttribute("bList", rList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/BookList.jsp");
		dispatcher.forward(request, response);
	}

	protected void list(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("bList", mgr.search());
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/BookList.jsp");
		dispatcher.forward(request, response);
	}

	protected void view(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("bList", mgr.search());
		request.setAttribute("title", request.getParameter("name"));
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/BookView.jsp");
		dispatcher.forward(request, response);
	}

	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// 처리 구문.
		mgr.delete(request.getParameter("isbn"));
		request.setAttribute("result", "삭제가 완료되었습니다.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/Result.jsp");
		dispatcher.forward(request, response);
	}

	protected void save(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		Book b = new Book();
		b.setTitle(request.getParameter("title"));
		b.setAuthor(request.getParameter("name"));
		b.setPublishDate(request.getParameter("date"));
		b.setCatalogue(request.getParameter("kind"));
		b.setDescription(request.getParameter("summary"));
		b.setIsbn(request.getParameter("booknum1") + "-" + request.getParameter("booknum2") + "-" + request.getParameter("booknum3"));
		b.setNation(request.getParameterValues("region")[0]);
		b.setCurrency(request.getParameter("currency"));
		if (request.getParameter("price").equals(""))
		{
			b.setPrice(0);
		}
		else
		{
			b.setPrice(Integer.parseInt(request.getParameter("price")));
		}
		b.setPublisher(request.getParameter("publisher"));
		mgr.add(b);

		// 1. 클라이언트가 보낸 데이터 받기
		request.setAttribute("result", "정상적으로 저장 되었습니다.");
		RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/Result.jsp");
		dispatcher.forward(request, response);
	}

}
