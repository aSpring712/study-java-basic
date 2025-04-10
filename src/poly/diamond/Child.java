package poly.diamond;

/**
 * Child
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Child implements InterfaceA, InterfaceB {

	@Override
	public void methodA() {
		System.out.println("Child.methodA");
	}

	@Override
	public void methodB() {
		System.out.println("Child.methodB");
	}

	@Override
	public void methodCommon() {
		System.out.println("Child.methodCommon");
	}
}