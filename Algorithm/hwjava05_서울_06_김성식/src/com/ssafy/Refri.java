package com.ssafy;

public class Refri {
	private String num;
	private String name;
	private int price;
	private int amount;
	private int volume;
	
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
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
