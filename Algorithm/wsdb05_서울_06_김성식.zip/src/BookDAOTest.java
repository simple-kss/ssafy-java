import java.util.List;

public class BookDAOTest {
	public static void main(String[] args) {
		BookDAO dao = BookDAO.getInstance();
		BookVO book = new BookVO();
		
		System.out.println("-----selectAll 후 ------");
		List<BookVO> list = dao.selectAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("-----selectOne 후 ------");
		System.out.println(dao.selectOne("1001"));
		System.out.println();
		
		System.out.println("-----update 후 ------");
		book.setIsbn("1001");
		book.setTitle("하이루2");
		book.setPublisher("하선생2");
		book.setPrice(10000);
		book.setAuthor("차두리2");
		book.setDescription("안녕하세요11003");
		
		dao.updateBook(book);
		System.out.println(dao.selectOne("1001"));
		System.out.println();
		
		System.out.println("-----insert 후 ------");
		dao.insertBook(new BookVO("2001","책책책","최성식","양나무출판사",10000,"안녕하세요10"));
		list = dao.selectAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		System.out.println("-----delete 후 ------");
		dao.deleteBook("2001");
		list = dao.selectAll();
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

	} // end of main
} // end of class

