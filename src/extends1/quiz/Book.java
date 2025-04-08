package extends1.quiz;

/**
 * Book
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Book extends Item {

	private String author; // 저자
	private String isbn; // isbn

	public Book(String name, int price, String author, String isbn) {
		super(name, price);

		this.author = author;
		this.isbn = isbn;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("- 저자: " + this.author + ", isbn: " + this.isbn);
	}
}