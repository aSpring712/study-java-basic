package static1;

/**
 * Data 3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class Data3 {

	public String name;
	public static int count; // static

	public Data3(String name) {
		this.name = name;
		count++;
	}
}