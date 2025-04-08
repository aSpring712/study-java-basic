package static2.quiz;

/**
 * Car Main
 *
 * 생성한 차량 수를 출력하는 프로그램
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car("K3");
		Car car2 = new Car("G80");
		Car car3 = new Car("Model Y");

		Car.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드
	}
}