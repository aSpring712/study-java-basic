package poly.car0;

/**
 * Car Main 0
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class CarMain0 {

	public static void main(String[] args) {

		Driver driver = new Driver();
		K3Car k3Car = new K3Car();
		driver.setK3Car(k3Car);
		driver.drive();

		// 추가
		Model3Car model3Car = new Model3Car();
		driver.setK3Car(null);
		driver.setModel3Car(model3Car);
		driver.drive();
	}
}