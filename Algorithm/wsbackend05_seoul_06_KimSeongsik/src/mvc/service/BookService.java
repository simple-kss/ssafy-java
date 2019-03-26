package mvc.service;

import java.util.ArrayList;

import mvc.vo.Book;

public interface BookService {
	public ArrayList<Book> selectAll();
	public Book selectOne(String num);
	public void insert(Book c);
	public void delete(String num);
}
