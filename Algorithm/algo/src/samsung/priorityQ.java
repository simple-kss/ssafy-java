package samsung;

import java.util.PriorityQueue;

<<<<<<< HEAD
class Student implements Comparable<Student> {
	String name;
	int age;
	
	public Student() {
		super();
	}
=======
class Student implements Comparable<Student>{
	String name;
	int age;
	
	
>>>>>>> e6c8cd42c382213c7e0c01a6c7f4deaa891e5164
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
<<<<<<< HEAD
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
=======
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// 힙을 구현하려면 compareTo를 정의해야한다.
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
	
>>>>>>> e6c8cd42c382213c7e0c01a6c7f4deaa891e5164
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

<<<<<<< HEAD
public class priorityQ {
	public static void main(String[] args) {
		PriorityQueue<Student> pq = new PriorityQueue<Student>();
		
	    pq.offer(new Student("전우형", 2));
	    pq.offer(new Student("이정연", 9));
	    pq.offer(new Student("박다솜", 6));
	    pq.offer(new Student("김재룡", 7));
	    pq.offer(new Student("이근희", 4));
	    pq.offer(new Student("홍휘진", 9));

	    while (!pq.isEmpty())
	        System.out.println(pq.poll().toString());
	} // end of main
} // end of class
=======


public class priorityQ {

	public static void main(String[] args) {
		PriorityQueue<Student> pQ = new PriorityQueue<Student>();
		
		pQ.offer(new Student("김철수", 20));
		pQ.offer(new Student("김영희", 100));
		pQ.offer(new Student("한택희", 66));
		pQ.offer(new Student("이나영", 7));
		pQ.offer(new Student("이혁", 43));
		pQ.offer(new Student("안영희", 100));
		// off와 poll
		
		while(!pQ.isEmpty()) {
			System.out.println(pQ.poll().toString());
		}
		
		
	}

}
>>>>>>> e6c8cd42c382213c7e0c01a6c7f4deaa891e5164
