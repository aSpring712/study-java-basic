package extends1.ex3;

/**
 * Car Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class CarMain {

	public static void main(String[] args) {
		ElectricCar electricCar = new ElectricCar();
		electricCar.move();
		electricCar.charge();
		electricCar.openDoor();

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
		gasCar.openDoor();

		HydrogenCar hydrogenCar = new HydrogenCar();
		hydrogenCar.move();
		hydrogenCar.fillHydrogen();
		hydrogenCar.openDoor();
	}
}