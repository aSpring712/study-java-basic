package extends1.ex3;

/**
 * Car
 *
 * 상속과 기능 추가
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Car {

	public void move() {
		System.out.println("차를 이동합니다.");
	}

	// 추가
	public void openDoor() {
		System.out.println("문을 엽니다.");
	}
}