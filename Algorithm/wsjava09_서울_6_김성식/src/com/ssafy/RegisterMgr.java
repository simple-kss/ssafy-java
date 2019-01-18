package com.ssafy;

import java.util.ArrayList;

public class RegisterMgr {
	ArrayList<Register> am = new ArrayList<Register>();

	
	// 저장
	void add(Register r) {
		am.add(r);
	}
	
	// 검색
	Register search(Person p) {
		Register r = new Register();
		return r;		
	}
	
	// 수정
	void update(Person p) {
		
	}
	
	
	// 삭제
	void remove(Person p) {
		
	}
	
	//
	void print() {
		for (Register register : am) {
			System.out.println(register.toString());			
		}
	}

	
	
	
	

}
