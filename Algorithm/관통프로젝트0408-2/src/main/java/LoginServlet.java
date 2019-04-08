

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("email");
		String pw = request.getParameter("pw");
		
		DBManager dbm = new DBManager();
		User user = null;
		
		try {
			user = dbm.getDataFromQuery("SSAFY_DB", "SELECT id, pw, name FROM member WHERE id = '" + id + "'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (user == null) {			
			// 로그인 실패 (회원이 없으면)
			response.sendRedirect("WebContent/html/error.jsp");
		} else if (user != null && user.pw.equals(pw)) {
			// 로그인 성공
			HttpSession session = request.getSession();
			session.setAttribute("id", user.id);
			session.setAttribute("name", user.name);
			response.sendRedirect("WebContent/html/mainPage1.jsp");
		} else {
			// 로그인 실패 (비번이 틀린경우)
			response.sendRedirect("WebContent/html/error.jsp");
		}
		
	}

}
