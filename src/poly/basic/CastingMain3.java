package poly.basic;

/**
 * Casting Main 3
 *
 * upcasting vs downcasting
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.01
 */
public class CastingMain3 {

	public static void main(String[] args) {

		Child child = new Child();
		Parent parent1 = (Parent) child; // 업캐스팅은 생략 가능, 생략 권장
		Parent parent2 = child; // 업캐스팅 생략

		parent1.parentMethod();
		parent2.parentMethod();
	}
}