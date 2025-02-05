package com.inherit.copy;

import java.util.Iterator;

class Employee {
	int num;
	String name;
	int salary;
	
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public double getBonus() {
		return salary * 0.3;
	}
	
	public String info() {
		return "name:" + name;
	}

	public Employee(int num, String name, int salary) {
		super();
		this.num = num;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
public class Manager extends Employee{
	int mcode;
	
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int num, String name, int salary, int mcode) {
		super(num, name, salary);
		this.mcode = mcode;
	}

	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return getSalary() * 0.6;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager(123, "bill", 5000, 100);
		m.setSalary(30);
		System.out.println(m.getBonus());
		
		Manager[] list = new Manager[2];

		for (int i = 0; i < list.length; i++) {
			list[i] = new Manager(123,"321",1*(i+1),1);
		}
		
		for (Manager manager : list) {
			System.out.println(manager.getBonus());
			
		}
		

	}

}
