# Kotlin Study

이 저장소는 코틀린 문법을 익히기 위한 간단한 예제들을 모아놓은 곳입니다.
각 디렉터리는 하나의 주제를 다루며 `src/Main.kt`(또는 여러 파일)에서 실행 예제를 확인할 수 있습니다.

## 시작하기
1. [Kotlin 컴파일러](https://kotlinlang.org/docs/command-line.html) 또는 IntelliJ IDEA와 같은 IDE를 설치합니다.
2. 학습하고 싶은 주제의 디렉터리로 이동하여 `Main.kt`의 `main` 함수를 실행합니다.
   - 명령행에서 실행하려면:
     ```bash
     kotlinc src/Main.kt -include-runtime -d app.jar
     java -jar app.jar
     ```

## 학습 주제

| 디렉터리 | 설명 |
|----------|------|
| `Basic` | 기본 출력, 리터럴, 자료형, 변수 선언 등을 연습합니다. |
| `IF` | `if` 조건문과 논리 연산을 실습합니다. |
| `When` | `when` 표현식과 다양한 조건 분기를 학습합니다. |
| `Iteration` | `for`, `while`, `do-while` 반복문과 범위 연산을 다룹니다. |
| `Operator` | 연산자 우선순위와 단항/이항 연산자를 연습합니다. |
| `Function` | 함수 선언, 매개변수 기본값, 반환값, 오버로딩, 지역함수를 다룹니다. |
| `Constructor` | `init` 블록, 기본/보조 생성자, 주 생성자 사용법을 확인합니다. |
| `OOP` | 클래스와 객체, 멤버 프로퍼티/메서드 등 객체지향 기본 개념을 연습합니다. |
| `Property` | 프로퍼티와 커스텀 getter/setter를 통해 캡슐화를 이해합니다. |
| `Access` | `private`, `public`, `protected`, `internal` 접근 제한자를 비교합니다. |
| `Any` | 모든 클래스의 최상위 타입인 `Any`와 `toString`, `equals` 오버라이딩을 연습합니다. |
| `Inheritance` | `open` 클래스를 이용한 상속과 생성자 호출 방법을 실습합니다. |
| `Overwritting` | 오버라이딩을 통해 부모 클래스의 멤버를 재정의하는 방법을 다룹니다. |
| `Animal` | 상속과 접근 제한자를 활용한 `Animal`, `Cat`, `Dog` 예제를 제공합니다. |
| `Collection` | 불변/가변 `List`, `Set`, `Map`의 기본 사용법을 소개합니다. |
| `Lazy` | `lateinit`과 `lazy`를 이용한 지연 초기화를 실험합니다. |
| `Practice01` | `if`, `when`, 반복문 등 기본 문법을 다시 연습합니다. |
| `Practice02` | 컬렉션(`List`, `Set`, `Map`)을 활용한 연습 예제가 포함됩니다. |

필요에 따라 각 디렉터리를 IDE에서 독립 프로젝트로 열어 실습할 수 있습니다.
간단한 예제 코드들을 직접 실행하면서 코틀린의 기본 문법을 빠르게 익혀보세요.
