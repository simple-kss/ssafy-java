
public class Solution1 {
	
	public boolean solution(int[] arrA, int[] arrB) {
		
		
		boolean answer = true;
		// 첫번째 비교한 것 부터 찾는다.
		int len = arrA.length;
		int lenB = arrB.length;
		if(len != lenB) return false;
		int j = 0;
		
		int index = 0;
		// 현재꺼와 앞에꺼가 달라지는 시점에서의 index 저장해야함
		for(int i = 0; i < len; i++ ) {
			// 인덱스 뽑을 때 잘뽑아야함
			// 만약 같은 번지가 있다면 거기를 피벗으로 삼는다.
			// + 현재꺼와 뒤에꺼가 다르다면
			if(arrA[j] == arrB[i]) {
				int next = j + 1;
				if(next == len) next = 0;
				if( arrA[j] != arrA[next] ) {
					index = i;
					break;
				}
				else {
					j++;
				}
					
				//어쩔떈 컨티뉴 만약 그 다음번지와도 같으면 ++해준다.
//				if(j+1 == len) j = -1;
//				if(arrA[j+1] == arrB[i]) {
//					++j;
//					continue;
//				}
			}
		} // end of for 2
		
//		System.out.println(index);
//		System.out.println(index);
		 
		int temp = index;
		int cnt = 0;
		for(int i = j; (cnt <= j); i++) {
			if( i == len) i = 0;
			if( arrA[i] != arrB[index] ) {
				answer = false;
				break;
			}
			index++;
			if(index == lenB)
				index = 0;
			cnt++;
		}

		
		// 그거부터 계속 맞는 지 비교
		return answer;
	}

	public static void main(String[] args) {
//		for(int i = 0; i < 1500; i++) {
//			System.out.print(1500+",");
//		}
		
		Solution1 s = new Solution1();
		System.out.println(s.solution(new int[] {1500,1500,1500,1499,1500,1500}, new int[] {1500,1499,1500,1500,1500,1500}));
		System.out.println(s.solution(new int[] {1,2,3,4}, new int[] {2,3,4,1}));

	}

}
