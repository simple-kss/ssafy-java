package wsjava13_서울_6반_김성식;

public class Weather {
	private int hour;
	private double temp;
	private String wfKor;
	private int reh;
	@Override
	public String toString() {
		return "시 : " +hour + ", 온도 : " + temp + ", 상태 : " + wfKor + ", 습도 : " + reh;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public String getWfKor() {
		return wfKor;
	}
	public void setWfKor(String wfKor) {
		this.wfKor = wfKor;
	}
	public int getReh() {
		return reh;
	}
	public void setReh(int reh) {
		this.reh = reh;
	}
	public Weather(int hour, double temp, String wfKor, int reh) {
		super();
		this.hour = hour;
		this.temp = temp;
		this.wfKor = wfKor;
		this.reh = reh;
	}
	public Weather() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
