package com.ssafy;

public class Register {
	private Movie m;
	private Person p;
	
	public Register(Movie m, Person p) {
		this.m = m;
		this.p = p;
	}
	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Movie getM() {
		return m;
	}


	public void setM(Movie m) {
		this.m = m;
	}


	public Person getP() {
		return p;
	}


	public void setP(Person p) {
		this.p = p;
	}


	@Override
	public String toString() {
		return "영화예매" + m +" "+ p;
	}
	
	

}
