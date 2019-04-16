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
 */


public class asdasd {
	public static void main(String[] args) {
		// jdbc는 각각의 데이터베이스 회사에서
		// 약속된 메서드를 구현한 통신하는 라이브러리이다.
		
		// 영구적으로 데이터 저장하는 방법 DB,
		// 1. Connection 연결 (디비 접속)
		// 2. SQL 문을 DB에 전달
		// 3. SQL 질의 결과 리턴받음. (영향받은 튜플의 수 리턴)
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	} // end of main
} // end of class
