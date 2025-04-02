package oop1;

/**
 * Value Object
 *
 * 데이터인 value와 해당 데이터를 사용하는 기능인 add() 메서드를 함께 정의
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ValueObject {

	int value;

	void add() {
		value++;
		System.out.println("숫자 증가 value = " + value);
	}
}