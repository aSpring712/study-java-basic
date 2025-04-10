package poly.diamond;

/**
 * Diamond Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class DiamondMain {

	public static void main(String[] args) {

		InterfaceA a = new Child();
		a.methodA();
		a.methodCommon();

		InterfaceB b = new Child();
		b.methodB();
		b.methodCommon();
	}
}