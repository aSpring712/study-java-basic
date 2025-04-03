package access;

/**
 * Bank Account Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class BankAccountMain {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		account.deposit(10000);
		account.withdraw(3000);
		System.out.println("balance = " + account.getBalance());
	}
}