package extends1.overriding;

/**
 * Electric Car
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class ElectricCar extends Car {

	@Override
	public void move() {
		System.out.println("전기차를 빠르게 이동합니다.");
	}

	public void charge() {
		System.out.println("충전합니다.");
	}
}