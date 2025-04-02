package ref;

/**
 * Method Change 1
 *
 * 기본형과 메서드 호출
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MethodChange1 {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("메서 호출 전: a = " + a);
		changePrimitive(a);
		System.out.println("메서 호출 후: a = " + a);
	}

	public static void changePrimitive(int x) {
		x = 20;
	}
}