package poly.ex5;

/**
 * Interface Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class InterfaceMain {

	public static void main(String[] args) {

		// 인터페이스 생성 불가
//		InterfaceAnimal interfaceMain1 = new InterfaceAnimal();

		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();

		soundAnimal(cat);
		soundAnimal(dog);
		soundAnimal(cow);
	}

	// 동물이 추가 되어도 변하지 않는 코드
	private static void soundAnimal(InterfaceAnimal animal) {
		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}