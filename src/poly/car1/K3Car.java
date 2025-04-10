package poly.car1;

/**
 * K3 Car
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class K3Car implements Car {

	@Override
	public void startEngine() {
		System.out.println("K3Car.startEngine");
	}

	@Override
	public void offEngine() {
		System.out.println("K3Car.offEngine");
	}

	@Override
	public void pressAccelerator() {
		System.out.println("K3Car.pressAccelerator");
	}
}