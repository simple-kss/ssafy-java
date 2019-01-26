package com.io1_21MON;

import java.io.Serializable;

// 객체가 스트림을 통해 이동될 때 필요 조건 : 직렬화(Serialization)가 되어있어야함
// Serializable 인터페이스 구현해주면 됨
// 직렬화 : 객체 안의 모든 데이터를 바이트 배열로 변환시켜 이동이 가능
public class Customer implements Serializable { // Customer는 직렬화 객체로 됨
	private int num;
	private String name;
	private String address;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
