package class1;

/**
 * Class Start 4
 *
 * 배열 도입
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ClassStart4 {

	public static void main(String[] args) {

		// Student 클래스를 기반으로 student1, student2 인스턴스를 생성하고 필요한 값을 채워둔다.
		Student student1 = new Student();
		student1.name = "학생1";
		student1.age = 15;
		student1.grade = 90;

		Student student2 = new Student();
		student2.name = "학생2";
		student2.age = 16;
		student2.grade = 80;

		// 배열에 참조값 대입 - Student를 담을 수 있는 배열을 생성하고 해당 배열에 student1, student2 인스턴스를 보관
		// Student 배열의 각각 항목도 Student 타입의 변수일 뿐 -> Student 타입의 참조값을 보관
		Student[] students = new Student[2]; // 참조값이 없다는 의미의 null 값으로 초기화
		// 자바에서 대입은 항상 변수에 들어 있는 값을 복사한다.
		students[0] = student1; // 변수에는 인스턴스 자체가 들어가있는 것이 아니다! 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐이다!
		students[1] = student2;

		System.out.println("이름: " + students[0].name + " 나이: " + students[0].age + " 성적: " + students[0].grade);
//		students[0].name // 배열 접근 시작
//		x005.name // [0]을 사용해서 x005 배열의 0번째 요소에 접근
//		x001.name // .(dot)을 사용해서 참조값으로 객체에 접근
//		"학생1"
		System.out.println("이름: " + students[1].name + " 나이: " + students[1].age + " 성적: " + students[1].grade);
	}
}