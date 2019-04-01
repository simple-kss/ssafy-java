
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet
{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		// 1. 클라이언트가 보낸 데이터 받기
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String booknum1 = request.getParameter("booknum1");
		String booknum2 = request.getParameter("booknum2");
		String booknum3 = request.getParameter("booknum3");
		String title = request.getParameter("title");
		String kind = request.getParameter("kind");
		String region[] = request.getParameterValues("region");
		String date = request.getParameter("date");
		String publisher = request.getParameter("publisher");
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		String summary = request.getParameter("summary");
		RequestDispatcher dispatcher = request.getRequestDispatcher("html/LoginSuccess.jsp");

		if (id == null && pass == null)
		{
			out.println("<html><body>");
			out.println("<h1>입력된 도서 정보</h1>");
			out.println("도서명 : " + title + "<br>");
			out.println("도서번호 : " + booknum1+"-"+ booknum2+"-"+ booknum3+ "<br>");
			out.println("도서분류 : " + kind + "<br>");
			out.println("도서국가 : " + region[0] + "<br>");
			out.println("출판일 : " + date + "<br>");
			out.println("출판사 : " + publisher + "<br>");
			out.println("저자 : " + name + "<br>");
			out.println("도서가격 : " + price + "<br>");
			out.println("도서설명 : " + summary + "<br>");
			out.println("<a href='html/Book.html'>도서 등록</a>");
			out.println("</body></html>");
		}
		else
		{
			if (id.equals("ssafy") && pass.equals("1111"))
			{
				dispatcher.forward(request, response);
			}
			else
			{
				String err = "도서 정보 관리 ERROR";
				dispatcher = request.getRequestDispatcher("html/Error.jsp");
				request.setAttribute("e1", err);
				dispatcher.forward(request, response);
			}
		}
	}

}
