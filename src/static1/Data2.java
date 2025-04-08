package static1;

/**
 * Data 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-04
 * @version 1.0
 */
public class Data2 {
	public String name;

	public Data2(String name, Counter counter) {
		this.name = name;
		counter.count++;
	}
}