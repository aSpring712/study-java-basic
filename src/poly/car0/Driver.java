package poly.car0;

/**
 * Driver
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Driver {

	private K3Car k3Car;
	private Model3Car model3Car; // 추가

	public void setK3Car(K3Car k3Car) {
		this.k3Car = k3Car;
	}

	// 추가
	public void setModel3Car(Model3Car model3Car) {
		this.model3Car = model3Car;
	}

	public void drive() {
		System.out.println("자동차를 운전합니다.");

		if (k3Car != null) {
			k3Car.startEngine();
			k3Car.pressAccelerator();
			k3Car.offEngine();
		} else {
			model3Car.startEngine();
			model3Car.pressAccelerator();
			model3Car.offEngine();
		}
	}
}