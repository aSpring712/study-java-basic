package extends1.access.parent;

/**
 * Parent
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Parent {

	public int publicValue;
	protected int protectedValue;
	int defaultValue;
	private int privateValue;

	public void publicMethod() {
		System.out.println("Parent.publicMethod");
	}

	protected void protectedMethod() {
		System.out.println("Parent.protectedMethod");
	}

	void defaultdMethod() {
		System.out.println("Parent.defaultdMethod");
	}

	private void privateMethod() {
		System.out.println("Parent.privateMethod");
	}

	public void printParent() {
		System.out.println("==Parent 메서드 안==");
		System.out.println("PublicValue = " + publicValue);
		System.out.println("protectedValue = " + protectedValue);
		System.out.println("defaultValue = " + defaultValue); // 부모 메서드 안에서 접근 가능
		System.out.println("privateValue = " + privateValue); // 부모 메서드 안에서 접근 가능

		// 부모 메서드 안에서 모두 접근 가능
		defaultdMethod();
		privateMethod();
	}
}