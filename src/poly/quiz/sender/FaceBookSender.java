package poly.quiz.sender;

/**
 * Face Book Sender
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class FaceBookSender implements Sender {

	@Override
	public void sendMessage(String message) {
		System.out.println("페이스북에 발송합니다: " + message);
	}
}