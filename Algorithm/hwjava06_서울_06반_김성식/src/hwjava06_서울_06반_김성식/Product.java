package hwjava06_서울_06반_김성식;

public class Product {
	private String isbn; // 제품번호
	private String name; // 제품명
	private int price; // 가격
	private int amount; // 재고수량
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String isbn, String name, int price, int amount) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public String toString() {
		String str;
		str = String.format("%-10s\t|%-10s\t|%-3d\t|%-3d\t", isbn, name, price, amount);
		return str;	
	}
	
}
