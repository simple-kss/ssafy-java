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
		SellMgr rm = new SellMgr();
		PersonMgr pm = new PersonMgr();
		ProductMgr mm = new ProductMgr();
		
		// 회원 기본 데이터 추가
		pm.add(new Person(100,"김성식",23));
		pm.add(new Person(101,"김재룡",25));
		pm.add(new Person(102,"이근희",26));
		pm.add(new Person(103,"전우형",24));
		pm.add(new Person(104,"이정연",30));
		
		// 제품 기본 데이터 추가
		mm.add(new Product(1000,"갤럭시s9",10000,20));
		mm.add(new Product(1001,"LG시그니처",20000,25));
		mm.add(new Product(1002,"MSI노트북",12000,10));
		mm.add(new Product(1003,"현대자동차",15000,30));
		mm.add(new Product(1004,"HP프린터",16000,35));
		
		// 판매 정보 기본 데이터 추가
		// 회원ID, 제품ID, 수량 입력
		rm.add( new Sell(101, 1000, 6) );
		rm.add( new Sell(100, 1001, 7) );
		rm.add( new Sell(102, 1002, 10) );
		
		
		while(true) {
			System.out.println("<<< 제품 예매 관리 프로그램 >>>");
			System.out.println(" 1. 회원 정보 저장");
			System.out.println(" 2. 회원 정보 검색");
			System.out.println(" 3. 회원 정보 이름 수정");
			System.out.println(" 4. 회원 정보 삭제");
			System.out.println(" 5. 회원 정보 출력");
			System.out.println("-------------------------");
			System.out.println(" 6. 제품 정보 저장");
			System.out.println(" 7. 제품 정보 검색");
			System.out.println(" 8. 제품 정보 수정");
			System.out.println(" 9. 제품 정보 삭제");
			System.out.println("10. 제품명 오름차순 출력");
			System.out.println("-------------------------");
			System.out.println("11. 제품판매하기");
			System.out.println("12. 제품판매 정보 출력");
			System.out.println();
			
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			String str2; // 바꿀 문자열
		
			// 임시적으로 객체 정보를 담을 객체 선언
			Person p;
			Product m;
			Sell r;
			
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
			case 6: // 6. 제품 정보 저장
				m = new Product();
				System.out.print("ID  >> ");
				m.setId(scan.nextInt());
				System.out.print("Name >> ");
				m.setName(scan.next()); 
				System.out.print("Price >> ");
				m.setPrice(scan.nextInt());
				System.out.print("Amount >> ");
				m.setAmount(scan.nextInt());
				mm.add(m);
				break;
				
			case 7: // 7. 제품 정보 검색
				System.out.print("제품 이름을 입력하세요 >> ");
				str = scan.next();
				m = mm.search(str);
				System.out.println(m.toString());
				break;
				
			case 8: // 8. 제품 이름 수정
				System.out.print("수정할 제품 이름을 입력하세요 >> ");
				str = scan.next();	
				System.out.print("바꿀 이름을 입력하세요 >> ");
				str2 = scan.next();
				mm.update(str, str2);
				
				break;
				
			case 9: // 9. 제품 정보 삭제
				System.out.print("삭제할 제품를 입력하세요 >> ");
				str = scan.next();
				mm.delete(str);
				break;
				
			case 10: // 10. 제품명 순서로 출력
				Collections.sort(mm.list, mm.nameCompare);
				mm.info();
				break;
			
			case 11: // 11. 제품 판매하기
				int amount;
				r = new Sell();
				System.out.print("제품 이름을 입력하세요 >> ");
				str = scan.next();
				System.out.print("회원 이름을 입력하세요 >> ");
				str2 = scan.next();
				System.out.print("구매할 수량을 입력하세요 >> ");
				amount = scan.nextInt();
				
				m = mm.search(str); // 제품 이름에 해당하는 movie 객체 찾기
				p = pm.search(str2); // 회원 이름에 해당하는 person 객체 찾기
				
				r.setmId(m.getId()); // 제품 이름에 해당하는 id로 Register정보 set
				r.setpId(p.getId()); // 회원 이름에 해당하는 id로 Register정보 set
				r.setAmount(amount);
				
				rm.add(r); // Register정보 ad
				break;
				
			case 12: // 12. 판매 정보 출력
				for (Sell re : rm.list) {
					p = pm.search(re.getpId());
					m = mm.search(re.getmId());
					System.out.print(p.toString());
					System.out.print(" | ");
					System.out.print(m.toString());
					System.out.print(" | ");
					System.out.print("판매수량 :" + re.getAmount());
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
