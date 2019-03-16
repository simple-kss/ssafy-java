package algo0308;

public class test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		// C R Z
		// 45 55 33
		for(int z = 0; z <= 33; z++) {
			for(int i = 0; i <= 55; i++) {
				for(int j = 0; j <= 45; j++) {
					sb.append(0).append(' ');
				}
				sb.append('\n');
				
			}
			
		}
		
		System.out.println(sb);

	}

}
