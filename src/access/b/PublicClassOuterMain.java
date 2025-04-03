package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

/**
 * Public Class Outer Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class PublicClassOuterMain {
	public static void main(String[] args) {
		PublicClass publicClass = new PublicClass();

		// 다른 패키지 접근 불가
//		DefaultClass1 class1 = new DefaultClass1();
//		DefaultClass2 class2 = new DefaultClass2();
	}
}