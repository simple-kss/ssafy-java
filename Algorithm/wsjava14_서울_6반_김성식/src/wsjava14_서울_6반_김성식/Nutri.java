package wsjava14_서울_6반_김성식;

public class Nutri {
	private String desc;
	private String serving;
	private String cont1;
	private String cont2;
	private String cont3;
	private String cont4;
	private String cont5;
	private String cont6;
	private String cont7;
	private String cont8;
	private String cont9;
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getServing() {
		return serving;
	}
	public void setServing(String serving) {
		this.serving = serving;
	}
	public String getCont1() {
		return cont1;
	}
	public void setCont1(String cont1) {
		this.cont1 = cont1;
	}
	public String getCont2() {
		return cont2;
	}
	public void setCont2(String cont2) {
		this.cont2 = cont2;
	}
	public String getCont3() {
		return cont3;
	}
	public void setCont3(String cont3) {
		this.cont3 = cont3;
	}
	public String getCont4() {
		return cont4;
	}
	public void setCont4(String cont4) {
		this.cont4 = cont4;
	}
	public String getCont5() {
		return cont5;
	}
	public void setCont5(String cont5) {
		this.cont5 = cont5;
	}
	public String getCont6() {
		return cont6;
	}
	public void setCont6(String cont6) {
		this.cont6 = cont6;
	}
	public String getCont7() {
		return cont7;
	}
	public void setCont7(String cont7) {
		this.cont7 = cont7;
	}
	public String getCont8() {
		return cont8;
	}
	public void setCont8(String cont8) {
		this.cont8 = cont8;
	}
	public String getCont9() {
		return cont9;
	}
	public void setCont9(String cont9) {
		this.cont9 = cont9;
	}
	
	public Nutri(String desc, String serving, String cont1, String cont2, String cont3, String cont4, String cont5,
			String cont6, String cont7, String cont8, String cont9) {
		super();
		this.desc = desc;
		this.serving = serving;
		this.cont1 = cont1;
		this.cont2 = cont2;
		this.cont3 = cont3;
		this.cont4 = cont4;
		this.cont5 = cont5;
		this.cont6 = cont6;
		this.cont7 = cont7;
		this.cont8 = cont8;
		this.cont9 = cont9;
	}
	public Nutri() {
		super();
	}
	@Override
	public String toString() {
		return desc + "\ncont1=" + cont1 + "\ncont2=" + cont2 + "\ncont3="
				+ cont3 + "\ncont4=" + cont4 + "\ncont5=" + cont5 + "\ncont6=" + cont6 + "\ncont7=" + cont7 + "\ncont8="
				+ cont8 + "\ncont9=" + cont9;
	}
	
	
	
	
	
}
