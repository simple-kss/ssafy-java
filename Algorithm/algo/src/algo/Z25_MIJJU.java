package algo;



class Person {
	int num;
	int cnt;
	public Person(int num, int cnt) {
		this.num = num;
		this.cnt = cnt;
	}
}

public class Z25_MIJJU {

	public static void main(String[] args) {
		//Queue<Integer> q = new Queue<Integer>();
		
		int mi = 20;
		int count = 1;
		int pre = 0; // 현재 방문할 사람
		
		Person[] q = new Person[1000];
		int rear = -1;
		int front = -1;
		
		q[++rear] = new Person(1,1);

		int result = 0;
		while(mi >= 0) {
			// 사탕을 준다
			mi -= q[++front].cnt;
			if(mi < 0) {
				result = q[front].num;
				break;
			}
			
			// 주고나서 다시 줄세운다
			q[++rear] = q[front];
			
			// 그리고 그다음사람 추가
			count++;
			q[++rear] = new Person(q[front].num+1,count);
		}
		System.out.println(result);
	}
}
