import java.net.*;
import java.io.*;
public class 최종소스_김성식 {

	// User and Game Server Information
	static final String NICKNAME = "서울6반_김성식_자바";
	static final String HOST = "127.0.0.1";
	static final int PORT = 1447; // Do not modify
	
	// predefined variables(Do not modify these values)
	static final int TABLE_WIDTH = 254;
	static final int TABLE_HEIGHT = 124;
	static final int NUMBER_OF_BALLS = 5;
	static final int[][] HOLES = {{0, 0}, {130, 0}, {260, 0}, {0, 130}, {130, 130}, {260, 130}};
	
	private static int cnt;
	
	public static void main(String[] args) {
		
		Socket socket = null;
		String recv_data = null;
		byte[] bytes = new byte[1024];
		int[][] balls = new int[NUMBER_OF_BALLS][2];

		try {
			socket = new Socket();
			System.out.println("Trying Connect: " + HOST + ":" + PORT);
			socket.connect(new InetSocketAddress(HOST, PORT));
			System.out.println("Connected: " + HOST + ":" + PORT);
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();

			String send_data = "9901/" + NICKNAME;
			bytes = send_data.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("Ready to play.");
			
			while (socket != null) {
				
				bytes = new byte[1024];
				
				int readByteCount = is.read(bytes);
				recv_data = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("Data Received: " + recv_data);
				
				String[] split_data = recv_data.split("/");
				int idx = 0;
				try {
					for (int i = 0; i < NUMBER_OF_BALLS; i++) {
						for (int j = 0; j < 2; j++) {
							balls[i][j] = Integer.parseInt(split_data[idx++]);
						}
					}
				}
				catch (Exception e) {
					bytes = new byte[1024];
					balls = new int[NUMBER_OF_BALLS][2];
					bytes = "9902/9902".getBytes("UTF-8");
					os.write(bytes);
					os.flush();
					System.out.println("Received Data has been currupted, Resend Requested.");
					continue;
				}
				
//				int stage = 0; 
//				int[][][] st = {
//						{
//							{65, 65},
//							{250, 120},
//							{0, 0},
//							{0, 0},
//							{0, 0}
//						}
//				};
				// 65/65/250/120/0/0/0/0/0/0 => stage = 1;
				// power 200로 하면 됨
				
				// 65/65/250/120/10/10/0/0/0/0 => stage = 2;
				// power 150로 하면 됨
				
				// 65/65/125/120/240/125/250/10/0/0 => stage = 3
				// power 150로 하면 됨
				
				
				// 65/65/115/110/135/15/125/120/130/5 => stage = 4
				// power 150로 하면 됨
				
				
				
				// 65/65/115/110/135/15/125/120/130/5 = > stage = 6
				// 
				
				// stage 판별
				// select변수로 공을 선택하자.
				
				
//				System.out.println("stage 5 : " + stage);
				
				
				
				double selectX = 0;
				double selectY = 0;
				
				// select변수로 공을 선택하자.
				for(int i = 4; i >= 1; i--) {
					if(balls[i][0] != 0) {
						selectX = balls[i][0];
						selectY = balls[i][1];	
					}
				}

				
				
				// 결국 selectX와
				// selectY를 조절해야함
				
				double dx = selectX - balls[0][0];
				double dy = selectY - balls[0][1];
				
				
				double distance = Math.sqrt(dx*dx + dy*dy);
				double ang = Math.atan2(dx, dy) * 180.0 / Math.PI;
				
				double angle = ang;
				
				int power = 140;
				// 거리에 따른 조절
				if(distance < 100) {
					power = 90;
				}
				
				
				// 해당하는 공의 홀을 선택. 어떻게 선택할 건데?
				
				
				System.out.println("거리 : " + distance + ", angle : " + angle + ", power : " + power);
				System.out.println("cnt : " + cnt);
				
				////////////////////////////////////////////////////////////////////
				// 주어진 정보(balls)를 바탕으로 샷 방향(angle)과 세기(power)를 결정하는 코드 작성 //
				//////////////////////////////////////////////////////////////////
				
				String merged_data = angle + "/" + power;
				bytes = merged_data.getBytes("UTF-8");
				os.write(bytes);
				os.flush();
				System.out.println("Data Sent: " + merged_data);
			}
			os.close();
			is.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
