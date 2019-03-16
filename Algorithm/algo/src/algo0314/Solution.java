package algo0314;

public class Solution {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 300; i++) {
			for(int j = 0; j < 300; j++) {
				sb.append('A');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

}
