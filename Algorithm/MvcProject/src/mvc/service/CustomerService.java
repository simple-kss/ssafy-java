package mvc.service;

import java.util.ArrayList;

import mvc.vo.Customer;

//client를 위한 서비스 내용 표시
// 여기서 말하는 것은 Controller를 위한 서비스를 내용을 표시하는 것이다.
// 어떠한 기능을 하는지 외부 틀을 잡는다.


public interface CustomerService {
	public ArrayList<Customer> selectAll();
	public Customer selectOne(String num);
	public void insert(Customer c);
	public void delete(String num);
}
