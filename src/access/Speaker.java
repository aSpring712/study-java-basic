package access;

/**
 * Speaker
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class Speaker {

//	int volume;
	private int volume;

	Speaker(int volume) {
		this.volume = volume;
	}

	void volumeUp() {
		if (this.volume >= 100) {
			System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
		} else {
			volume += 10;
			System.out.println("음량을 10 증가합니다.");
		}
	}

	void volumeDown() {
		this.volume -= 10;
		System.out.println("volumeDown 호출");
	}

	void showVolume() {
		System.out.println("현재 음량: " + volume);
	}
}