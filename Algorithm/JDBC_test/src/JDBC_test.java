import java.sql.Connection;
import java.sql.DriverManager;
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


public class JDBC_test {
	public static void main(String[] args) {
		// jdbc는 각각의 데이터베이스 회사에서
		// 약속된 메서드를 구현한 통신하는 라이브러리이다.
		
		// 영구적으로 데이터 저장하는 방법 DB,
		// 1. Connection 연결 (디비 접속)
		// 2. SQL 문을 DB에 전달
		// 3. SQL 질의 결과 리턴받음. (영향받은 튜플의 수 리턴)
		
		
		
		// mysql 6.0대 이상부터는 cj 넣어야함.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 연결
			// "서버주소" + "DB명"
			String url = "jdbc:mysql://127.0.0.1/" + "mydb"; // 서버 주소 쓰기
			url += "?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String password = "tiger";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			System.out.println("정상적으로 연결됨");
			System.out.println(!conn.isClosed());
			
			String sql = "INSERT INTO books(title, publisher, year, price)" 
					+ "VALUES('JDBC 완성','사피출판','2019',50000)";
			
			// statement가 있고
			// prepare statement가 있다.
			
			// 하나의 문장을 던질 객체 생성
			Statement stmt = conn.createStatement();
			
			int result = stmt.executeUpdate(sql); // 완성된 커리로 날림
			
			System.out.println("쿼리 DB에 전달 성공 : " + result);
			// 준비된 커리 실행
			
			
			// 커리 실행하는 3가지 방법
			// execute(sql)		: DDL (CREATE, ALTER, );
			// executeUpdate(sql) : DML (INSERT, UPDATE, DELETE, SELECT);
			// executeQuery(sql) : (SELECT);
			
			// 사용자에게 제목, 출판사, 연도, 금액을 입력받아서, insert 해주세요.
			Scanner sc = new Scanner(System.in);
			String title = sc.nextLine();
			String publisher = sc.nextLine();
			String year = sc.nextLine();
			int price = Integer.parseInt(sc.nextLine());
			sql = "INSERT INTO books(title, publisher, year, price)" 
					+ "VALUES('"+title +"','"+publisher+"','"+year+"',"+price+")";
			
			
			result = stmt.executeUpdate(sql); // 완성된 커리로 날림
			System.out.println("쿼리 DB에 전달 성공 : " + result);
			
			
			
			
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	} // end of main
} // end of class
