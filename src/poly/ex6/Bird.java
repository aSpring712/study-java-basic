package poly.ex6;

/**
 * Bird
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class Bird extends AbstractAnimal implements Fly {

	@Override
	public void sound() {
		System.out.println("짹짹");
	}

	@Override
	public void fly() {
		System.out.println("새 날기");
	}
}