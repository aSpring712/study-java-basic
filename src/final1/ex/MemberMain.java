package final1.ex;

/**
 * Member Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class MemberMain {

	public static void main(String args[]) {
		Member member = new Member("myId", "kim");
		member.print(); // id: myId, name: kim
		member.changeData("myId2", "seo");
		member.print(); // id: myId, name: seo -> id는 변경되지 않음
	}
}