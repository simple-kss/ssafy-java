package com.ssafy;

import java.util.ArrayList;

public class PersonMgr {
	ArrayList<Person> pm = new ArrayList<Person>();
	//Person[] am = new Person[100];
	int size;
	
	//저장	
	void add(Person p) {
		pm.add(p);		
	}
	
	//검색 , 아이디로 검색
	Person search(int num) {		
		for (Person person : pm) {
			if(person.getId() == num)
				return person;
		}
		return null;		
	}
	
	//검색, 이름으로 검색
	Person search(String name) {
		for (Person person : pm) {
			if(person.getName().equals(name))
				return person;
		}
		return null;
	}
	
	//수정, 이름과 이름을 입력하여 이름 수정
	void update(String name, String str) {
		int len = pm.size();
		for (int i = 0; i < len; i++) {
			if( pm.get(i).getName().equals(name) ) {
				pm.get(i).setName(str);				
			}
		
		}
	}
	//수정, 이름과 나이를 입력하여 그 이름에 해당하는 나이 수정
	void update(String name, int age) {
		int len = pm.size();
		for (int i = 0; i < len; i++) {
			if( pm.get(i).getName().equals(name) ) {
				pm.get(i).setAge(age);				
			}		
		}
	}
	
	//삭제
	void delete(Person p) {
		pm.remove(p);
	}
}
