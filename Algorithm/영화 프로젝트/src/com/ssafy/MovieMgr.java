package com.ssafy;

public class MovieMgr {
	private Movie[] movies = new Movie[100];
	private int index;
	
	public void add(Movie m) {
		movies[index++] = m;		
	}
	
	public Movie[] search() {
		return movies;
	}
	
	public Movie[] search(String title) {
		Movie[] temp = new Movie[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getTitle().contains(title)) 
				temp[tempCnt++] = movies[i];
		}
		return temp;
	}
	
	public Movie[] searchDirector(String name) {
		Movie[] temp = new Movie[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getDirector().equals(name)) 
				temp[tempCnt++] = movies[i];
		}
		return temp;		
	}
	
	public Movie[] searchGenre(String genre) {
		Movie[] temp = new Movie[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(movies[i].getGenre().equals(genre)) 
				temp[tempCnt++] = movies[i];
		}
		return temp;
		
	}
	
	public void delete(String title) {
		for (int i = 0; i < index; i++) {
			// 일치한다면 앞으로 떙기기
			if(movies[i].getTitle().equals(title)) {
				// 그래서 i--를 해준 것
				
				// 땡기는 작업
				for(int j = i; j < index-1; j++) {
					movies[j] = movies[j+1];
				}
				i--; // 그 위치를 다시 비교해야한다
				index--;
			}
		}
		
	}
	
	public int getSize() {
		return index;
	}

}
