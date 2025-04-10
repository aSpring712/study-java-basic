package poly.ex4;

/**
 * Dog
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Dog extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("멍멍");
	}

	public void move() {
		System.out.println("개 이동");
	}
}