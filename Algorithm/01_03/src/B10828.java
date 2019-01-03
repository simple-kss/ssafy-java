import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class B10828 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int input = Integer.parseInt(str);
		
		for (int i = 0; i < input; i++) {
			String s = br.readLine();
//			System.out.println(s);
			if(s.indexOf("push") != -1 ) {
				String[] value = s.split(" ");
				st.push(1);
			}
			else if(s.indexOf("top") != -1 ) {
				
			}
			else if(s.indexOf("size") != -1 ) {
				
			}
			else if(s.indexOf("empty") != -1 ) {
				
			}
			else if(s.indexOf("pop") != -1 ) {
				
			}
			
		}

	}

}
