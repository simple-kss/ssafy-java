package com.computer;

// Parts를 상속 받은 자식 클래스(Monitor, Mouse, MainFrame, Keyboard)를 관리하는 클래스
public class ComputerManager {

    // 부품 저장할 배열 선언
    private Parts[] p;
    private int index = 0;
    public int size;
    
    public ComputerManager(int size) {
        p = new Parts[size];
        this.size = size;
    }

    // 배열안에 부품 저장
    // 배열에 저장 : size check
    public void add(Parts data) {
    	if(index < size) {
        	p[index++] = data;    		
    	}        
    	else
    		System.err.println("error! ");
    }

    // 배열안에 있는 모든 부품 리턴
    public Parts[] allParts() {
        return p;
    }

    // 부품 검색
    public Parts findPart(int num) {
    	for (int i = 0; i < index; i++) {
    		if( p[i].getNum() == num)
    			return p[i];
			
		}
  
        return null;
    }
    
    // 부품 삭제
    public void deletePart(int num) {
    	for (int i = 0; i < index; i++) {
    		if( p[i].getNum() != num) continue;
    		// 한칸씩 땡기기
    		for(int j = i; j < index - 1; j++) {
    			p[j] = p[j+1];
    			
    		}
			
		}        
    }
}