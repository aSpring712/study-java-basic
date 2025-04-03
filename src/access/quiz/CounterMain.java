package access.quiz;

/**
 * Counter Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class CounterMain {

	/*
	* - 접근 제어자를 사용해서 데이터를 캡슐화
	* - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 함
	* */

	public static void main(String[] args) {

		MaxCounter counter = new MaxCounter(3);
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		int count = counter.getCount();
		System.out.println(count);
	}
}