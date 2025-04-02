package ref;

/**
 * Var Change 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class VarChange2 {

	public static void main(String[] args) {

		Data dataA = new Data();
		dataA.value = 10;

		Data dataB = dataA;

		System.out.println("dataA 참조값 = " + dataA); // ref.Data@5f184fc6
		System.out.println("dataB 참조값 = " + dataB); // ref.Data@5f184fc6

		System.out.println("dataA.value = " + dataA.value); // 10
		System.out.println("dataB.value = " + dataB.value); // 10

		// dataA 변경
		dataA.value = 20;
		System.out.println("변경 dataA.value = 20");
		System.out.println("dataA.value = " + dataA.value); // 20
		System.out.println("dataB.value = " + dataB.value); // 20

		// dataB 변경
		dataB.value = 30;
		System.out.println("변경 dataB.value = 30");
		System.out.println("dataA.value = " + dataA.value); // 30
		System.out.println("dataB.value = " + dataB.value); // 30
	}
}