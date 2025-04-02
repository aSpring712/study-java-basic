package ref;

/**
 * Method Change 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MethodChange2 {

	public static void main(String[] args) {

		Data dataA = new Data();
		dataA.value = 10;
		System.out.println("메서드 호출 전: dataA.value = " + dataA.value); // 10
		changeReference(dataA);
		System.out.println("메서드 호출 후: dataA.value = " + dataA.value); // 20
	}

	public static void changeReference(Data dataX) {
		dataX.value = 20;
	}
}