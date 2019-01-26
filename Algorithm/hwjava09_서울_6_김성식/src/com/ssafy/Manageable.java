package com.ssafy;

public interface Manageable<T> {
	// 저장
	void add(T t);
	
	// 검색
	T search(int i);
	T search(String s);
	int search(T t);
	
	
	// 삭제
	void delete(String s);
}
