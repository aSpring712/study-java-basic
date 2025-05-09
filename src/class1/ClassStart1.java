package class1;

/**
 * ClassStart1
 *
 * 클래스가 필요한 이유
 * 문제 - 학생 정보 출력 프로그램 만들기 (변수 사용)
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-04-02
 * @version 1.0
 */
public class ClassStart1 {

	/*
	* 두 명의 학생 정보를 출력하는 프로그램 작성. 각 학생은 이름, 나이, 성적을 가지고 있다.
	* 1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90
	* 2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80
	* 3. 각 학생의 정보를 다음과 같은 형식 으로 출력해야 함: "이름: [이름] 나이: [나이] 성적: [성적]"
	* 4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
	* */

	public static void main(String[] args) {

		String student1Name = "학생1";
		int student1Age = 15;
		int student1Grade = 90;

		String student2Name = "학생2";
		int student2Age = 16;
		int student2Grade = 80;

		System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
		System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);
	}

	/*
	* 학생 2명을 다루어야 하기 때문에 각각 다른 변수를 사용했따. 이 코드의 문제는 학생이 늘어날 때 마다 변수를 추가로 선언해야 하고,
	* 또 출력하는 코드도 추가해야 한다.
	* 앞서 배운 배열을 사용하면 문제를 해결할 수 있다.
	* */
}