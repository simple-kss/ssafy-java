package com.ssafy;

public class Tv {
	String num;
	String name;
	int price;
	int amount;
	int inch;
	String type;
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Tv(String num, String name, int price, int amount, int inch, String type) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.inch = inch;
		this.type = type;
	}
	public String toString() {
		String rStr = String.format(
				"%s\t|%s\t\t|%d\t|%d\t|%d\t|%s\t", num, name, price, amount, inch, type);
		return rStr;
	}

}
