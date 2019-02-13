package algo;

public class Z30_비트 {
	public static void main(String[] args) {
		int n = 0b100110111;
		//		0b000000010;
		System.out.println((n & 0b1) == 0 ? 0 : 1);
		
		for(int i = 0; i < 9; i++) {
			System.out.print((n&(1<<i)) == 0 ? 0 : 1 );
		}
		
		System.out.println();
		
		System.out.println(n);
		
		// 로그를 활용하여 자릿수 구하기
		int jari = (int)(Math.log(n) / Math.log(2)) + 1;
		System.out.println(jari);
		
		// 2진수를 10진수로 변경하기 1
		int result = 0;
		for (int i = 0; i < 9; i++) {
			if((n & (1<<i)) != 0) {
				result += n & (1<<i);
			}
		}
		System.out.println(result);
		
		// 2진수를 10진수로 변경하기 2
		result = 0;
        for (int i = 8; i >=0 ; i--) {
            result <<= 1; //자릿수 올림, *2의 효과
            if((n&(1<<i)) != 0) {
                result++;
            }
        }
		System.out.println(result);
		
		

	} // end of main
} // end of class
