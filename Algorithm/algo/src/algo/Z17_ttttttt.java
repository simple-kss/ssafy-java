package algo;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;


class Cup implements Comparable<Cup>{
	int size;
	String name = "";
	public Cup(int size, String name) {
		this.size = size;
		this.name = name;
	}
	public Cup() {
		// TODO Auto-generated constructor stub
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return String.format("[%d,%s]", size, name);
	}
	
	@Override
	public int compareTo(Cup o) {
		// TODO Auto-generated method stub
		return this.size - o.size;
	}
	
	
}

class Pest {
	int a;
	String s;
	public Pest(int a, String s) {
		this.a = a;
		this.s = s;
	}
	
	@Override
	public String toString() {
		return "Pest [a=" + a + ", s=" + s + "]";
	}
	
	public int hashCode() { // 각 키에 대한 유니크한 hash 값을 리턴하는 함수
		
		return (a+s).hashCode();
	}
	
	// 다형성 : 부모의 참조변수에 자식의 객체를 담을 수 있는 성질
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if ( obj instanceof Pest) {
			Pest g = (Pest)obj;
			return this.a == g.a && this.s.equals(this.s);
		}
		return false;
			
		//instance of *******************시험		
	}
}

public class Z17_ttttttt {


	public static void main(String[] args) {
//		List 순서 유지, 데이터 중복가능
//			ArrayList, LinkedList
//		Set	순서없음, 데이터 중복불가
//			HashSet, TreeSet
//		Map	키:값	의 구조로 되어있음
//			HashMap, TreeMap
		
		HashSet<Pest> hs = new HashSet<Pest>();
		//Queue<Integer> q = new Queue<Integer>();
		// Hashing 기법을 사용하려면 Hashcode(), equals()를 오버라이딩해야함
		
		hs.add(new Pest(1, "123"));
		hs.add(new Pest(2, "132"));
		hs.add(new Pest(4, "156"));
		hs.add(new Pest(4, "156"));
		hs.add(new Pest(5, "112"));
		
		for (Pest Pest : hs) {
			System.out.println(Pest.toString());
		}		
		
		// 중복이 제거가 안된다.
		// HashCode와 equals를 정의하면 중복이 제거됨 (같은 객체는 제거됨)
		
		System.out.println("---------------------");
		
		HashMap<Pest, Integer> hm = new HashMap(); // 키:값
		hm.put(new Pest(22,"류현진"), 100);
		hm.put(new Pest(21,"김성식"), 20);
		hm.put(new Pest(23,"아라라"), 50);
		hm.put(new Pest(23,"아라라"), 200);
		// 같은 키가 들어오면 덮어써준다
		System.out.println(hm);
		
		//먼저 키 셋으로 가져오겠다.
		Set<Pest> ks = hm.keySet();
		
		
		// 2가지 방법이 있다. ***
		for (Pest k : ks) {
			System.err.print(k);
			System.err.print(hm.get(k));
		}
		
		Iterator<Pest> iter = ks.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()+",");
		}
		
//		Set<Entry<Pest, Integer>> es = hm.entrySet();
//		for(Entry<Pest, Integer> entry : es) {
//			System.out.println(entry.getKey() + " ~ " + entry.getValue()+ ", ");
//		}
//		System.out.println();
//		Iterator<Entry<Pest, Integer>> ex = es.iterator();
//		while(ex.hasNext()) {
//			Entry<Pest, Integer> en = ex.next();
//			System.out.println(en.getKey() + ";" + en.getValue());
//		}
		
		
		
		
		
		// BinarySearchTree 기법을 사용하려면 compareTo(), compare() 을 구현해야한다.
		
		TreeSet<Cup> ts = new TreeSet<Cup>();
		// comparator를 쓰는 2번째 방법
		// 클래스 외부의 비교기준을 작성
		TreeSet<Cup> ts2 = new TreeSet<Cup>(
			new Comparator<Cup>() {
				public int compare(Cup o1, Cup o2) {
					return o1.size - o2.size;
				}
			}
		);
		
		ts.add(new Cup(100,"서민규"));
		ts.add(new Cup(100,"서민규"));
		ts.add(new Cup(100,"홍길동"));
		ts.add(new Cup(70, "수지"));
		ts.add(new Cup(50, "수지"));
		ts.add(new Cup(20, "수지"));
		ts.add(new Cup(10, "수지"));
		ts.add(new Cup(170, "수지"));
		System.out.println(ts);
	}
}


