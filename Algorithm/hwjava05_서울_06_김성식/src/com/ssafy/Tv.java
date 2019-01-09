package com.ssafy;

public class Tv {
	private String num;
	private String name;
	private int price;
	private int amount;
	private int inch;
	private String type;
	
	
	
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

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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
