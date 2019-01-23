

import java.util.ArrayList;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		IProductManagerImpl pm = new IProductManagerImpl();
		
		
		while(true) {
			System.out.println("<<< 책 관리 프로그램 >>>");
			System.out.println("0. 상품 정보 입력");
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
			System.out.println("11. 전송하기");
			System.out.println("99. 종료");
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			int input;
			
			ArrayList<Product> temp; // 정보를 저장하는  Product배열
			ArrayList<Refrigerator> tempR;
			ArrayList<Tv> tempT;
			
			switch(select) {
			case 0: // 0. 상품정보 입력
				System.out.println("1. 냉장고 입력");
				System.out.println("2. TV 입력");
				int c = scan.nextInt();
				scan.nextLine();

				if(c == 0) {
					Refrigerator r = new Refrigerator();
					System.out.print("Num  >> ");
					r.setNum(scan.nextLine());
					System.out.print("Name >> ");
					r.setName(scan.nextLine());
					System.out.print("Price >> ");
					r.setPrice(scan.nextInt());
					scan.nextLine();
					System.out.print("Amount >> ");
					r.setAmount(scan.nextInt());
					scan.nextLine();
					System.out.print("Volume >> ");
					r.setVolume(scan.nextInt());
					scan.nextLine();
					try {
						pm.add(r);
					} catch (DuplicateException e) {
						System.out.println("중복 데이터!");
					}
				}
				else if( c == 1) {
					Tv t = new Tv();
					System.out.print("Num  >> ");
					t.setNum(scan.nextLine());
					System.out.print("Name >> ");
					t.setName(scan.nextLine());
					System.out.print("Price >> ");
					t.setPrice(scan.nextInt());
					scan.nextLine();
					System.out.print("Amount >> ");
					t.setAmount(scan.nextInt());
					scan.nextLine();
					System.out.print("Inch >> ");
					t.setInch(scan.nextInt());
					scan.nextLine();
					System.out.print("Type >> ");
					t.setType(scan.nextLine());
					
					
					try {
						pm.add(t);
					} catch (DuplicateException e) {
						System.out.println("중복 데이터!");
					}
				}				
				break;
			case 1: // 1. 상품정보 전체를 검색
				temp = pm.search();
				for(int i = 0; i < temp.size() ; i++) {
					System.out.println(temp.get(i).toString());					
				}
				break;
			case 2: // 2. 상품번호로 상품을 검색
				System.out.print("상품번호를 입력하세요 : ");
				str = scan.next();
				try {
					temp = pm.search(str);
					for(int i = 0; i < temp.size() ; i++) {
						System.out.println(temp.get(i).toString());					
					}
				} catch (CodeNotFoundException e1) {
					System.out.println("예외발생!");
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
				try {
					tempR = pm.search400L();
					for(int i = 0; i < tempR.size(); i++) {
						System.out.println( tempR.get(i).toString());					
					}
				} catch (ProductNotFoundException e) {
					System.out.println("예외발생!");
				}

				break;
				
			case 7: // 7. 50inch 이상의 Tv 검색
				try {
					tempT = pm.search50inch();
					for(int i = 0; i < tempT.size(); i++) {
						System.out.println( tempT.get(i).toString());					
					}
				} catch (ProductNotFoundException e) {
					System.out.println("예외발생!");
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
	
			case 11:
				pm.send();
				break;
				
			case 99: // 0 종료
				System.exit(0);
				break;
			default:
				System.out.println("다른 번호를 입력하세요");
			} // end of switch
			System.out.println("");
			
		} // end of while

		

	}

}
