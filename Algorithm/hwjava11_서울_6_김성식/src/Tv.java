import java.io.Serializable;

public class Tv extends Product implements Serializable{
	private int inch;
	private String type;
	
	
	public Tv() {
		// TODO Auto-generated constructor stub
	}
	public Tv(String num, String name, int price, int amount, int inch, String type) {
		super(num, name, price, amount);
		this.inch = inch;
		this.type = type;
		// TODO Auto-generated constructor stub
	}

	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString() {
		String rStr = String.format(
				"%s\t|%s\t\t|%d\t|%d\t|%d\t|%s\t", super.getNum(), super.getName(), super.getPrice(), super.getAmount(), inch, type);
		return rStr;
	}

}
