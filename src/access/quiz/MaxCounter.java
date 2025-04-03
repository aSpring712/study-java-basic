package access.quiz;

/**
 * Max Counter
 *
 * 최대 카운터와 캡슐화
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class MaxCounter {

	/*
	* 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공
	* */

	// 내부에서 사용하는 숫자
	private int count = 0; // 초기값 0
	private int max; // 최대값, 생성자를 통해 입력

	public MaxCounter(int max) {
		this.max = max;
	}

	// 숫자 하나 증가
	public void increment() {

		if (count >= max) {

			System.out.println("최대값을 초과할 수 없습니다.");
			return;
		}
		this.count++;
	}

	// 지금까지 증가한 값을 반환
	public int getCount() {
		return this.count;
	}
}