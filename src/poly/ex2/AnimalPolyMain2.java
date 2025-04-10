package poly.ex2;

/**
 * Animal Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-10
 * @version 1.0
 */
public class AnimalPolyMain2 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();

		Animal[] animalArr = {dog, cat, cow};

		// 변하지 않는 부분
		for (Animal animal : animalArr) {
			System.out.println("동물 소리 테스트 시작");
			animal.sound();
			System.out.println("동물 소리 테스트 종류");
		}
	}
}