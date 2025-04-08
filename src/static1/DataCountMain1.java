package static1;

/**
 * Data Count Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class DataCountMain1 {

	public static void main(String[] args) {

		Data1 data1 = new Data1("A");
		System.out.println("A count = " + data1.count);

		Data1 data2 = new Data1("B");
		System.out.println("B count = " + data2.count);

		Data1 data3 = new Data1("C");
		System.out.println("C count = " + data3.count);
	}
}