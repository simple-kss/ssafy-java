package com.ssafy.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.vo.Food;
import com.ssafy.vo.Person;

public class PersonDaoImpl implements PersonDao{
	
	private List<Person> persons;
	

	public PersonDaoImpl() {
		persons = new ArrayList<Person>();
	}

	@Override
	public void loadData() {
		// TODO Auto-generated method stub
		
	}
	
	public void add(Person p) {
		if(p != null)
			persons.add(p);
	}

	@Override
	public Person search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
