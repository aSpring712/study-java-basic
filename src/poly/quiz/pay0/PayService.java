package poly.quiz.pay0;

/**
 * Pay Service
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class PayService {

	public void processPay(String option, int amount) {

		System.out.println("결제를 시작합니다: option = " + option + ", amount = " + amount);

		Pay pay = PayStore.findPay(option);
		boolean result = pay.pay(amount);

		if (result) {
			System.out.println("결제가 성공했습니다.");
		} else {
			System.out.println("결제가 실패했습니다.");
		}
	}

	/*
	* PayService는 구체적인 결제 수단이 아니라 Pay에 의존한다.
	* 따라서 결제 수단을 추가해도 PayService의 코드에는 변경이 없다.
	* */
}