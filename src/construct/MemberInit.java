package construct;

/**
 * Member Init
 *
 * 생성자가 필요한 이유
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class MemberInit {

	String name;
	int age;
	int grade;

	// 추가
	void initMember(String name, int age, int grade) {

		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}