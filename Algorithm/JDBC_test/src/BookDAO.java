import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * DAO : Data Acceess Object, 데이터베이스의 테이블을 조작하는 기능을 모아놓은 클래스
 * 	mydb 스키마의 books 테이블의 삽입, 삭제, 수정, 조회
 *
 */


public class BookDAO {
	// BookDAO을 SingleTon패턴으로 사용해보자.
	
	private Connection conn; // 데이터베이스와 통신하기 위한 객체
	
	private static BookDAO instance;
	
	private BookDAO() { // 객체 생성을 외부 클래스에서 못쓰게 막는다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String dbName = "mydb";
			String user = "root";
			String password = "tiger";
			String url = "jdbc:mysql://127.0.0.1/"+ dbName + "?characterEncoding=UTF-8&serverTimezone=UTC";
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(!conn.isClosed() + " : DB 연결 성공여부");
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static BookDAO getInstance() {
		if(instance == null)
			instance = new BookDAO();
		return instance;
	}
	
	/**
	 * 
	 * 책 한권의 정보를 데이터베이스에 삽입하는 메서드
	 * @param book
	 * 책 한권에 대한 정보가 BookVO 객체로 전달된다.
	 * 
	 * @return
	 * 쿼리문을 수행해서 영향받은 레코드의 수를 리턴
	 * 
	 */
	public int insertBook(BookVO book) {
		String sql = "INSERT INTO books VALUES (0,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getPublisher());
			pstmt.setString(3, book.getYear());
			pstmt.setInt(4, book.getPrice());
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// return이 끝나도 finally코드를 실행하게 된다.
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// 제대로 되지 않았다.
		return -1;
		
//		// 이렇게되면 auto close가 된다.
//		try (PreparedStatement pstmt = conn.prepareStatement(sql)){
//			pstmt.setString(1, book.getTitle());
//			pstmt.setString(2, book.getPublisher());
//			pstmt.setString(3, book.getYear());
//			pstmt.setInt(4, book.getPrice());
//			return pstmt.executeUpdate(sql);
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return -1;
		
	} // end of func
	
	/**
	 * book 하나의 정보를 받아서 id에 해당하는 레코드를 나머지 필드 값으로
	 * 변경하기
	 * @param book
	 * @return
	 */
	public int updateBook(BookVO book) {
		String sql = "UPDATE books SET title=?, publisher=?, year=?, price=? WHERE book_id=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  book.getTitle());
			pstmt.setString(2,  book.getPublisher());
			pstmt.setString(3,  book.getYear());
			pstmt.setInt(4,  book.getPrice());
			pstmt.setInt(5,  book.getBookid());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	} // end of func
	
	/**
	 * book 하나의 정보를 받아서 id에 해당하는 레코드를 삭제
	 * 
	 * @param book
	 * @return
	 */
	public int deleteBook(BookVO book) {
		String sql = "DELETE FROM books WHERE book_id=?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  book.getBookid());
			
			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return -1;
	} // end of deleteBook()
	
	/**
	 * 
	 * select * from books 실행해서 조회된 모든
	 * 책의 정보를 return 한다
	 * 
	 */
	public List<BookVO> selectAll() {
		List<BookVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM books";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO book = new BookVO();
				book.setBookid(rs.getInt(1));
				book.setTitle(rs.getString("title")); // rs.getString(2) 해도 됨
				book.setPublisher(rs.getString(3));
				book.setYear(rs.getString(4));
				book.setPrice(rs.getInt(5));
				list.add(book);
			}
			return list; // Select 시
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	/** 
	 * books 테이블에서 bookid의 id값을 가지고 있는 정보 하나만 리턴하기
	 * @param bookid
	 * @return
	 */
	public BookVO selectOne(int bookid) {
		String sql = "SELECT * FROM books WHERE book_id=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,  bookid);
			rs = pstmt.executeQuery();
			
			rs.next();
			
			BookVO book = new BookVO();
			book.setBookid(rs.getInt(1));
			book.setTitle(rs.getString("title")); // rs.getString(2) 해도 됨
			book.setPublisher(rs.getString(3));
			book.setYear(rs.getString(4));
			book.setPrice(rs.getInt(5));
			
			return book; // Select 시
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
		
		
	}
	
	
	
	
	
}
