package extends1.ex1;

/**
 * CarMain
 *
 * 상속
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

		GasCar gasCar = new GasCar();
		gasCar.move();
		gasCar.fillUp();
	}
}