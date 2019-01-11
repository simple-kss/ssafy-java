package hwjava06_서울_06반_김성식;

public class ProductMgr {
	private Product[] products = new Product[100];
	private int index;
	
	public void add(Product p) {
		products[index++] = p;		
	}
	
	public Product[] search() {
		return products;
	}
	
	// 3. 상품 번호로 상품을 검색
	public Product[] search(String isbn) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(products[i].getIsbn().equals(isbn)) 
				temp[tempCnt++] = products[i];
		}
		return temp;
	}
	
	// 4. 상품명으로 상품을 검색하는 기능
	public Product[] searchName(String name) {
		Product[] temp = new Product[100];
		int tempCnt = 0;
		for (int i = 0; i < index; i++) {
			if(products[i].getName().equals(name)) 
				temp[tempCnt++] = products[i];
		}
		return temp;		
	}
	
	// 5. 상품번호와 가격을 입력 받아 상품가격을 변경
	public void update(String isbn, int price) {
		for (int i = 0; i < index; i++) {
			if(products[i].getIsbn().equals(isbn)) 
				products[i].setPrice(price);
		}
	}
	
	// 6. 상품번호로 상품을 삭제하는 기능
	public void delete(String isbn) {
		for (int i = 0; i < index; i++) {
			// 일치한다면 앞으로 떙기기
			if(products[i].getIsbn().equals(isbn)) {
				
				// 땡기는 작업
				for(int j = i; j < index-1; j++) {
					products[j] = products[j+1];
				}
				i--; // 그 위치를 다시 비교해야한다
				index--; // 유효한 데이터 갯수를 하나 줄인다.
				System.out.println("삭제되었습니다!");
			}
		}
	}
	
	// 7. 전체 재고 상품 금액을 구하는 기능
	public int total() {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			Product p = products[i];
			sum += p.getAmount() * p.getPrice();	
		}
		return sum;
	}
	
	public int getSize() {
		return index;
	}

}
