package static2.quiz;

/**
 * Car
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Car {

	private static int totalCars;
	private String name;

	public Car(String name) {
		System.out.println("차량 구입, 이름: " + name);
		this.name = name;
		this.totalCars++;
	}

	public static void showTotalCars() {
		System.out.println("구매한 차량 수: " + totalCars);
	}
}