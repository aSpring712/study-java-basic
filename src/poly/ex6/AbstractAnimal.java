package poly.ex6;

/**
 * Abstract Animal
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public abstract class AbstractAnimal {

	public abstract void sound();
	public void move() {
		System.out.println("동물이 이동합니다.");
	}
}