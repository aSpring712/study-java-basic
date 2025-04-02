package ref;

/**
 * Null Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class NullMain2 {

	public static void main(String[] args) {

		Data data = null;
		data.value = 10; // Exception in thread "main" java.lang.NullPointerException: Cannot assign field "value" because "data" is null
		System.out.println("data = " + data.value);
	}
}