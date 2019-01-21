package com.exception1_21MON;

public class MemberTest {

	public static void main(String[] args) {
		
		try {
			findMember("tom");
			findMember("jane");
			findMember("sik");
		} catch (NoSuchMember e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void findMember(String name) throws NoSuchMember {
		if( name.equals("tom")) {
			System.out.println("welcome");			
		}
		else if( name.equals("jane")) {
			System.out.println("welcome");			
		}
		else
			throw new NoSuchMember();
	}

}
