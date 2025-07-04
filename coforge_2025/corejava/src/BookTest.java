
public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		Book book2 = new Book(877887, "java in action", 1200);
		Book book3 = new Book(65556, "spring in action", 2300);
		Book book4 = new Book(65557, "story book");

		book1.getBookInfo();
		book2.getBookInfo();
		book3.getBookInfo();
		book4.getBookInfo();
	}
}
