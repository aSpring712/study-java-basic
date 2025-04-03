package construct.quiz;

/**
 * Book Main
 *
 * Book과 생성자
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class BookMain {

	public static void main(String[] args) {

		// 기본 생성자 사용
		Book book1 = new Book();
		book1.displayInfo();

		// title과 author만을 매개변수로 받는 생성자
		Book book2 = new Book("Hello Java", "Seo");
		book2.displayInfo();

		Book book3 = new Book("JPA 프로그래밍", "kim", 700);
		book3.displayInfo();
	}
}