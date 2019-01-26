package com.ssafy;

import java.util.ArrayList;

public class PersonMgr implements Manageable<Person> {
	ArrayList<Person> list = new ArrayList<Person>();
	//Person[] am = new Person[100];
	int size;
	
	//저장	
	public void add(Person p) {
		list.add(p);		
	}
	
	//검색 , 아이디로 검색
	public Person search(int num) {		
		for (Person person : list) {
			if(person.getId() == num)
				return person;
		}
		return null;		
	}
	
	//검색, 이름으로 검색
	public Person search(String name) {
		for (Person person : list) {
			if(person.getName().equals(name))
				return person;
		}
		return null;
	}
	//검색, 객체를 입력받아 id로 반환
	public int search(Person p) {
		for (Person person : list) {
			if(person.equals(p))
				return person.getId();
		}
		return -1;
	}
	
	//수정, 이름과 이름을 입력하여 이름 수정
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	//수정, 이름과 나이를 입력하여 그 이름에 해당하는 나이 수정
	void update(String name, int age) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setAge(age);				
			}		
		}
	}
	
	//전체 출력
	void info() {
		for (Person person : list) {
			System.out.println(person.toString());
		}
	}
	
	//삭제
	public void delete(String s) {
		for (Person person : list) {
			if(person.getName().equals(s)) {
				list.remove(person);
				System.out.println("삭제 완료!");
				return;
			}
		}
	}
}
