package poly.ex2;

/**
 * Animal Poly Main 1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class AnimalPolyMain1 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
	}

	// 동물이 추가 되어도 변하지 않는 코드
	private static void soundAnimal(Animal animal) {

		System.out.println("동물 소리 테스트 시작");
		animal.sound();
		System.out.println("동물 소리 테스트 종료");
	}
}