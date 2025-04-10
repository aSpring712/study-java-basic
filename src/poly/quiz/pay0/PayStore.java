package poly.quiz.pay0;

/**
 * Pay Store
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public abstract class PayStore {

	// 결제 수단 추가 시 변하는 부분
	public static Pay findPay(String option) {
		if (option.equals("kakao")) {
			return new KakaoPay();
		} else if (option.equals("naver")) {
			return new NaverPay();
		} else {
			return new DefaultPay();
		}
	}

	/*
	* 결제 수단 이름으로 실제 결제 수단 구현체를 찾는다.
	* static으로 기능을 제공한다. 추상 클래스로 선언해서 객체 생성을 막는다.
	* 결제 수단을 찾지 못했을 때 null 대신에 항상 실패하는 결제 수단을 사용한다.
	* */
}