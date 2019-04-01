package mvc.dao;

import java.util.ArrayList;

import mvc.service.BookService;
import mvc.vo.Book;

//실제로 DB작업하는 객체(CRUD) ex.. in up de se
//Create, Read, Update, Delete)

public class BookDAO implements BookService {
	
	ArrayList<Book> list;
	
	public BookDAO() {
		//ArrayList생성, db연결 준비
		list = new ArrayList<>();
	}

	@Override
	public ArrayList<Book> selectAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Book selectOne(String num) {
		Book bb = null;
		for(Book b : list) {
			if(b.getIsbn().equals(num)) {
				bb = b;
				break;
			}
		} // end of for
		return bb;
	}

	@Override
	public void insert(Book c) {
		list.add(c);
	}

	@Override
	public void delete(String num) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getIsbn().equals(num)) {
				list.remove(i);
				break;
			}
		}
		
	}
	
} // end of class
