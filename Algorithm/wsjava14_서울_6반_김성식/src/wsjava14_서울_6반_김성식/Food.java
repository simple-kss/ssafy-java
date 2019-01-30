package wsjava14_서울_6반_김성식;

public class Food {
	private String name;
	private String maker;
	private String material;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Food(String name, String maker, String material) {
		super();
		this.name = name;
		this.maker = maker;
		this.material = material;
	}
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name + " | " + maker;
	}

	
	
	
	
	
}
