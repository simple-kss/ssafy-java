package mvc.vo;

public class Person {
	private String name;
	private String id;
	private String password;
	private String allergy;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String id, String password, String allergy) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.allergy = allergy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAllergy() {
		return allergy;
	}
	public void setAllergy(String allergy) {
		this.allergy = allergy;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", password=" + password + ", allergy=" + allergy + "]";
	}
}
