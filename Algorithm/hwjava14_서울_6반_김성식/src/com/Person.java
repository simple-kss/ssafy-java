package com;

import java.io.Serializable;

public class Person implements Serializable{
	private String name;
	private String hp;
	private String address;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String hp, String address) {
		super();
		this.name = name;
		this.hp = hp;
		this.address = address;
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(!p.getAddress().equals(this.address)) return false;
		if(!p.getHp().equals(this.hp)) return false;
		if(!p.getName().equals(this.name)) return false;
		return true;
	}
	@Override
	public String toString() {
		return name + " " + hp + " " + address;
	}
	
}
