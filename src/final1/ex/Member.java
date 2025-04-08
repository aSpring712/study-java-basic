package final1.ex;

/**
 * Member
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-08
 * @version 1.0
 */
public class Member {

	private final String id; // final 키워드 사용
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public void changeData(String id, String name) {
//		this.id = id; // 컴파일 오류 발생
		this.name = name;
	}

	public void print() {
		System.out.println("id: " + id + ", name: " + name);
	}
}