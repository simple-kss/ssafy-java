package com.ssafy;

public class Sell {
	private int pId;
	private int mId;
	private int amount;
	
	public Sell() {
		super();
		// TODO Auto-generated constructor stub
	}	
	public Sell(int pId, int mId, int amount) {
		super();
		this.pId = pId;
		this.mId = mId;
		this.amount = amount;
	}


	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public int getmId() {
		return mId;
	}
	public void setmId(int mId) {
		this.mId = mId;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
