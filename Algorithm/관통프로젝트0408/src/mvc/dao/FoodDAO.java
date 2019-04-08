package mvc.dao;

import java.util.ArrayList;

import mvc.service.BookService;
import mvc.vo.Food;

//실제로 DB작업하는 객체(CRUD) ex.. in up de se
//Create, Read, Update, Delete)

public class FoodDAO implements BookService {
	
	ArrayList<Food> list;
	
	public FoodDAO() {
		//ArrayList생성, db연결 준비
		list = new ArrayList<>();
	}

	@Override
	public ArrayList<Food> selectAll() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Food selectOne(String num) {
		Food bb = null;
		for(Food b : list) {
			if(b.getIsbn().equals(num)) {
				bb = b;
				break;
			}
		} // end of for
		return bb;
	}

	@Override
	public void insert(Food c) {
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
