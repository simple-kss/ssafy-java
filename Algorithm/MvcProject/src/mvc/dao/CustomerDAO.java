package mvc.dao;

import java.util.ArrayList;

import mvc.service.CustomerService;
import mvc.vo.Customer;

//실제로 DB작업하는 객체(CRUD) ex.. in up de se
//Create, Read, Update, Delete)

public class CustomerDAO implements CustomerService {
	ArrayList<Customer> list;

	public CustomerDAO() {
		//ArrayList생성, db연결 준비
		list = new ArrayList<>();
		list.add(new Customer("111","dada","la"));
		list.add(new Customer("222","billy","seoul"));
		list.add(new Customer("333","tommy","tokyo"));
	}

	@Override
	public ArrayList<Customer> selectAll() {
		//db에서 모든 데이터 가져와서 ArrayList에 넣어 리턴
		return list;
	}

	@Override
	public Customer selectOne(String num) {
		Customer cc = null;
		for(Customer c : list) {
			if(c.getNum().equals(num)) {
				cc = c;
				break;
			}
		} // end of for
		return cc;
	}

	@Override
	public void insert(Customer c) {
		list.add(c);
		
	}

	@Override
	public void delete(String num) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getNum().equals(num)) {
				list.remove(i);
				break;
			}
		}
	}

	
} // end of class
