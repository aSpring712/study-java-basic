package static1;

/**
 * Data Count Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class DataCountMain2 {

	public static void main(String[] args) {

		Counter counter = new Counter();
		Data2 data1 = new Data2("A", counter);
		System.out.println("A count = " + counter.count);

		Data2 data2 = new Data2("B", counter);
		System.out.println("B count = " + counter.count);

		Data2 data3 = new Data2("C", counter);
		System.out.println("C count = " + counter.count);
	}
}