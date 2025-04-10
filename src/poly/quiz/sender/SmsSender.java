package poly.quiz.sender;

/**
 * SMS Sender
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class SmsSender implements Sender {

	@Override
	public void sendMessage(String message) {
		System.out.println("SMS를 발송합니다: " + message);
	}
}