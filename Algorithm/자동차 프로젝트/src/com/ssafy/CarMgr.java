package com.ssafy;

import java.util.Iterator;

public class CarMgr {
	private Car[] cars = new Car[100];
	private int index;
	
	public void add(Car c) {
		cars[index] = c;
		index++;
	}
	
	public Car[] search() {
		return cars;
	}
	
	/** 파라메터로 전달된 번호와 같은 차량 정보를 리턴한다.*/
	public Car search(String num) {
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getNum().equals(num) ) {
				return car;
			}	
		}
		return null;
		
	}
	
	/** 파라메터로 전달된 가격보다 작은 차량 정보들을 리턴한다.*/
	public Car[] search(int price) {
		Car[] temp;
		int cnt = 0; // price보다 낮은 차량의 갯수
		
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getPrice() < price ) {
				cnt++;
			}	
		}
		
		temp = new Car[cnt];
		int tempCnt = 0; // 하나씩 증가하면서 배열에 넣기 위한 변수
		for (int i = 0; i < index; i++) {
			if(cars[i].getPrice() < price)
				temp[tempCnt++] = cars[i];
		}
		return temp;		
	}
	
	public void update(String num, int price) {
		
		for (int i = 0; i < index; i++) {
			Car car = cars[i];
			if(car.getNum().equals(num)) {
				car.setPrice(price);
				break;
			}		
		}
	}
	
	// 파라메터로 전달된 번호의 차량을 삭제한다.
	public void delete(String num) {
		for (int i = 0; i < index; i++) {
			// 일치한다면 앞으로 떙기기
			if(cars[i].getNum().equals(num)) {
				// 그래서 i--를 해준 것
				
				// 땡기는 작업
				for(int j = i; j < index-1; j++) {
					cars[j] = cars[j+1];
				}
				i--; // 그 위치를 다시 비교해야한다
				index--;
				System.out.println("삭제되었습니다!");
			}
		}
	}
	
	public int size() {
		return index;
		
	}
	
	public int totalPrice() {
		int total = 0;
		for (int i = 0; i < index; i++) {
			total += cars[i].getPrice();
		}
		return total;
	}
}
