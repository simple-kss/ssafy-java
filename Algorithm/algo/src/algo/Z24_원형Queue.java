package algo;

public class Z24_원형Queue {
	
	public static int q[] = new int[5];
	
	// 0으로 안하면 안됨
	public static int front = 0; // 첫 원소 한칸 전을 가리킴
	public static int rear = 0; // 마지막 원소를 가리킴
	
	public static boolean isEmpty() {
		return front == rear; // 이건 그대로 가면됨
	}
	
	public static int deQueue() {
		if (isEmpty()) { // 큐가 비었으면
			System.out.println("Queue underflow error~~!");
			return -1;
		}
		else {
			// 데이터가 있으면 끄집어낸다
			front++;
			if(front == q.length) {
				front = 0;
			}
			//front = (front + 1) % q.length; 이렇게 쓰는거 보다 위처럼 쓰는 게 낫다.
			return q[front];
			
		}
	}
	
	public static boolean isFull() {
		// 꼬리가 마지막 번지를 가리킨다면
		return (rear + 1) % q.length == front;		
	}
	
	public static void enQueue(int data) {
		if (isFull()) { // 공간이 남아있으면
			// 넣어라
			System.out.println("Queue overflow error~~!");
			
		
		} // 남아있으면 넣어주기
		else {
			rear++;
			if ( rear == q.length) {
				rear = 0;				
			}
			
//			rear = ( rear + 1 ) % q.length; // 위 코드로 대체하자
			q[rear] = data;
		}
	}
	
	public static void main(String[] args) {
		// 선형큐가 가장 중요하다.
		// 하지만 우리는 배열로 큐를 만드는 법을 배울 것이다.
		// 이게 더 빠르기 때문!!
		
		// 현업에서는 이렇게 쓰면 안됨
		// 소검에서만 쓴다.
//		q[++rear] = 1; // 큐에 삽입
//		q[++rear] = 2; // 큐에 삽입
//		q[++rear] = 3; // 큐에 삽입
//		System.out.println(q[++front]);
//		System.out.println(q[++front]);
//		System.out.println(q[++front]);
		
		enQueue(1);
		enQueue(2);
		enQueue(3);
		enQueue(4);

		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());
		
		enQueue(6);
		enQueue(7);
		enQueue(8);
		
		System.out.println(deQueue());
		System.out.println(deQueue());
		System.out.println(deQueue());

		
	} // end of main
}
