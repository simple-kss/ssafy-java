package com.ssafy;

public class Book {
	String isbn;
	String title;
	String author;
	String publisher;
	int price;
	String desc;
	
	public Book(String isbn, String title, String author, String publisher, int price, String desc) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.desc = desc;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		String rStr = String.format("%-10s|%s\t|%-10s|%-10s|%-10d|%-10s",
				isbn, title, author, publisher, price, desc);
		return rStr;
	}

}
