# static 메서드 1
이번에는 `static`이 붙은 메서드에 대해 알아보자.

특정 문자열을 꾸며주는 간단한 기능을 만들어보자. <br/>
예를 들어서 `"hello"`라는 문자열 앞 뒤에 `*`을 붙여서 `"*hello*"`와 같이 꾸며주는 기능이다.

## 인스턴스 메서드
지금까지 학습한 방식을 통해 해당 기능을 개발해보자.

### DecoUtil1
```java
public class DecoUtil1 {
	public String deco(String str) {
		String result = "*" + str + "*";
		return result;
 	}
}
```
`deco()`는 문자열을 꾸미는 기능을 제공한다. 문자열이 들어오면 앞 뒤에 `*`을 붙여서 반환한다.

### DecoMain1
```java
public static void main(String[] args) {
    String s = "hello java";
    DecoUtil1 utils = new DecoUtil1();
    String deco = utils.deco(s);

    System.out.println("before: " + s);
    System.out.println("after: " + deco);
}
```

앞서 개발한 `deco()` 메서드를 호출하기 위해서는 `DecoUtil1`의 인스턴스를 먼저 생성해야 한다.
그런데 `deco()`라는 기능은 멤버 변수도 없고, 단순히 기능만 제공할 뿐이다. 인스턴스가 필요한 이유는
멤버 변수(인스턴스 변수) 등을 사용하는 목적이 큰데, 이 메서드는 인스턴스 변수도 없고 단순히 기능만
제공한다.

## static 메서드
### DecoUtil2
```java
public class DecoUtil2 {
	public static String deco(String str) {
		String result = "*" + str + "*";
		return result;
	}
}
```
`DecoUtil2`는 앞선 예제와 비슷한데, 메서드 앞에 `static`이 붙어있다. 이 부분에 주의하자. 이렇게
하면 정적 메서드를 만들 수 있다. 그리고 이 정적 메서드는 정적 변수처럼 인스턴스 생성 없이 클래스 명을
통해서 바로 호출할 수 있다.

### DecoMain2
```java
public class DecoMain2 {
	public static void main(String[] args) {
		String s = "hello java";
		String deco = DecoUtil2.deco(s);

		System.out.println("before: " + s);
		System.out.println("after: " + deco);
	}
}
```

`DecoUtil2.deco(s)` 코드를 보자. <br/>
`static`이 붙은 정적 메서드는 객체 생성 없이 클래스명 + `.`(dot) + 메서드 명으로 바로 호출할 수 있다.
정적 메서드 덕분에 불필요한 객체 생성 없이 편리하게 메서드를 사용했다.

### 클래스 메서드
메서드 앞에도 `static`을 붙일 수 있다. 이것을 **정적 메서드** 또는 **클래스 메서드**라 한다.
정적 메서드라는 용어는 `static`이 정적이라는 뜻이기 때문이고, 클래스 메서드라는 용어는 인스턴스
생성 없이 마치 클래스에 있는 메서드를 바로 호출하는 것 처럼 느껴지기 때문이다.

### 인스턴스 메서드
`static`이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 **인스턴스 메서드**라 한다.

---

# static 메서드 2
정적 메서드는 객체 생성없이 클래스에 있는 메서드를 바로 호출할 수 있다는 장점이 있다. <br/>
하지만 정적 메서드는 언제나 사용할 수 있는 것이 아니다.

### 정적 메서드 사용법
- `static` 메서드는 `static`만 사용할 수 있다.
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 `static`이 붙은 **정적 메서드나 정적 변수만 
  사용할 수 있다.** 
  - 클래스 내부의 기능을 사용할 때, 정적 메서드는 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다.
- 반대로 모든 곳에서 `static`을 호출할 수 있다.
  - 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 `static`을
  호출할 수 있다.

### DecoData
```java
public class DecoData {

	private int instanceValue;
	private static int staticValue;

	public static void staticCall() {
//		instanceValue++; // 인스턴스 변수 접근, compile error
//		instanceMethod(); // 인스턴스 메서드 접근, compile error

		staticValue++; // 정적 변수 접근
		staticMethod(); // 정적 메서드 접근
	}

	public void instanceCall() {
		instanceValue++; // 인스턴스 변수 접근
		instanceMethod(); // 인스턴스 메서드 접근

		staticValue++; // 정적 변수 접근
		staticMethod(); // 정적 메서드 접근
	}

	private void instanceMethod() {
		System.out.println("instanceValue = " + instanceValue);
	}

	private static void staticMethod() {
		System.out.println("staticValue = " + staticValue);
	}
}
```
- `instanceValue`는 인스턴스 변수이다.
- `staticValue`는 정적 변수(클래스 변수)이다.
- `instanceMethod()`는 인스턴스 메서드이다.
- `staticMethod()`는 정적 메서드(클래스 메서드)이다.

`staticCall()` 메서드를 보자. <br/>
이 메서드는 정적 메서드이다. 따라서 `static`만 사용할 수 있다. 정적 변수, 정적 메서드에서는 접근할
수 있지만, `static`이 없는 인스턴스 변수나 인스턴스 메서드에 접근하면 **컴파일 오류가 발생**한다. <br/>
코드를 보면 `staticCall()` -> `staticMethod()`로 `static`에서 `static`을 호출하는 것을
확인할 수 있다.

