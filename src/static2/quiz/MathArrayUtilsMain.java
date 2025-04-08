package static2.quiz;

/**
 * Math Array Utils Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class MathArrayUtilsMain {

	public static void main(String[] args) {

		int[] values = {1, 2, 3, 4, 5};
		System.out.println("sum = " + MathArrayUtils.sum(values));
		System.out.println("average = " + MathArrayUtils.average(values));
		System.out.println("min = " + MathArrayUtils.min(values));
		System.out.println("max = " + MathArrayUtils.max(values));
	}
}