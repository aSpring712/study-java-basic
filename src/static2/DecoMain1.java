package static2;

/**
 * Deco Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class DecoMain1 {

	public static void main(String[] args) {

		String s = "hello java";
		DecoUtil1 utils = new DecoUtil1();
		String deco = utils.deco(s);

		System.out.println("before: " + s);
		System.out.println("after: " + deco);
	}
}