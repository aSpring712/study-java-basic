package poly.overriding;

/**
 * Child
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Child extends Parent {

	public String value = "child";

	@Override
	public void method() {
		System.out.println("Child.method");
	}
}