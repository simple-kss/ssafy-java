package samsung;

import java.util.PriorityQueue;

class Student implements Comparable<Student> {
	String name;
	int age;
	
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
}

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
