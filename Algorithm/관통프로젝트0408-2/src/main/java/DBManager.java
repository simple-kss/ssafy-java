import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	
	private final String url = "jdbc:sqlite:C:/Users/TaeHyeong/Desktop/";
	
	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void createNewDatabase(String dbName) {
		
		try (Connection conn = DriverManager.getConnection(url + dbName)) {
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void sendQuery(String dbName, String sql) throws SQLException {
		
		Statement stmt = null;
		try (Connection conn = DriverManager.getConnection(url + dbName)) {
			stmt = conn.createStatement();
			stmt.execute(sql);
		}
	}
	
	
	public User getDataFromQuery(String dbName, String sqlm) throws SQLException {
		
		User user = null;
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try (Connection conn = DriverManager.getConnection(url + dbName)) {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sqlm);
			
			while (rs.next()) {
				user = new User(rs.getString("id"), rs.getString("pw"), rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return user;
		
	}
	
	
}
