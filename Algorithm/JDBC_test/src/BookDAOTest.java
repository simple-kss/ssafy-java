import java.util.List;

public class BookDAOTest {
	public static void main(String[] args) {
		
		
		BookDAO dao = BookDAO.getInstance();
		
		BookVO book = new BookVO();
		
//		book.setBookid(2);
//		book.setTitle("This is JDBC");
//		book.setPublisher("this is");
//		book.setYear("2020");
//		book.setPrice(10000);
//		int result = dao.updateBook(book);
//		System.out.println("Insert 결과 : "+ result +" 개의 행이 삽입되었습니다.");
//		
//		result = dao.deleteBook(book);
//		System.out.println("delete 결과 : "+ result +" 개의 행이 삽입되었습니다.");
		
		List<BookVO> list = dao.selectAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println();
		System.out.println(dao.selectOne(9));
		

	} // end of main
} // end of class

