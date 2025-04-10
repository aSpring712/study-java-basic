package poly.quiz.pay0;

/**
 * Kakao Pay
 *
 * 문제2: 결제 시스템 개발
 * 새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리펙토링해라.
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class KakaoPay implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("카카오페이 시스템과 연결합니다.");
		System.out.println(amount + "원 결제를 시도합니다.");
		return true;
	}
}