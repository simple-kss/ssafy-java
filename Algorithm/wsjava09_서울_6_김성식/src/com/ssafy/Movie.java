package com.ssafy;

public class Movie {
	String name;
	int time;
	public Movie(String name, int time) {
		this.name = name;
		this.time = time;
	}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "   영화이름: " + name + " 시간: " + time;
	}
	
	

}
