package com.ssafy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		// 매니저 객체 선언
		RegisterMgr rm = new RegisterMgr();
		PersonMgr pm = new PersonMgr();
		MovieMgr mm = new MovieMgr();
		
		// 회원 기본 데이터 추가
		pm.add(new Person(100,"김성식",23));
		pm.add(new Person(101,"김재룡",25));
		pm.add(new Person(102,"이근희",26));
		pm.add(new Person(103,"전우형",24));
		pm.add(new Person(104,"이정연",30));
		
		// 영화 기본 데이터 추가
		mm.add(new Movie(1000,"바람과함께",100));
		mm.add(new Movie(1001,"인셉션",200));
		mm.add(new Movie(1002,"주먹왕랄프",120));
		mm.add(new Movie(1003,"사피",150));
		mm.add(new Movie(1004,"거상",160));
		
		// 영화 예매 정보 기본 데이터 추가
		rm.add(new Register(101, 1000));
		rm.add(new Register(100, 1001));
		rm.add(new Register(102, 1002));
		
		
		while(true) {
			System.out.println("<<< 영화 예매 관리 프로그램 >>>");
			System.out.println(" 1. 회원 정보 저장");
			System.out.println(" 2. 회원 정보 검색");
			System.out.println(" 3. 회원 정보 이름 수정");
			System.out.println(" 4. 회원 정보 삭제");
			System.out.println(" 5. 회원 정보 출력");
			System.out.println("-------------------------");
			System.out.println(" 6. 영화 정보 저장");
			System.out.println(" 7. 영화 정보 검색");
			System.out.println(" 8. 영화 정보 수정");
			System.out.println(" 9. 영화 정보 삭제");
			System.out.println("10. 영화명 오름차순 출력");
			System.out.println("11. 영화시간 오름차순 출력");
			System.out.println("-------------------------");
			System.out.println("12. 영화예매하기");
			System.out.println("13. 영화예매 정보 출력");
			System.out.println();
			
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			String str2; // 바꿀 문자열
		
			// 임시적으로 객체 정보를 담을 객체 선언
			Person p;
			Movie m;
			Register r;
			
			switch(select) {
			case 1: // 1. 회원 정보 입력
				p = new Person();
				System.out.print("ID  >> ");
				p.setId(scan.nextInt());
				System.out.print("Name >> ");
				p.setName(scan.next());
				System.out.print("Age >> ");
				p.setAge(scan.nextInt());;
				pm.add(p);
				break;
				
			case 2: // 2. 회원 정보 검색
				System.out.print("회원 이름을 입력하세요 : ");
				str = scan.next();
				p = pm.search(str);
				System.out.println(p.toString());
				break;
				
			case 3: // 3. 회원 이름 수정
				
				System.out.print("수정할 회원 이름을 입력하세요 >> ");
				str = scan.next();
				System.out.print("바꿀 이름을 입력하세요 >> ");
				str2 = scan.next();
				pm.update(str, str2);				
				break;
				
			case 4: // 4. 회원 정보 삭제
				System.out.print("삭제할 이름을 입력하세요 >> ");
				str = scan.next();
				pm.delete(str);
				break;
				
			case 5: // 5. 회원 정보 출력
				pm.info();				
				break;
			case 6: // 6. 영화 정보 저장
				m = new Movie();
				System.out.print("ID  >> ");
				m.setId(scan.nextInt());
				System.out.print("Name >> ");
				m.setName(scan.next()); 
				System.out.print("Time >> ");
				m.setTime(scan.nextInt());;
				mm.add(m);
				break;
				
			case 7: // 7. 영화 정보 검색
				System.out.print("영화 이름을 입력하세요 >> ");
				str = scan.next();
				m = mm.search(str);
				System.out.println(m.toString());
				break;
				
			case 8: // 8. 영화 이름 수정
				System.out.print("수정할 영화 이름을 입력하세요 >> ");
				str = scan.next();
				System.out.print("바꿀 이름을 입력하세요 >> ");
				str2 = scan.next();
				mm.update(str, str2);
				
				break;
				
			case 9: // 9. 영화 정보 삭제
				System.out.print("삭제할 영화를 입력하세요 >> ");
				str = scan.next();
				mm.delete(str);
				break;
				
			case 10: // 10. 영화명 순서로 출력
				Collections.sort(mm.list, mm.nameCompare);
				mm.info();
				break;
				
			case 11: // 11. 시간 순서로 출력
				Collections.sort(mm.list, mm.timeCompare);
				mm.info();
				break;
			
			case 12: // 12. 영화 예매하기
				r = new Register();
				System.out.print("영화 이름을 입력하세요 >> ");
				str = scan.next();
				System.out.print("회원 이름을 입력하세요 >> ");
				str2 = scan.next();
				
				m = mm.search(str); // 영화 이름에 해당하는 movie 객체 찾기
				p = pm.search(str2); // 회원 이름에 해당하는 person 객체 찾기
				
				r.setmId(m.getId()); // 영화 이름에 해당하는 id로 Register정보 set
				r.setpId(p.getId()); // 회원 이름에 해당하는 id로 Register정보 set
				
				rm.add(r); // Register정보 ad
				break;
				
			case 13: // 13. 예매 정보 출력
				for (Register re : rm.list) {
					p = pm.search(re.getpId());
					m = mm.search(re.getmId());
					System.out.print(p.toString());
					System.out.print(" | ");
					System.out.print(m.toString());
					System.out.println();
				}
				break;				
			default:
				System.out.println("다른 번호를 입력하세요");
				
			} // end of switch
			System.out.println("");
		} // end of while
	} // end of main		
} // end of class
