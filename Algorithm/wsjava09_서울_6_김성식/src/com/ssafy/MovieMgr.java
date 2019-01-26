package com.ssafy;

import java.util.ArrayList;
import java.util.Comparator;

public class MovieMgr implements Manageable<Movie>{
	ArrayList<Movie> list = new ArrayList<Movie>();
	int size;
	NameCompare nameCompare = new NameCompare();
	TimeCompare timeCompare = new TimeCompare();
	
	//저장	
	public void add(Movie m) {
		list.add(m);		
	}
	
	//검색 , 영화 이름으로 검색후 그 이름과 일치하는 객체 반환
	public Movie search(String name) {		
		for (Movie Movie : list) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//검색, 영화 아이디로 검색 후 객체 반환
	public Movie search(int id) {
		for (Movie Movie : list) {
			if(Movie.getId() == id)
				return Movie;
		}
		return null;	
		
	}
	
	//검색, 객체로 ID반환
	public int search(Movie m) {
		for (Movie movie : list) {
			if(movie.equals(m) ) {
				return movie.getId();
			}
		}
		return -1;
	}
	
	//수정, 이름과 이름을 입력하여 영화이름 수정
	void update(String name, String str) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setName(str);				
			}
		
		}
	}
	
	//수정, 영화 이름과 시간 입력하여 그 이름에 해당하는 시간 수정
	void update(String name, int time) {
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if( list.get(i).getName().equals(name) ) {
				list.get(i).setTime(time);			
			}		
		}
	}
	
	//전체 출력
	void info() {
		for (Movie movie : list) {
			System.out.println(movie.toString());
		}
	}
	
	// 삭제
	public void delete(String s) {
		for (Movie movie : list) {
			if(movie.getName().equals(s)) {
				list.remove(movie);
				return;
			}
		}
	}
	
	// Comperator 정의
	class NameCompare implements Comparator<Movie> {
		@Override
		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
			return o1.getName().compareTo(o2.getName());
		}
	}
	
	class TimeCompare implements Comparator<Movie> {
		@Override
		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
			return o1.getTime() - o2.getTime();
		}
	}
}
