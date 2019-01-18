package com.ssafy;

import java.util.ArrayList;

public class MovieMgr {
	ArrayList<Movie> mArr = new ArrayList<Movie>();
	int size;
	
	//저장	
	void add(Movie m) {
		mArr.add(m);		
	}
	
	//검색 , 영화 이름으로
	Movie search(String name) {		
		for (Movie Movie : mArr) {
			if(Movie.getName().equals(name))
				return Movie;
		}
		return null;		
	}
	
	//수정, 이름과 이름을 입력하여 영화이름 수정
	void update(String name, String str) {
		int len = mArr.size();
		for (int i = 0; i < len; i++) {
			if( mArr.get(i).getName().equals(name) ) {
				mArr.get(i).setName(str);				
			}
		
		}
	}
	//수정, 영화 이름과 시간 입력하여 그 이름에 해당하는 시간 수정
	void update(String name, int time) {
		int len = mArr.size();
		for (int i = 0; i < len; i++) {
			if( mArr.get(i).getName().equals(name) ) {
				mArr.get(i).setTime(time);			
			}		
		}
	}
	
	//삭제
	void delete(Movie m) {
		mArr.remove(m);
	}

}
