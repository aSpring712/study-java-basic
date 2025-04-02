package ref;

/**
 * Null Main 3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class NullMain3 {

	public static void main(String[] args) {

		BigData bigData = new BigData();
		System.out.println("bigData.count = " + bigData.count); // 0
		System.out.println("bigData.data = " + bigData.data); // null

		// NullPointerException
		System.out.println("bigData.data.value = " + bigData.data.value);
	}
}