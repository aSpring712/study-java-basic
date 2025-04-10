package poly.basic;

/**
 * Casting Main 1
 *
 * 다형성과 캐스팅
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class CastingMain1 {

	public static void main(String[] args) {

		// 부모 변수가 자식 인스턴스 참조(다형적 참조)
		Parent poly = new Child();
		// 단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
//		poly.childMethod();

		// 다운캐스팅 (부모 타입 -> 자식 타입)
		Child child = (Child) poly;
		child.childMethod();
	}
}