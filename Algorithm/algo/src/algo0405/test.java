package algo0405;

public class test {
	public static void main(String[] args) {
		System.out.println("5000 300 200 279");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 5000; i++) {
			sb.append(i%300+1).append('\n');
		}
		System.out.println(sb);

	}

}
