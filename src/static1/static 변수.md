# static 변수 1
이번에는 새로운 키워드인 `static` 키워드에 대해 학습해보자. <br/>
`static` 키워드는 주로 멤버 변수와 메서드에 사용된다. <br/>
먼저 멤버 변수에 `static` 키워드가 왜 필요한지 이해하기 위해 간단한 예제를 만들어보자.

특정 클래스를 통해서 생성된 객체의 수를 세는 단순한 프로그램이다.

## 인스턴스 내부 변수에 카운트 저장
먼저 생성할 인스턴스 내부에 카운트를 저장하겠다.

### Data1
생성된 객체의 수를 세어야 한다. 따라서 객체가 생성될 때 마다 생성자를 통해 인스턴스의 멤버 변수인
`count` 값을 증가시킨다. <br/>
참고로 예제를 단순하게 만들기 위해 필드에 `public`을 사용했다.

### DataCountMain1
```java
public static void main(String[] args) {
    Data1 data1 = new Data1("A");
    System.out.println("A count = " + data1.count);

    Data1 data2 = new Data1("B");
    System.out.println("B count = " + data2.count);

    Data1 data3 = new Data1("C");
    System.out.println("C count = " + data3.count);
}
```
객체를 생성하고 카운트 값을 출력한다.
### 실행 결과
```text
A count = 1
B count = 1
C count = 1
```
이 프로그램은 당연히 기대한 대로 작동하지 않는다. 객체를 생성할 때 마다 `Data1` 인스턴스는 새로
만들어진다. 그리고 인스턴스에 포함된 `count` 변수도 새로 만들어지기 때문이다.

처음 `Data1("A")` 인스턴스를 생성하면 `count` 값은 `0`으로 초기화 된다. 생성자에서 `count++`을
호출했으므로 `count` 값은 `1`이 된다.

다음으로 `Data1("B")` 인스턴스를 생성하면 완전 새로운 인스턴스를 생성한다. 이 새로운 인스턴스의
`count` 값은 `0`으로 초기화 된다. 생성자에서 `count++`을 호출했으므로 `count`의 값은 `1`이
된다.

다음으로 `Data1("C")` 인스턴스를 생성하면 이전 인스턴스는 관계없는 새로운 인스턴스를 생성한다. 이
새로운 인스턴스의 `count` 값은 `0`으로 초기화 된다. 생성자에서 `count++`을 호출했으므로
`count`의 값은 `1`이 된다.

인스턴스에 사용되는 멤버 변수 `count` 값은 인스턴스끼리 서로 공유되지 않는다. 따라서 원하는 답을
구할 수 없다. 이 문제를 해결하려면 변수를 서로 공유해야 한다.

## 외부 인스턴스에 카운트 저장
이번에는 카운트 값을 저장하는 별도의 객체를 만들어보자.

### Counter
```java
public class Counter {
	public int count;
}
```
- 이 객체를 공유해서 필요할 때 마다 카운트 값을 증가할 것이다.

### Data2
```java
public class Data2 {
	public String name;

	public Data2(String name, Counter counter) {
		this.name = name;
		counter.count++;
	}
}
```
- 기존 코드를 유지하기 위해 새로운 `Data2` 클래스를 만들었다. 여기에는 `count` 멤버 변수가 없다.
대신에 생성자에서 `Counter` 인스턴스를 추가로 전달 받는다.
- 생성자가 호출되면 `counter` 인스턴스에 있는 `count` 변수의 값을 하나 증가시킨다.

### DataCountMain2
```java
public static void main(String[] args) {
    Counter counter = new Counter();
    Data2 data1 = new Data2("A", counter);
    System.out.println("A count = " + counter.count);

    Data2 data2 = new Data2("B", counter);
    System.out.println("B count = " + counter.count);

    Data2 data3 = new Data2("C", counter);
    System.out.println("C count = " + counter.count);
}
```

### 실행 결과
```text
A count = 1
B count = 2
C count = 3
```

`Counter` 인스턴스를 공용으로 사용한 덕분에 객체를 생성할 때 마다 값을 정확하게 증가시킬 수 있다.

