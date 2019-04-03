package algo0401;

public class test {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("40000");
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 20000; i++) {
			sb.append(i).append(' ');
		}
		for (int i = 20000; i >= 1; i--) {
			sb.append(i).append(' ');
		}
		System.out.println(sb);
	}

}
