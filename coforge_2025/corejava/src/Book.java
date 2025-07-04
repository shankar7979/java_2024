public class Book {

	private int isbn;
	private String bname;
	private float cost;

//private	
	Book() {
		System.out.println("default constructor called ");
		// isbn=989898;
		// bname="java for beginner";
		// cost=567.67f;
	}

	public Book(int isbn, String bname, float cost) {
		this(isbn,bname);                                  //chaining of constructor 
		
		System.out.println("overloaded constructor1 ");
		this.isbn = isbn;
		this.bname = bname;
		this.cost = cost;
		
	}

	public Book(int isbn, String bname) {
		System.out.println("overloaded constructor2 ");
		this.isbn = isbn;
		this.bname = bname;
		this.cost = 100;
	}

	public void getBookInfo() {
		System.out.println("\nbook data ");
		System.out.println("\t isbn " + isbn);
		System.out.println("\t bname " + bname);
		System.out.println("\t cost " + cost);
	}

	{
		System.out.println("init block1 ");
		// init block called before default constructor and add values to the default
		// constructor
		isbn = 1;
		bname = "my book";
		cost = 56.67f;
	}

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
