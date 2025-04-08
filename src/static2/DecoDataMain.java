package static2;

//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

/**
 * Deco Data Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-07
 * @version 1.0
 */
public class DecoDataMain {

	public static void main(String[] args) {

		System.out.println("1. 정적 호출");
//		DecoData.staticCall();
		staticCall(); // 클래스 명 생략 가능

		System.out.println("2. 인스턴스 호출");
		DecoData data1 = new DecoData();
		data1.instanceCall();

		System.out.println("3. 인스턴스 호출");
		DecoData data2 = new DecoData();
		data2.instanceCall();

		// 추가
		// 인스턴스를 통한 접근
		DecoData data3 = new DecoData();
		data3.staticCall();

		// 클래스를 통한 접근
//		DecoData.staticCall();
		staticCall();
	}
}