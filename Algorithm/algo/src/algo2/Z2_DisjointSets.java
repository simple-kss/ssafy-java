package algo2;

//2.20
/**
 * 
 * 서로소 집합 disjointSet, 꼭 알고 있어야하는 기법 *********************************
 * 	makeSet(int x)		멤버 x를 포함하는 새로운 집합을 생성
 * 	findSet(int x)		멤버 x를 포함하는 집합을 찾아서 대표자 리턴
 * 	union(int x,int y)	멤버 x,y를 포함하는 두 집합을 리턴(x,y 같을 수도 있으니 유의, 서로 다른 집합일때만 합쳐라)
 * 	link(int px,int py)	x대표자와 y대표자의 집합을 합침, 누굴 대표자로 할꺼냐
 *
 */
public class Z2_DisjointSets {
	private static int[] p = new int[10];	//부모를 저장할 배열!
	private static int[] rank = new int[p.length];	//문제점해결 2: 깊이를 저장할 배열 ***
	public static void main(String[] args) {
		
		//makeSet
		for (int i = 0; i < p.length; i++) {
			makeSet(i);	//i번째 데이터의 원소를 하나짜리 집합으로 만들어라
		}
		
		//printSet
		printSet();
		
		//unionSet
		union(0,1);
		printSet();
		
		union(2,3);
		printSet();
		
		union(0,3);
		printSet();
		
		
	}//end of main

	/** 멤버 x,y를 포함하는 두 집합을 통합(서로 다른 집할일 때만 합쳐야함) */
	public static void union(int x, int y) {
		int px = findSet(x);	//서로 다른값이여야함.
		int py = findSet(y);
		
		link(px,py);	//문제점 해결2 
		
//		p[py]=px;	//px:대표자, 
	}//end of union()

	/** x대표자와 y대표자의 집합을 합침, 누굴 대표자로 할꺼냐 */
	public static void link(int px, int py) {	//문제점 해결2: rank를 이용한 union
		if(rank[px] > rank[py]) {//큰놈을 부모로 해준다.
			p[py]=px;
		}
		else {
			p[px]=py;
			if(rank[px] == rank[py]) {
				rank[py]++;	//두 대표자의 랭크 값이 같을 경우 랭크 값이 증가한다.
			}
		}
	}//end of link()

	/** 멤버 x를 포함하는 집합을 찾아서 대표자를 리턴*/
	public static int findSet(int x) {
		if(p[x] == x) {
			return x;
		}
		p[x] = findSet(p[x]);	//문제점 해결1 : path Compression 대표자를 찾으면 저장 하자 ******
		return p[x];	//내가 부모가 아닌 경우 재귀적으로 다시 나를 호출
	}//end of findSet()

	/** p배열을 출력하는 메소드*/
	public static void printSet() {
		//인덱스 출력
		System.out.print("인덱스 : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ",i);
		}
		System.out.println();
		
		//부모 출력
		System.out.print("부   모 : ");
		for (int i = 0; i < p.length; i++) {
			System.out.printf("%2d ",p[i]);
		}
		System.out.println();
		
		//랭크 출력
		System.out.print("랭   크 : ");
		for (int i = 0; i < rank.length; i++) {
			System.out.printf("%2d ",rank[i]);
		}
		System.out.println("\n");
		
	}//end of printSet()

	public static void makeSet(int x) {
		p[x] = x; //나의 부모는 나다, 부모를 저장, 자기자신의 index of -1 저장
//		rank[x]=0;	초기화,자바에서는 의미없음
	}//end of makeSet()
}//end of class




