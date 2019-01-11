package com.ssafy;

import java.util.Scanner;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		MovieMgr m = new MovieMgr();
		
		m.add(new Movie("시티 오브 갓","카티아 런드",9,"드라마","재미있는 영화이다."));
		m.add(new Movie("반지의 제왕","피터 잭슨",8,"드라마","재미없는 영화이다."));
		m.add(new Movie("노 맨스 랜드","다니스 타노비치",7,"판타지","놀라운 영화이다."));
		m.add(new Movie("그녀에게","알모도바트",10,"전쟁","신기한 영화이다."));
		m.add(new Movie("러시아 방주","소쿠로프",1,"범죄","지루한 영화이다."));
		m.add(new Movie("볼링 포 콜럼바인","마이클 무어",2,"범죄","무미건조한 영화이다."));
		m.add(new Movie("올드부어","박찬욱",3,"범죄","감동을 주는 영화이다."));
		
		while(true) {
			System.out.println("<<< 영화 관리 프로그램 >>>");
			System.out.println("1. 영화 정보 입력");
			System.out.println("2. 영화 정보 전체 검색");
			System.out.println("3. 영화명 검색");
			System.out.println("4. 영화 장르별 검색");
			System.out.println("5. 영화 정보 삭제");
			System.out.println("6. 영화 감독별 검색");
			System.out.println("0. 종료");
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			Movie[] temp; // 정보를 저장하는 Movie배열
			
			switch(select) {
			case 1: // 1. 영화 정보 입력
//				성식이 여행기
//				김성식
//				10
//				드라마
//				참재밌다.
				Movie t = new Movie();
				System.out.print("제목  >> ");
				t.setTitle(scan.nextLine());
				System.out.print("감독 >> ");
				t.setDirector(scan.nextLine()); 
				System.out.print("평점 >> ");
				t.setGrade(scan.nextInt());
				scan.nextLine();
				System.out.print("장르 >> ");
				t.setGenre(scan.nextLine());
				System.out.print("요약 >> ");
				t.setSummary(scan.nextLine());
				m.add(t);
				
				break;
			case 2: // 2. 영화 정보 전체 검색
				temp = m.search();
				for(int i = 0; i < m.getSize() ; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 3: // 3. 영화명 검색
				System.out.print("영화명을 검색하세요 : ");
				str = scan.next();
				temp = m.search(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 4: // 4. 영화 장르별 검색
				System.out.print("영화 장르를 검색하세요 : ");
				str = scan.next();
				temp = m.searchGenre(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 5: // 5. 영화 정보 삭제
				System.out.print("영화 제목을 입력하세요 : ");
				str = scan.nextLine();
				m.delete(str);
	
				break;
			case 6: // 6. 영화 감독 검색
				System.out.print("영화 감독을 입력하세요 : ");
				str = scan.next();
				temp = m.searchDirector(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
				
			case 0: // 0 종료
				System.exit(0);
				break;
			default:
				System.out.println("다른 번호를 입력하세요");
			}
			
			System.out.println("");
		} // end of while

	} // end of main 

} // end of class
