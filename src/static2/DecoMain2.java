package static2;

/**
 * Deco Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class DecoMain2 {

	public static void main(String[] args) {
		String s = "hello java";
		String deco = DecoUtil2.deco(s);

		System.out.println("before: " + s);
		System.out.println("after: " + deco);
	}
}