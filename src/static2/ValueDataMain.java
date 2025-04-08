package static2;

import oop1.ValueData;

/**
 * Value Data Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class ValueDataMain {

	public static void main(String[] args) {
		ValueData valueData = new ValueData();
		add(valueData);
	}

	static void add(ValueData valueData) {
		valueData.value++;
		System.out.println("숫자 증가 value = " + valueData.value);
	}
}