package static2.quiz;

/**
 * Math Array Utils
 *
 * 수학 유틸리티 클래스
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class MathArrayUtils {

	private MathArrayUtils() {} // private -> 인스턴스 생성을 막는다.

	public static int sum(int[] values) { // 배열의 모든 요소를 더하여 합계를 반환
		int total = 0;
		for (int value : values) {
			total += value;
		}
		return total;
	}

	public static double average(int[] values) { // 배열의 모든 요소의 평균값을 계산
		return (double) sum(values) / values.length;
	}

	public static int min(int[] values) { // 배열에서 최소값을 찾음
		int minValue = values[0];
		for (int value : values ) {
			if (value < minValue) {
				minValue = value;
			}
		}
		return minValue;
	}

	public static int max(int[] values) { // 배열에서 최대값을 찾음
		int maxValue = values[0];
		for (int value : values) {
			if (value > maxValue) {
				maxValue = value;
			}
		}
		return maxValue;
	}
}