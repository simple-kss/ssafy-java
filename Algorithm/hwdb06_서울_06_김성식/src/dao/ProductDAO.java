package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.ProductVO;
import vo.ProductVO;

public class ProductDAO {
	// ProductDAO을 SingleTon패턴으로 사용해보자.
	
	private Connection conn; // 데이터베이스와 통신하기 위한 객체
	
	private static ProductDAO instance;
	
	private ProductDAO() { // 객체 생성을 외부 클래스에서 못쓰게 막는다.
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
	
	public static ProductDAO getInstance() {
		if(instance == null)
			instance = new ProductDAO();
		return instance;
	}
	
	public int insertProduct(ProductVO Product) {
		String sql = "INSERT INTO Product VALUES (?,?,?)";
		PreparedStatement pstmt = null;
		try {
			System.out.println(sql);
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  Product.getIsbn());
			pstmt.setString(2,  Product.getName());
			pstmt.setInt(3,  Product.getPrice());
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
	 * Product 하나의 정보를 받아서 id에 해당하는 레코드를 나머지 필드 값으로
	 * 변경하기
	 * @param Product
	 * @return
	 */
	public int updateProduct(ProductVO Product) {
		String sql = "UPDATE Product"
				+ " SET name=?, price=? WHERE isbn=?";
		PreparedStatement pstmt = null;
		
		try {
			System.out.println(Product.toString());
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  Product.getName());
			pstmt.setInt(2,  Product.getPrice());
			pstmt.setString(3,  Product.getIsbn());
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
	 * Product 하나의 정보를 받아서 id에 해당하는 레코드를 삭제
	 * 
	 * @param Product
	 * @return
	 */
	public int deleteProduct(String isbn) {
		String sql = "DELETE FROM Product WHERE isbn=?";
		
		PreparedStatement pstmt = null;
		
		try {
			System.out.println(isbn);
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
	} // end of deleteProduct()
	
	/**
	 * 
	 * select * from Products 실행해서 조회된 모든
	 * 책의 정보를 return 한다
	 * 
	 */
	public List<ProductVO> selectAll() {
		List<ProductVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM Product";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO Product = new ProductVO();
				Product.setIsbn(rs.getString(1));
				Product.setName(rs.getString(2));
				Product.setPrice(rs.getInt(3));
				list.add(Product);
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
	
	public ProductVO selectOne(String isbn) {
		String sql = "SELECT * FROM product WHERE isbn=?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, isbn);
			rs = pstmt.executeQuery();
			
	
			rs.next();
			
			ProductVO Product = new ProductVO();
			
			Product.setIsbn(rs.getString(1));
			Product.setName(rs.getString(2));
			Product.setPrice(rs.getInt(3));
			
			return Product; // Select 시
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

	public List<ProductVO> selectName(String name) {
		List<ProductVO> list = new ArrayList<>();
		
		String sql = "SELECT * FROM product WHERE name LIKE ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			name = "%"+name+"%";
			pstmt.setString(1, name);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ProductVO Product = new ProductVO();
				Product.setIsbn(rs.getString(1));
				Product.setName(rs.getString(2)); // rs.getString(2) 해도 됨
				Product.setPrice(rs.getInt(3));
				list.add(Product);
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
	
	
	
	
	
}
