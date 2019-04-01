package com.ssafy.book;

import java.util.ArrayList;
import java.util.List;

public class BookMgr
{
	List<Book> book = new ArrayList<Book>();

	public void add(Book b)
	{
		book.add(b);
	}

	public List<Book> search()
	{
		return book;
	}

	public List<Book> searchByIsbn(String isbn)
	{
		List<Book> sList = new ArrayList<Book>();
		for (Book e : book)
		{
			if (isbn.contains(e.getIsbn()))
			{
				sList.add(e);
			}
		}
		return sList;
	}

	public void delete(String isbn)
	{
		for (Book booklist : book)
		{
			if (booklist.getIsbn().contains(isbn))
			{
				book.remove(booklist);
				break;
			}
		}
	}

	public List<Book> searchByTitle(String title)
	{
		List<Book> sList = new ArrayList<Book>();
		for (Book e : book)
		{
			if (title.contains(e.getTitle()))
			{
				sList.add(e);
			}
		}
		return sList;
	}

	public List<Book> searchByPublisher(String publisher)
	{
		List<Book> sList = new ArrayList<Book>();
		for (Book e : book)
		{
			if (publisher.contains(e.getPublisher()))
			{
				sList.add(e);
			}
		}
		return sList;
	}

	public List<Book> searchByPrice(int price)
	{
		List<Book> sList = new ArrayList<Book>();
		for (Book e : book)
		{
			if (price >= e.getPrice())
			{
				sList.add(e);
			}
		}
		return sList;
	}

}
