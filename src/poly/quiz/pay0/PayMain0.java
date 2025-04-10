package poly.quiz.pay0;

/**
 * Pay Main 0
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class PayMain0 {

	public static void main(String[] args) {

		PayService payService = new PayService();

		// kakao 결제
		String payOption1 = "kakao";
		int amount1 = 5000;
		payService.processPay(payOption1, amount1);

		// naver 결제
		String payOption2 = "naver";
		int amount2 = 10000;
		payService.processPay(payOption2, amount2);

		// 잘못된 결제 수단 선택
		String payOption3 = "bad";
		int amount3 = 15000;
		payService.processPay(payOption3, amount3);
	}
}