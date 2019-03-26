package mvc.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.dao.CustomerDAO;
import mvc.vo.Customer;

// FrontController에서 넘어온 요청을 DAO에 넘겨서 작업 지시하는 객체
// DAO에게 일시키고, DAO의 결과를 받는 애
// DAO한테서 받은 결과를 저장하고 JSP로 넘어감 (forward방식으로).. request dispatcher가 필요함
public class CustomerController {
	CustomerDAO dao;
	

	public CustomerController() {
		dao = new CustomerDAO();
	}

	public void list(HttpServletRequest req, HttpServletResponse res) {
		ArrayList<Customer> list = dao.selectAll(); // 컨트롤러에게 공개 안하는 메소드
		req.setAttribute("list", list);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/list.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	} // end of list function

	public void read(HttpServletRequest req, HttpServletResponse res) {
		String num = req.getParameter("num");
		Customer c = dao.selectOne(num);
		req.setAttribute("c", c);
		
		// disPatcher는 webcontent가 root
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/read.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
	} // end of func
	
	
	public void insert(HttpServletRequest req, HttpServletResponse res) {
		Customer c = new Customer();
		String num = req.getParameter("num");
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		c.setNum(num);
		c.setName(name);
		c.setAddress(address);
		dao.insert(c);
		
		try {
			res.sendRedirect("list.mvc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		this.list(req, res);
	} // end of func

	public void delete(HttpServletRequest req, HttpServletResponse res) {
		ArrayList<Customer> list = dao.selectAll();
		String num = req.getParameter("num");
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getNum().equals(num)) {
				list.remove(i);
				break;
			}
		} // end of for
		
		try {
			res.sendRedirect("list.mvc");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		this.list(req, res); 이것도 됌
	}

	public void insertFromPrint(HttpServletRequest req, HttpServletResponse res) {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/insertForm.jsp");
		try {
			dispatcher.forward(req, res);
		} catch (ServletException | IOException e) {
			e.printStackTrace();
		}
		
	}

}
