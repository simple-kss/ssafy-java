package com.ssafy;

public class Refri {
	String num;
	String name;
	int price;
	int amount;
	int volume;
	public Refri() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Refri(String num, String name, int price, int amount, int volume) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.amount = amount;
		this.volume = volume;
	}
	
	public String toString() {
		String rStr = String.format(
				"%s\t|%s\t|%d\t|%d\t|%d\t", num, name, price, amount, volume);
		return rStr;
	}

}