`Data2("A")` 인스턴스를 생성하면 생성자를 통해 `Counter` 인스턴스에 있는 `counter` 값을 하나
증가시킨다. `count` 값은 1이 된다.

`Data2("B")` 인스턴스를 생성하면 생성자를 통해 `Counter` 인스턴스에 있는 `counter` 값을 하나
증가시킨다. `count` 값은 2이 된다.

`Data2("C")` 인스턴스를 생성하면 생성자를 통해 `Counter` 인스턴스에 있는 `counter` 값을 하나
증가시킨다. `count` 값은 3이 된다.

결과적으로 `Data2`의 인스턴스가 3개 생성되고, `count` 값도 인스턴스 숫자와 같은 3으로 정확하게
측정된다.

그런데 여기에는 약간 불편한 점들이 있다.
- `Data2` 클래스와 관련된 일인데, `Counter`라는 별도의 클래스를 추가로 사용해야 한다.
- 생성자의 매개변수도 추가되고, 생성자가 복잡해진다. 생성자를 호출하는 부분도 복잡해진다.

---
 
# Static 변수 2
## static 변수 사용
특정 클래스에서 공용으로 함께 사용할 수 있는 변수를 만들 수 있다면 편리할 것이다. <br/>
`static` 키워드를 사용하면 공용으로 함께 사용하는 변수를 만들 수 있다.

### Data3
```java
public class Data3 {
	public String name;
	public static int count; // static
	
	public Data3(String name) {
		this.name = name;
		count++;
	}
}
```
- `static int count` 부분을 보자. 변수 타입(`int`) 앞에 `static` 키워드가 붙어있다.
- 이렇게 멤버 변수에 `static`을 붙이게 되면 `static` 변수, 정적 변수 또는 클래스 변수라 한다.
- 객체가 생성되면 생성자에서 정적 변수 `count`의 값을 하나 증가시킨다.

### DataCountMain3
```java
public static void main(String[] args) {
    Data3 data1 = new Data3("A");
    System.out.println("A count = " + Data3.count);

    Data3 data2 = new Data3("B");
    System.out.println("B count = " + Data3.count);

    Data3 data3 = new Data3("C");
    System.out.println("C count = " + Data3.count);
}
```
코드를 보면 `count` 정적 변수에 접근하는 방법이 조금 특이한데 `Data3.count`와 같이 클래스명에
`.`(dot)을 사용한다. 마치 클래스에 직접 접근하는 것 처럼 느껴진다.

### 실행 결과
```text
A count = 1
B count = 2
C count = 3
```
- `static`이 붙은 멤버 변수는 메서드 영역에서 관리한다.
  - `static`이 붙은 멤버 변수 `count`는 인스턴스 영역에 생성되지 않는다. 대신에 메서드 영역에서
  이 변수를 관리한다.
- `Data3("A")` 인스턴스를 생성하면 생성자가 호출된다.
- 생성자에는 `count++` 코드가 있다. `count`는 `static`이 붙은 정적 변수다. 정적 변수는
인스턴스 영역이 아니라 메서드 영역에서 관리한다. 따라서 이 경우는 메서드 영역에 있는 `count`의 값이
하나 증가된다.

- `Data3("B")` 인스턴스를 생성하면 생성자가 호출된다.
- `count++` 코드가 있다. `count`는 `static`이 붙은 정적 변수다. 메서드 영역에 있는 `count`
변수의 값이 하나 증가된다.

- `Data3("C")` 인스턴스를 생성하면 생성자가 호출된다.
- `count++` 코드가 있다. `count`는 `static`이 붙은 정적 변수다. 메서드 영역에 있는 `count`
  변수의 값이 하나 증가된다.

최종적으로 메서드 영역에 있는 `count` 변수의 값은 3이 된다. <br/>
`static`이 붙은 정적 변수에 접근하려면 `Data3.count`와 같이 클래스명 + `.`(dot) + 변수명으로
접근하면 된다. <br/>
참고로 `Data3`의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략할 수 있다.

`static` 변수를 사용한 덕분에 공용 변수를 사용해서 편리하게 문제를 해결할 수 있었다.

