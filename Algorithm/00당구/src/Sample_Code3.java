import java.net.*;
import java.io.*;
public class Sample_Code3 {

	// User and Game Server Information
	static final String NICKNAME = "서울6반_김성식_자바";
	static final String HOST = "127.0.0.1";
	static final int PORT = 1447; // Do not modify
	
	// predefined variables(Do not modify these values)
	static final int TABLE_WIDTH = 254;
	static final int TABLE_HEIGHT = 124;
	static final int NUMBER_OF_BALLS = 5;
	static final int[][] HOLES = {{6, 6}, {124, 6}, {254, 6}, {6,124}, {124, 124}, {254, 124}};
	
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
				
				// 1. 쳐야할 공과 가까운 홀 선택
				// 2. 쳐야할 공을 쎼려야할 위치 선정
				// 3. 썌리기
				
				double[] white = new double[2];
				white[0] = balls[0][0];
				white[1] = balls[0][1];
				
				
				double selectX = 0;
				double selectY = 0;
				
				// select변수로 공을 선택하자.
				for(int i = 4; i >= 1; i--) {
					if(balls[i][0] != 0) {
						selectX = balls[i][0];
						selectY = balls[i][1];	
					}
					
				}
				
				//1. 그 공과 가장가까운 홀 선텍
				int[] hall = selectHall(selectX, selectY);

				//2. 쳐야할 공 위치선정
				
				//먼저 각 측정
				double dx = hall[0] - selectX;
				double dy = hall[1] - selectY;
				double cAng = Math.atan2(dy, dx) * 180.0 / Math.PI;
//				System.out.println("** cAng : " + cAng);
//				System.out.println("** hall[0] : " + hall[0]);
//				System.out.println("** hall[1] : " + hall[1]);
				
				double cx = selectX - 7.5 * Math.cos(cAng);
				double cy = selectY - 7.5 * Math.sin(cAng);
				
				System.out.println("** 때릴위치 x : " + cx);
				System.out.println("** 때릴위치 y : " + cy);
				System.out.println("** 홀 위치 x : " + hall[0]);
				System.out.println("** 홀 위치 y : " + hall[1]);
				System.out.println("** 공 위치 x : " + selectX);
				System.out.println("** 공 위치 y : " + selectY);
				System.out.println("** 각측정 cAng : " + cAng);
				
				System.out.println("더할값 x : " + -6.0 * Math.cos(cAng));  
				System.out.println("더할값 y : " + -6.0 * Math.sin(cAng));  
				
				double d1 = getDistance(hall[0], hall[1], selectX, selectY);
				double d2 = getDistance(selectX, selectY, balls[0][0], balls[0][1]);
				
				System.out.println("--------------------");

				
				
				//쌔리기
				// cx, cy는 떄릴 위치
				dx = cx - white[0];
				dy = cy - white[1];
				
				System.out.println("**2 dx : " + dx);
				System.out.println("**2 dy : " + dy);
				
				double ang = Math.atan2(dy, dx) * 180.0 / Math.PI;
				System.out.println("** ang : " + ang);
				
				double dis = Math.sqrt(dx*dx + dy*dy);
				System.out.println("**dis : " + dis);
				
				int p = 120;
				if(d1+d2 >= 190) {
					p = 120;
				}
				else if(d1+d2  <= 50) {
					p = 120;
				}
				else if(d1+d2  <= 90) {
					p = 120;
				}
				else {
					p = 120;
				}
				double angle = 90 - ang;
				int power = p;
				
				
				System.out.println("shot!! angle : " + angle);
				System.out.println("shot!! power : " + power);
				
				
				
				
				
				System.out.println("------------------------------");
				
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

	private static int[] selectHall(double selectX, double selectY) {
		
		double min = Double.MAX_VALUE;
		int index = 0;
		
		for (int i = 0; i < HOLES.length; i++) {
			double x = HOLES[i][0];
			double y = HOLES[i][1];
			double d = getDistance(selectX, selectY, x,y);
			if(min > d) {
				min = d;
				index = i;
			}
		}
		return HOLES[index];
	}

	private static double getDistance(double selectX, double selectY, double x, double y) {
		double dx = selectX - x;
		double dy = selectY - y;
		return Math.sqrt(dx*dx + dy*dy);
	}
}
