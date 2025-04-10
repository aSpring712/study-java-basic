package poly.quiz.sender;

/**
 * Email Sender
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class EmailSender implements Sender {

	@Override
	public void sendMessage(String message) {
		System.out.println("메일을 발송합니다: " + message);
	}
}