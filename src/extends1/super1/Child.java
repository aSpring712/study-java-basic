package extends1.super1;

/**
 * Child
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Child extends Parent {

	public String value = "child";

	@Override
	public void hello() {
		System.out.println("Child.hello");
	}

	public void call() {
		System.out.println("this value = " + this.value); // this 생략 가능
		System.out.println("super value = " + super.value);

		this.hello();
		super.hello();
	}
}