package com.exception1_21MON;

public class MyExceptionTest {

	public static void main(String[] args) {
		MyExceptionTest m = new MyExceptionTest();
		try {
			m.go(0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}

	private void go(int num) throws MyException, Exception {
		// num >= 0 이면  정상, num < 0 이면 예외 발생
		if(num > 0)
			System.out.println(++num);
		else if( num == 0) {
			throw new MyException();
		}
		else { // 예외 발생
			throw new Exception();			
		}
	}

}
