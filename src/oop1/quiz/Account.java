package oop1.quiz;

/**
 * Account
 *
 * 객체 지향 계좌
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class Account {

	int balance; // 잔액

	void deposit(int amount) {
		balance += amount;
	}

	void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			System.out.println("잔액 부족");
		}
	}
}