`instanceCall()` 메서드를 보자. <br/>
이 메서드는 인스턴스 메서드이다. 모든 곳에서 공용인 `static`을 호출할 수 있다. 따라서 정적 변수,
정적 메서드에 접근할 수 있다. 물론 인스턴스 변수, 인스턴스 메서드에도 접근할 수 있다.

### DecoDataMain

### 정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유
정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스처럼 참조값의 개념이 없다. <br/>
특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출한다. 따라서
정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.

물론 당연한 이야기지만 다음과 같이 객체의 참조값을 직접 매개변수를 전달하면 정적 메서드도 인스턴스의
변수나 메서드를 호출할 수 있다.
```java
public static void staticCall(DecoData data) {
	data.instanceValue++;
	data.instanceMethod();
}
```

---

# static 메서드 3
## 용어 정리
### 멤버 메서드의 종류
- **인스턴스 메서드**: `static`이 붙지 않은 메서드
- **클래스 메서드**: `static`이 붙은 멤버 메서드
  - 클래스 메서드, 정적 메서드, `static` 메서드 등으로 부른다.

`static`이 붙지 않은 멤버 메서드는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다.
따라서 인스턴스 메서드라 한다. `static`이 붙은 멤버 메서드는 인스턴스와 무관하게 클래스에 바로
접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 메서드라 한다.

참고로 방금 설명한 내용은 멤버 변수에도 똑같이 적용된다.

### 정적 메서드 활용
정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용한다. <br/>
예를 들어 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주 사용한다. 수학의 여러가지 기능을 담은
클래스를 만들 수 있는데, 이 경우 인스턴스 변수 없이 입력한 값을 계산하고 반환하는 것이 대부분이다.
이럴 때 정적 메서드를 사용해서 유틸리티성 메서드를 만들면 좋다.

## 정적 메서드 접근 법
`static` 메서드는 `static` 변수와 마찬가지로 클래스를 통해 바로 접근할 수 있고, 인스턴스를 통해서도
접근할 수 있다.

### DecoDataMain - 추가
```java
// 추가
// 인스턴스를 통한 접근
DecoData data3 = new DecoData();
data3.staticCall();

// 클래스를 통한 접근
DecoData.staticCall();
```
둘의 차이는 없다. 둘다 결과적으로 정적 메서드에 접근한다.

### 인스턴스를 통한 접근 `data3.staticCall()`
정적 메서드의 경우 인스턴스를 통한 접근은 추천하지 않는다. 왜냐하면 코드를 읽을 때 마치 인스턴스 메서드에
접근하는 것 처럼 오해할 수 있기 때문이다.

### 클래스를 통한 접근 `DecoData.staticCall()`
정적 메서드는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다. 따라서
정적 메서드에 접근할 때는 클래스를 통해서 접근하자.

### static import
정적 메서드를 사용할 때 해당 메서드를 다음과 같이 자주 호출해야 한다면 `static import` 기능을 고려하자.
```java
DecoData.staticCall();
DecoData.staticCall();
DecoData.staticCall();
```

이 기능을 사용하면 다음과 같이 클래스 명을 생략하고 메서드를 호출할 수 있다.
```java
staticCall();
staticCall();
staticCall();
```

### DecoDataMain - static import 적용
```java
//import static static2.DecoData.staticCall;
import static static2.DecoData.*;

public class DecoDataMain {
	public static void main(String[] args) {
		System.out.println("1. 정적 호출");
		staticCall(); // 클래스 명 생략 가능
```

특정 클래스의 정적 메서드 하나만 적용하려면 다음과 같이 생략할 메서드 명을 적어주면 된다. <br/>
`import static static2.DecoData.staticCall;`

특정 클래스의 모든 정적 메서드에 적용하려면 다음과 같이 `*`을 사용하면 된다. <br/>
`import static static2.DecoData.*;`

참고로 `import static`은 정적 메서드 뿐만 아니라 정적 변수에도 사용할 수 있다.

## main() 메서드는 정적 메서드
인스턴스 생성 없이 실행하는 가장 대표적인 메서드가 바로 `main()` 메서드이다. <br/>
`main()` 메서드는 프로그램을 시작하는 시작점이 되는데, 생각해보면 객체를 생성하지 않아도 `main()`
메서드가 작동했다. 이것은 `main()` 메서드가 `static`이기 때문이다.

정적 메서드는 정적 메서드만 호출할 수 있다. 따라서 정적 메서드인 `main()`이 호출하는 메서드에는 정적
메서드를 사용했다. <br/>
물론 더 정확히 말하자면 정적 메서드는 같은 클래스 내부에서 정적 메서드만 호출할 수 있다. 따라서
정적 메서드인 `main()` 메서드가 같은 클래스에서 호출하는 메서드도 정적 메서드로 선언해서 사용했다.

### main() 메서드와 static 메서드 호출 예 (ValueDataMain)
```
```