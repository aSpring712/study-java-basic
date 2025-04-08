package extends1.overriding;

/**
 * CarMain
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class CarMain {

	public static void main(String[] args) {

		ElectricCar electricCar = new ElectricCar();
		electricCar.move();

		GasCar gasCar = new GasCar();
		gasCar.move();
	}
}