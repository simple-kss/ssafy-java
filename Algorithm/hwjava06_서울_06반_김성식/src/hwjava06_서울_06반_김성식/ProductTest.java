package hwjava06_서울_06반_김성식;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		ProductMgr pm = new ProductMgr();

		pm.add(new Product("1000","HTC",10000,5));
		pm.add(new Product("1001","갤럭시",1000,5));
		pm.add(new Product("1002","갤노트",2500,4));
		pm.add(new Product("1003","G6",500,8));
		pm.add(new Product("1004","픽셀2",1200,5));
		pm.add(new Product("1005","아이폰X",3000,5));
		pm.add(new Product("1006","모토로라",5000,2));
		
		while(true) {
			System.out.println("<<< 재고 관리 프로그램 >>>");
			System.out.println("1. 재고 정보 입력");
			System.out.println("2. 재고 정보 전체 검색");
			System.out.println("3. 상품번호 검색");
			System.out.println("4. 상품명 검색");
			System.out.println("5. 상품가격 변경");
			System.out.println("6. 상품번호로 상품 삭제");
			System.out.println("7. 전체 재고 상품 금액 출력");			
			System.out.println("0. 종료");
			System.out.print("원하는 번호를 선택하세요. ");
			int select = scan.nextInt();
			scan.nextLine();
			String str; // 입력받는 문자열
			Product[] temp; // 정보를 저장하는 Movie배열
			
			switch(select) {
			case 1: // 1. 상품 정보 입력
				Product t = new Product();
				System.out.print("상품번호  >> ");
				t.setIsbn(scan.nextLine());
				System.out.print("상품명 >> ");
				t.setName(scan.nextLine()); 
				System.out.print("상품가격 >> ");
				t.setPrice(scan.nextInt());
				scan.nextLine();
				System.out.print("상품수량 >> ");
				t.setAmount(scan.nextInt());
				scan.nextLine();
				
				pm.add(t);
				
				break;
			case 2: // 2. 상품 정보 전체 검색
				temp = pm.search();
				for(int i = 0; i < pm.getSize() ; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 3: // 3. 상품번호로 상품을 검색
				System.out.print("상품번호를 검색하세요 : ");
				str = scan.next();
				temp = pm.search(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 4: // 4. 상품명으로 상품을 검색
				System.out.print("상품명을 검색하세요 : ");
				str = scan.next();
				temp = pm.searchName(str);
				for(int i = 0; temp[i] != null; i++) {
					System.out.println(temp[i].toString());					
				}
				break;
			case 5: // 5. 상품번호와 가격을 입력 받아 상품 가격 변경
				System.out.print("상품번호를 입력하세요 : ");
				String inIsbn = scan.next();
				System.out.print("가격을 입력하세요 : ");
				int inPrice = scan.nextInt();
				
				pm.update(inIsbn, inPrice);
	
				break;
			case 6: // 6. 상품번호로 상품을 삭제
				System.out.print("상품번호를 입력하세요 : ");
				str = scan.next();
				pm.delete(str);
				break;
			case 7: // 7. 전체 재고 상품 금액을 구하기
				System.out.println("전체 재고 상품 금액 : "+ pm.total());
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
