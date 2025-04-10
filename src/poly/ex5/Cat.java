package poly.ex5;

/**
 * Cat
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Cat implements InterfaceAnimal{

	@Override
	public void sound() {
		System.out.println("냐옹");
	}

	@Override
	public void move() {
		System.out.println("고양이 이동");
	}
}