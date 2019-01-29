
// vo
public class Person {
	private int num;
	private String name;
	private String address;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person(int num, String name, String address) {
		super();
		this.num = num;
		this.name = name;
		this.address = address;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return num + " | " + name + " | " + address;
	}
	
	

}