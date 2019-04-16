import java.util.List;

public class test {
	public static void main(String[] args) {
		ProductDAO dao = ProductDAO.getInstance();
		ProductVO Product = new ProductVO();

		System.out.println("-----selectAll 후 ------");
		List<ProductVO> list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		System.out.println("-----selectOne 후 ------");
		System.out.println(dao.selectOne("123-1-12"));
		System.out.println();

		System.out.println("-----update 후 ------");
		Product.setIsbn("123-1-10");
		Product.setName("하이루2");
		Product.setPrice(10000);

		dao.updateProduct(Product);
		System.out.println(dao.selectOne("123-1-10"));
		System.out.println();

		System.out.println("-----insert 후 ------");
		dao.insertProduct(new ProductVO("20023", "대형TV", 23000));
		list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		System.out.println("-----delete 후 ------");
		dao.deleteProduct("2001");
		list = dao.selectAll();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

	} // end of main
} // end of class
