package construct;

/**
 * Construct Main 2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-03
 * @version 1.0
 */
public class ConstructMain2 {

	public static void main(String[] args) {

		MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
		MemberConstruct member2 = new MemberConstruct("user2", 16);

		MemberConstruct[] members = {member1, member2};

		for (MemberConstruct s : members) {
			System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적: " + s.grade);
		}
	}
}