package access;

/**
 * Speaker Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class SpeakerMain {

	public static void main(String[] args) {

		Speaker speaker = new Speaker(90);
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		speaker.volumeUp();
		speaker.showVolume();

		// 필드에 직접 접근
		System.out.println("volume 필드 직접 접근 수정");
//		speaker.volume = 200; // private 접근 오류: volume has private access in access.Speaker
		speaker.showVolume();
	}
}