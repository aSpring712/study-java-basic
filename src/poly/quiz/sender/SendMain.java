package poly.quiz.sender;

/**
 * Send Main
 *
 * 문제1: 다중 메시지 발송
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class SendMain {

	/*
	* 한번에 여러 곳에 메시지를 발송하는 프로그램 개발
	* - 다형성 활용
	* - Sender 인터페이스 사용
	* - EmailSender, SmsSender, FaceBookSender 구현
	* */

	public static void main(String[] args) {

		Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
		for (Sender sender : senders) {
			sender.sendMessage("환영합니다!");
		}
	}
}