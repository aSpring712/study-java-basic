package ref;

/**
 * Null Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class NullMain1 {

	public static void main(String[] args) {

		Data data = null;
		System.out.println("1. data = " + data); // null
		data = new Data();
		System.out.println("2. data = " + data); // ref.Data@5b480cf9
		data = null;
		System.out.println("3. data = " + data); // null
	}
}