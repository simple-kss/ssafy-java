package vo;

public class ProductVO {
	private String isbn;
	private String name;
	private int price;
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
	public ProductVO(String isbn, String name, int price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.price = price;
	}
	public ProductVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ProductVO [isbn=" + isbn + ", name=" + name + ", price=" + price + "]";
	}

}
