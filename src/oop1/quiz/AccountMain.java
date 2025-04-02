package oop1.quiz;

/**
 * Account Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class AccountMain {

	public static void main(String[] args) {

		Account account = new Account();

		// 10000원 입금
		account.deposit(10000);
		// 9000원 출금
		account.withdraw(9000);
		// 2000원 출금 시도 -> 잔액 부족
		account.withdraw(2000);

		System.out.println("잔고: " + account.balance);
	}
}