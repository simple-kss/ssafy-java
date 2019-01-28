package com.ssafy;

public class Product {
	private int id;	
	private String name;
	private int price;
	private int amount;
	
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int id, String name, int price, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[ 제품 ID: " + id + " 제품이름: " + name + ", 가격: " + price + ", 수량: " + amount + " ] ";
	}


}
