package poly.ex5;

/**
 * Cow
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Cow implements InterfaceAnimal {

	@Override
	public void sound() {
		System.out.println("음매");
	}

	@Override
	public void move() {
		System.out.println("소 이동");
	}
}