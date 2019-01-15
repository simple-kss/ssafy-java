package com.ssafy;

public class Refrigerator extends Product{
	private int volume;
	

	public Refrigerator() {
		// TODO Auto-generated constructor stub
	}

	public Refrigerator(String num, String name, int price, int amount,int volume) {
		super(num, name, price, amount);
		this.volume = volume;
		// TODO Auto-generated constructor stub
	}
	
	

	public Refrigerator(String num, String name, int price, int amount) {
		super(num, name, price, amount);
		// TODO Auto-generated constructor stub
	}
	

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public String toString() {
		String rStr = String.format(
				"%s\t|%s\t|%d\t|%d\t|%d\t", super.getNum(), super.getName(), super.getPrice(), super.getAmount(), volume);
		return rStr;
	}

}
