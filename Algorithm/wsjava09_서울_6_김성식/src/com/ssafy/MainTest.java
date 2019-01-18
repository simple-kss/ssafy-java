package com.ssafy;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RegisterMgr rm = new RegisterMgr();
		MovieMgr mm = new MovieMgr();
		PersonMgr pm = new PersonMgr();
		
		pm.add(new Person(100,"김성식",23));
		pm.add(new Person(101,"김재룡",25));
		pm.add(new Person(102,"이근희",26));
		pm.add(new Person(103,"전우형",24));
		pm.add(new Person(104,"이정연",30));
		
		mm.add(new Movie("바람과함께사라지다",100));
		mm.add(new Movie("인셉션",200));
		mm.add(new Movie("주먹왕랄프",120));
		mm.add(new Movie("사피",150));
		mm.add(new Movie("자바",160));
		
		rm.add(new Register(mm.search("인셉션"), pm.search(100)));
		rm.add(new Register(mm.search("바람과함께사라지다"), pm.search(101)));
		rm.add(new Register(mm.search("주먹왕랄프"), pm.search(102)));
		rm.add(new Register(mm.search("사피"), pm.search(103)));
		rm.add(new Register(mm.search("자바"), pm.search(104)));
		
		rm.print();
		

	}

}
