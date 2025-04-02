package ref;

/**
 * Null Main 4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class NullMain4 {

	public static void main(String[] args) {

		BigData bigData = new BigData();
		bigData.data = new Data();
		System.out.println("bigData.count = " + bigData.count); // 0
		System.out.println("bigData.data = " + bigData.data); // ref.Data@7cc355be
		System.out.println("bigData.data.value = " + bigData.data.value); // 0
	}
}