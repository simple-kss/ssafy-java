package com.basic;

import java.util.ArrayList;
import java.util.List;

public class BookMgr {
	private ArrayList<Book> books;

	public BookMgr() {
		books = new ArrayList<>();
	}

	public void add(Book b) {
		books.add(b);
	}

	public List<Book> search() {
		return books;
	}

	public Book searchByIsbn(String isbn) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getIsbn().equals(isbn))
				return books.get(i);
		}
		return null;
	}

	public void delete(String isbn) {
		Book find = searchByIsbn(isbn);
		if (find != null)
			books.remove(find);
	}

	public Book[] searchByTitle(String title) {
		ArrayList<Book> result = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title))
				result.add(books.get(i));
		}
		return result.toArray(new Book[result.size()]);
	}

	public Book[] searchByPublisher(String publisher) {
		ArrayList<Book> result = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublisher().equals(publisher))
				result.add(books.get(i));
		}
		return result.toArray(new Book[result.size()]);
	}

	public Book[] searchByPrice(int price) {
		ArrayList<Book> result = new ArrayList<>();
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPrice() == price)
				result.add(books.get(i));
		}
		return result.toArray(new Book[result.size()]);
	}

}
