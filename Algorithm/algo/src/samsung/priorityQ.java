package samsung;

import java.util.PriorityQueue;

class Student implements Comparable<Student>{
	String name;
	int age;
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
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
	
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}



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
