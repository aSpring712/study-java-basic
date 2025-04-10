package poly.ex1;

/**
 * Animal Sound Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class AnimalSoundMain {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		System.out.println("동물 소리 테스트 시작");
		dog.sound();
		System.out.println("동물 소리 테스트 종료");

		System.out.println("동물 소리 테스트 시작");
		cat.sound();
		System.out.println("동물 소리 테스트 종료");

		System.out.println("동물 소리 테스트 시작");
		cow.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}