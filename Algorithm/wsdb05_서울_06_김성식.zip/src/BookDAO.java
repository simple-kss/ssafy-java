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
			
			String dbName = "my12";
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
		String sql = "INSERT INTO book VALUES (?,?,?,?,?,?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  book.getIsbn());
			pstmt.setString(2,  book.getTitle());
			pstmt.setString(3,  book.getAuthor());
			pstmt.setString(4,  book.getPublisher());
			pstmt.setInt(5,  book.getPrice());
			pstmt.setString(6,  book.getDescription());
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
	}
		
		
	/**
	 * book 하나의 정보를 받아서 id에 해당하는 레코드를 나머지 필드 값으로
	 * 변경하기
	 * @param book
	 * @return
	 */
	public int updateBook(BookVO book) {
		String sql = "UPDATE book"
				+ " SET title=?, Author=?, publisher=?, price=?, description=? WHERE isbn=?";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  book.getTitle());
			pstmt.setString(2,  book.getAuthor());
			pstmt.setString(3,  book.getPublisher());
			pstmt.setInt(4,  book.getPrice());
			pstmt.setString(5,  book.getDescription());
			pstmt.setString(6,  book.getIsbn());
			
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
	public int deleteBook(String isbn) {
		String sql = "DELETE FROM book WHERE isbn=?";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  isbn);
			
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
		
		String sql = "SELECT * FROM book";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookVO book = new BookVO();
				book.setIsbn(rs.getString(1));
				book.setTitle(rs.getString(2));
				book.setAuthor(rs.getString(3));
				book.setPublisher(rs.getString(4));
				book.setPrice(rs.getInt(5));
				book.setDescription(rs.getString(6));
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
	public BookVO selectOne(String isbn) {
		String sql = "SELECT * FROM book WHERE isbn=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			
			rs.next();
			
			BookVO book = new BookVO();
			book.setIsbn(rs.getString(1));
			book.setTitle(rs.getString(2));
			book.setAuthor(rs.getString(3));
			book.setPublisher(rs.getString(4));
			book.setPrice(rs.getInt(5));
			book.setDescription(rs.getString(6));
			
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
