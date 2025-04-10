package poly.quiz.pay1;

import poly.quiz.pay0.PayService;

import java.util.Scanner;

/**
 * Pay Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class PayMain2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		PayService payService = new PayService();

		while (true) {
			System.out.print("결제 수단을 입력하세요: ");
			String payOption = scanner.nextLine();

			if (payOption.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			System.out.print("결제 금액을 입력하세요: ");
			int amount = scanner.nextInt();

			payService.processPay(payOption, amount);
			scanner.nextLine();
		}
	}
}