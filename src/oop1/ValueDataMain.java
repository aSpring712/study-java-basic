package oop1;

/**
 * Value Data Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ValueDataMain {

	public static void main(String[] args) {

		ValueData valueData = new ValueData();
		add(valueData);
		add(valueData);
		add(valueData);
		System.out.println("최종 숫자 = " + valueData.value);
	}

	static void add(ValueData valueData) {
		valueData.value++;
		System.out.println("숫자 증가 value = " + valueData.value);
	}
}