package com.ssafy;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		IProductManagerImpl pm = new IProductManagerImpl();
		
		// 상품번호, 이름, 가격, 수량, 인치, 타입
		pm.add( new Tv("120","샘숭티비",20000,100,53,"플라즈마"));
		pm.add( new Tv("121","엘지티비",30000,90,60,"LCD"));
		pm.add( new Tv("122","LE티비",40000,80,24,"LdD"));
		pm.add( new Tv("123","SS티비",13000,70,14,"L3D"));
		
		// 상품번호, 이름, 가격, 수량, 용량
		pm.add( new Refrigerator("233","LG시그니처",20000,150,500));
		pm.add( new Refrigerator("212","AB시그니처",50000,160,600));
		pm.add( new Refrigerator("200","EE시그니처",60000,170,300));
		pm.add( new Refrigerator("245","RR시그니처",70000,180,350));
		
		while(true) {
			System.out.println("<<< 책 관리 프로그램 >>>");
			System.out.println("1. 상품 정보 전체 검색");
			System.out.println("2. 상품번호로 상품을 검색");
			System.out.println("3. 상품명으로 상품을 검색");
			System.out.println("4. Tv정보만 검색");
			System.out.println("5. Refrigerator만 검색");
			System.out.println("6. 400L이상의 Refri검색");
			System.out.println("7. 50inch이상의 tv 검색");
			System.out.println("8. 상품번호와 가격 입력받아 가격 변경");
			System.out.println("9. 상품번호로 상품 삭제");
			System.out.println("10. 전체 재고 상품 금액 구하기");
			System.out.println("0. 종료");
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			int input;
			
			ArrayList<Product> temp; // 정보를 저장하는  Product배열
			ArrayList<Refrigerator> tempR;
			ArrayList<Tv> tempT;
			
			switch(select) {
			case 1: // 1. 상품정보 전체를 검색
				temp = pm.search();
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 2: // 2. 상품번호로 상품을 검색
				System.out.print("상품번호를 입력하세요 : ");
				str = scan.next();
				temp = pm.search(str);
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 3: // 3. 상품명으로 상품을 검색하는 기능
				System.out.print("Title을 입력하세요 : ");
				str = scan.next();
				temp = pm.searchName(str);
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 4: // 4. Tv정보만 검색
				temp = pm.searchTv();
				for(int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 5: // 5. Refrigerator만 검색하는 기능
				temp = pm.searchRefrigerator();
				for(int i = 0; i < temp.size(); i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
				
			case 6: // 6. 400L이상의 Refrigerator 검색
				tempR = pm.search400L();
				for(int i = 0; i < tempR.size(); i++) {
					System.out.println( tempR.get(i).toString());					
				}
				break;
				
			case 7: // 7. 50inch 이상의 Tv 검색
				tempT = pm.search50inch();
				for(int i = 0; i < tempT.size(); i++) {
					System.out.println( tempT.get(i).toString());					
				}
				break;
			
			case 8: // 8. 상품번호와 가격을 입력 받아 상품 가격을 변경할 수 있는 기능
				System.out.println("번호와 가격을 차례로 입력하세요");
				pm.updatePrice(scan.next(), scan.nextInt());
				break;
				
			case 9: // 9. 상품번호로 상품ㅇ르 삭제하는 기능
				System.out.println("상품번호를 입력하세요");
				pm.delete(scan.next());
				break;
				
			case 10: // 10. 전체 재고 상품 금액을 구하는 기능
				System.out.println("전체금액 : " + pm.total());
				break;
				
			case 0: // 0 종료
				System.exit(0);
				break;
			default:
				System.out.println("다른 번호를 입력하세요");
			} // end of switch
			System.out.println("");
			
		} // end of while

		

	}

}
