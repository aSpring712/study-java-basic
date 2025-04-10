package poly.ex4;

/**
 * Cat
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Cat extends AbstractAnimal {

	@Override
	public void sound() {
		System.out.println("냐옹");
	}

	public void move() {
		System.out.println("고양이 이동");
	}
}