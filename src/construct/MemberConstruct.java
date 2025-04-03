package construct;

/**
 * MemberConstruct
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class MemberConstruct {

	String name;
	int age;
	int grade;

	// 추가 - 오버로딩
	MemberConstruct(String name, int age) {
//		this.name = name;
//		this.age = age;
//		this.grade = 50;
		this(name, age, 50); // 변경
	}

	MemberConstruct(String name, int age, int grade) {

		System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade = " + grade);

		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}