package com.ssafy;

public interface Manageable<T> {
	// 저장
	void add();
	
	// 검색
	T search();
	
	// 수정
	void update();
	
	// 삭제
	void delete();

}