### 정리
`static` 변수는 쉽게 이야기해서 클래스인 붕어빵 틀이 특별히 관리하는 변수이다. 붕어빵 틀은 1개
이므로 클래스 변수도 하나만 존재한다. 반면에 인스턴스 변수는 붕어빵인 인스턴스의 수 만큼 존재한다.

---

# static 변수 3
이번에는 `static` 변수를 정리해보자.

## 용어 정리
```java
public class Data3 {
	public String name;
	public static int count; // static
}
```
예제 코드에서 `name`, `count`는 둘 다 멤버 변수이다. <br/>
멤버 변수(필드)는 `static`이 붙은 것과 아닌 것에 따라 다음과 같이 분류할 수 있다.

### 멤버 변수(필드)의 종류
- **인스턴스 변수**: `static`이 붙지 않은 변수, e.g. `name` 
  - `static`이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다.
  따라서 인스턴스 변수라 한다.
  - 인스턴스 변수는 인스턴스를 만들 때 마다 새로 만들어진다.
- **클래스 변수**: `static`이 붙은 멤버 변수, e.g. `count`
  - 클래스 변수, 정적 변수, `static` 변수 등으로 부른다. **용어를 모두 사용하니 주의하자**
  - `static`이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스
  자체에 소속되어 있따. 따라서 클래스 변수라 한다.
  - 클래스 변수는 자바 프로그램을 시작할 때 딱 1개가 만들어진다. 인스턴스와 다른게 보통 여러곳에서
  공유하는 목적으로 사용된다.

## 변수와 생명주기
- **지역 변수(매개변수 포함)**: 지역 변수는 스택 영역에 있는 스택 프레임 안에 보관된다. 메서드가
종료되는 스택 프레임도 제거 되는데 이때 해당 스택 프레임에 포함된 지역 변수도 함께 제거된다. 따라서
지역 변수는 생존 주기가 짧다.
- **인스턴스 변수**: 인스턴스에 있는 멤버 변수를 인스턴스 변수라 한다. 인스턴스 변수는 힙 영역을
사용한다. 힙 영역은 GC(가비지 컬렉션)가 발생하기 전까지는 생존하기 때문에 보통 지역 변수보다 생존
주기가 길다.
- **클래스 변수**: 클래스 변수는 메서드 영역의 static 영역에 보관되는 변수이다. 메서드 영역은
프로그램 전체에서 사용하는 공용 공간이다. 클래스 변수는 해당 클래스가 JVM에 로딩 되는 순간 생성된다.
그리고 JVM이 종료될 때 까지 생명주기가 이어진다. 따라서 가장 긴 생명주기를 가진다.

`static`이 정적이라는 이유는 바로 여기에 있다. 힙 영역에 생성되는 인스턴스 변수는 동적으로 생성되고,
제거된다. 반면에 `static`인 정적 변수는 거의 프로그램 실행 시점에 딱 만들어지고, 프로그램 종료 시점에
제거된다. 정적 변수는 이름 그대로 정적이다.

## 정적 변수 접근 법
`static` 변수는 클래스를 통해 바로 접근할 수도 있고, 인스턴스를 통해서도 접근할 수 있다. <br/>
`DataCountMain3` 마지막 코드에 다음 부분을 추가하고 실행해보자.

### DataCountMain3 - 추가
```java
// 추가
// 인스턴스를 통한 접근
Data3 data4 = new Data3("D");
System.out.println(data4.count); // 4

// 클래스를 통한 접근
System.out.println(Data3.count); // 4
```
둘의 차이는 없다. 둘다 결과적으로 정적 변수에 접근한다.

### 인스턴스를 통한 접근 `data4.count`
정적 변수의 경우 인스턴스를 통한 접근은 추천하지 않는다. 왜냐하면 코드를 읽을 때 마치 인스턴스 변수에
접근하는 것 처럼 오해할 수 있기 때문이다.

### 클래스를 통한 접근 `Data3.count`
정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확하다. 따라서
정적 변수에 접근할 때는 클래스를 통해서 접근하자.