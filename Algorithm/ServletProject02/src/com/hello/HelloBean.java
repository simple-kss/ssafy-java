package com.hello;
//pojo(plain old java object)
//bean:jsp에 의해서 이용되는 자바 파일

public class HelloBean {
	private String name = "tommy";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// useBean으로는 디폴트 생성자만으로 객체를 생성가능하므로
	// 파라미터 생성자를 사용하려면 디폴트 생성자도 정의해주자.
	// 기본적으로 디폴트 생성자가 정의되어있음!
	
	
} // end of class