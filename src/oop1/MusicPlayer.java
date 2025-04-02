package oop1;

/**
 * Music Player
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MusicPlayer {

	int volume = 0;
	boolean isOn = false;

	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다");
	}

	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다");
	}

	void volumeUp() {
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);
	}

	void volumeDown() {
		volume--;
		System.out.println("음악 플레이어 볼륨: " + volume);
	}

	void showStatus() {

		System.out.println("음악 플레이어 상태 확인");
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}
	}
}