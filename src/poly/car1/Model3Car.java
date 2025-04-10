package poly.car1;

/**
 * Model3 Car
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Model3Car implements Car {

	@Override
	public void startEngine() {
		System.out.println("Model3Car.startEngine");
	}

	@Override
	public void offEngine() {
		System.out.println("Model3Car.offEngine");
	}

	@Override
	public void pressAccelerator() {
		System.out.println("Model3Car.pressAccelerator");
	}
}