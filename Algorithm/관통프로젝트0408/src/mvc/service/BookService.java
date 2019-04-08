package mvc.service;

import java.util.ArrayList;

import mvc.vo.Food;

public interface BookService {
	public ArrayList<Food> selectAll();
	public Food selectOne(String num);
	public void insert(Food c);
	public void delete(String num);
}
