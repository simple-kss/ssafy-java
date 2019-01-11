package com.ssafy;



public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarMgr c = new CarMgr();
		// 클래스를 만들면 필드 기본값에 정수는 0
		// 레퍼런스타입은 null이 들어간다.
		
		Car car1 = new Car("1000","TOYOTA", 1000);
		Car car2 = new Car("1001","SAMSUNG", 2000);
		Car car3 = new Car("1002","HYUNDAI", 3000);
		Car car4 = new Car("1003","T1", 4000);
		Car car5 = new Car("1004","T2", 5000);
		Car car6 = new Car("1005","T3", 6000);
		Car car7 = new Car("1006","T4", 7000);
		Car car8 = new Car("1007","A1", 8000);
		Car car9 = new Car("1008","A2", 9000);
		Car car10 = new Car("1009","A3", 10000);
		c.add(car1);
		c.add(car2);
		c.add(car3);
		c.add(car4);
		c.add(car5);
		c.add(car6);
		c.add(car7);
		c.add(car8);
		c.add(car9);
		c.add(car10);
		
		System.out.println("-----------------------------------");
		int t = c.totalPrice();
		System.out.println("totalPrice() : " + t);
		System.out.println("-----------------------------------");
		int s = c.size();
		System.out.println("size() : " + s); 
	
		System.out.println("-----------------------------------");	
		System.out.println("search() 실행");
		Car[] arr = c.search();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(arr[i].toString());
		}
		System.out.println("-----------------------------------");
		System.out.println("search(6000) 실행");
		arr = c.search(6000);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].toString());
		}
		System.out.println("-----------------------------------");
		System.out.println("search(\"1000\") 실행");
		Car car = c.search("1000");
		System.out.println(car);
		
		System.out.println("-----------------------------------");
		System.out.println("delete(\"1001\") 실행");
		c.delete("1001");
		arr = c.search();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(arr[i].toString());
		}
		
		System.out.println("-----------------------------------");
		System.out.println("update(\"1000\",12000) 실행");
		c.update("1000", 12000);
		arr = c.search();
		for (int i = 0; i < c.size(); i++) {
			System.out.println(arr[i].toString());
		}



	}

}
