package com.ssafy;

import java.util.ArrayList;

public class SellMgr implements Manageable<Sell> {
	ArrayList<Sell> list = new ArrayList<Sell>();

	// ÀúÀå
	public void add(Sell r) {
		list.add(r);
	}

	@Override
	public Sell search(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sell search(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int search(Sell t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String s) {
		// TODO Auto-generated method stub
		
	}
}
