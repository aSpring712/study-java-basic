package poly.car1;

/**
 * Driver
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Driver {

	private Car car;

	public void setCar(Car car) {
		System.out.println("자동차를 설정합니다: " + car);
		this.car = car;
	}

	public void drive() {
		System.out.println("자동차를 운전합니다.");
		car.startEngine();
		car.pressAccelerator();
		car.offEngine();
	}
}