import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * JDBC : 자바에서 데이터베이스에 접속해서 통신하기위한 인터페이스(라이브러리)
 * 			JDBC를 하기 위해서는 Connection 객체를 사용한다.
 * 			Connection을 통해서 소통을 할텐데
 * 			Java에서는 Connection 인터페이스만 제공이 된다.
 * 			각 DB회사에서는 Connection 인터페이스를 추상메서드 바디를 완성해서 제공(라이브러리)
 * 			이 라이브러리는 DB회사에서 구해와야함
 * 
 * https://mvnrepository.com/ 에는 왠만한 자바라이브러리 오픈소스가 다 여기에 있음, 사용량도 표시됨			
 * MyBatis jdbc를 편하게 이용하게 해주는 라이브러리
 * MYSQL 검색해서 최신 버전 *.jar 파일을 다운받아 넣자.
 * Eclipse 프로젝트 추가 작업
 * 		lib 폴더 생성
 * 		빌드패스 - 라이브러리 - add jar... 에 추가
 * 
 *디프리케이트 : 버전이 바뀌면서 이전 버전에서 쓰던 구문?을 사용하지 못하는거
 */


public class JDBC_test_prepare {
	// 실행순서 : static을 먼저 (기본값 저장, 명시적 선언한 값으로 초기화, 초기화블럭 실행)
	// 명시적 선언한 문장과 (static)블럭은 순서에 영향이 있다.
	
	// 여기서 명시적 선언한 값이란 static Connection conn = abc; 중에서 abc를 의미
	
	static Connection conn;	
	
	// 초기화블럭
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결
			// "서버주소" + "DB명"
			String url = "jdbc:mysql://127.0.0.1/" + "mydb"; // 서버 주소 쓰기
			url += "?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "tiger";
			
			// 이 블럭에서 밖에 conn을 못쓴다. 그래서 전역변수로 놓는다.
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	public static void main(String[] args) {
		// jdbc는 각각의 데이터베이스 회사에서
		// 약속된 메서드를 구현한 통신하는 라이브러리이다.
		
		// 영구적으로 데이터 저장하는 방법 DB,
		// 1. Connection 연결 (디비 접속)
		// 2. SQL 문을 DB에 전달
		// 3. SQL 질의 결과 리턴받음. (영향받은 튜플의 수 리턴)
		
		
		
		// mysql 6.0대 이상부터는 cj 넣어야함.
		try {

			
			System.out.println("정상적으로 연결됨");
			System.out.println(!conn.isClosed());
			
			Scanner sc = new Scanner(System.in);
			System.out.println("책제목 : ");
			String title = sc.nextLine();
			
			System.out.println("출판사: ");
			String publisher = sc.nextLine();
			
			System.out.println("연도: ");
			String year = sc.nextLine();
			
			System.out.println("가격: ");
			int price = Integer.parseInt(sc.nextLine());
			
			// statement가 있고
			// prepare statement가 있다.
			
			insertBook(title, publisher, year, price);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		

	} // end of main
	
	static void insertBook(String title, String publisher, String year, int price) {
		// 하나의 문장을 던질 객체 생성
		String sql = "INSERT INTO books VALUES(0,?,?,?,?)";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			// book_id, title, publisher, year, price
			pstmt.setString(1, title); // 첫번쨰 물음표에 title 변수의 값을 문자열 형채로 채워라
			pstmt.setString(2, publisher); // 첫번쨰 물음표에 title 변수의 값을 문자열 형채로 채워라
			pstmt.setString(3, year); // 첫번쨰 물음표에 title 변수의 값을 문자열 형채로 채워라
			pstmt.setInt(4, price); // 첫번쨰 물음표에 title 변수의 값을 문자열 형채로 채워라
			int result = pstmt.executeUpdate();
			
			System.out.println("쿼리 DB에 전달 성공 : " + result);
			// 준비된 커리 실행
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
} // end of class




// JDBC를 쓰면써 조금 불편하다..
// 그것을 해결한게 Mybatis
// 무엇이 불편했나?
// 0,?,?,? 이렇게 쓰면서
// 인자를 넘겨서 sql을 실행했다.
// 이것을 간편하게 해주는게 MyBatis
// 다음 시간에 배워보자









