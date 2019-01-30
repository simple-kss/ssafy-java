package algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Z26_InsertionSort2 {

	public static void main(String[] args) {
//		int[] arr = {4, 1, 7, 0, 5, 6, 8, 2, 9, 3};
		long time = System.currentTimeMillis();
		int[] arr = new int[3000];
		Random ran = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(3000);
		}
		
//		LinkedList<Integer> li = new LinkedList<Integer>(); 2000ms - 3000개
		ArrayList<Integer> li = new ArrayList<Integer>(); // 16ms = 3000개
		// ArrayList에선 System.arraycopy 함수를 썻기 떄문에 빠름 
		
		for(int i = 0; i < arr.length; i++) {// 상빟발 대상
			int index = 0;
			for(index = 0; index < i; index++) {
				if(arr[i] < li.get(index)) {
					break;
				}
			}
			li.add(index, arr[i]); //찾은 위치에 끼워놈
			
		}
		
		System.out.println(System.currentTimeMillis() - time);
		

	}

}
