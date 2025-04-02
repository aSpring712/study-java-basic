package oop1;

/**
 * Music Player Main 1
 *
 * 절차 지향 음악 플레이어 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MusicPlayerMain1 {

	/*
	* 1. 음악 플레이어를 켜고 끌 수 있어야 한다.
	* 2. 음악 플렐이어의 볼륨을 증가, 감소할 수 있어야 한다.
	* 3. 음악 플레이어의 상태를 확인할 수 있어야 한다.
	* */

	public static void main(String[] args) {

		int volume = 0;
		boolean isOn = false;

		// 음악 플레이어 켜기
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다");

		// 볼륨 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);

		// 볼륨 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);

		// 볼륨 감소
		volume--;
		System.out.println("음악 플레이어 볼륨: " + volume);

		// 음악 플레이어 상태
		System.out.println("음악 플레이어 상태 확인");
		if (isOn) {
			System.out.println("음악 플레이어 ON, 볼륨: " + volume);
		} else {
			System.out.println("음악 플레이어 OFF");
		}

		// 음악 플레이어 끄기
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다");
	}
}