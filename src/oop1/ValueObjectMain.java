package oop1;

/**
 * Value Object Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ValueObjectMain {

	public static void main(String[] args) {

		ValueObject valueObject = new ValueObject();

		valueObject.add();
		valueObject.add();
		valueObject.add();

		System.out.println("최종 숫자 = " + valueObject.value);
	}
}