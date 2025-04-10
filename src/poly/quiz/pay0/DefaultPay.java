package poly.quiz.pay0;

/**
 * Default Pay
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class DefaultPay implements Pay {

	@Override
	public boolean pay(int amount) {
		System.out.println("결제 수단이 없습니다.");
		return false;
	}
}