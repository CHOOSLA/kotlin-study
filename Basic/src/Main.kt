fun main(){
    // 콘솔 출력 확인
    println("Hello World")

    // 한 줄 주석입니다.
    println("한 줄 주석")


    /*
    * 여러줄 주석입니다
    * 여러줄
    * *
    * *
    */

    print("출력합니다")
    print("출력합니다")
    print("출력합니다")
    print("출력합니다")

    /* 리터럴 */
    // 정수
    println(100)
    println(-100)
    println("값 자체를 리터럴이라고 한다")


    // Raw Stirng
    println("""
        여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
    """.trimIndent())

     println("""
        여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
        여러줄을 출력하고 싶어요
    """)

    // 로으 스트링에서 들여쓰기
    println("""
        |여러줄을 출력하고 싶어요
        |여러줄을 출력하고 싶어요
        |여러줄을 출력하고 싶어요
    """.trimMargin())

    // 논리값도 리터럴
    println(true)
    println(false)

    println("==========================")

    /*
    * 자료형
    */

    // 바이트 자료형
    println("Byte 용량 : ${Byte.SIZE_BYTES}")
    println("Byte 최소값 : ${Byte.MAX_VALUE}")
    println("Byte 최대값 : ${Byte.MIN_VALUE}")
    println()

    // 숏 자료형
    println("Short 용량 : ${Short.SIZE_BYTES}")
    println("Short 최소값 : ${Short.MAX_VALUE}")
    println("Short 최대값 : ${Short.MIN_VALUE}")
    println()

    // 정수 자료형
    println("Int 용량 : ${Int.SIZE_BYTES}")
    println("Int 최소값 : ${Int.MAX_VALUE}")
    println("Int 최대값 : ${Int.MIN_VALUE}")
    println()

    // 롱 자료형
    println("Long 용량 : ${Long.SIZE_BYTES}")
    println("Long 최소값 : ${Long.MAX_VALUE}")
    println("Long 최대값 : ${Long.MIN_VALUE}")
    println()

    println("==========================")
    println()

    // 실수
    println("Float 용량 : ${Float.SIZE_BYTES}")
    println("Float 최소 값 : ${Float.MIN_VALUE}")
    println("Float 최대 값 : ${Float.MAX_VALUE}")
    println()

    println("Double 용량 : ${Double.SIZE_BYTES}")
    println("Double 최소 값 : ${Double.MIN_VALUE}")
    println("Double 최대 값 : ${Double.MAX_VALUE}")
    println()

    val f = 3.33 // 타이을 명시하고 실수를 저장하면 기본 Double로 저장한다

    // 논리
    // Boolean
    // 논리형은 1바이트를 사용한다.
    val bool = true
    val bool2 = false

    // 문자
    // 기본적으로 2바이트를 사용하지만 시스템에 따라간다.
    println("Char 용량 : ${Char.SIZE_BYTES}")

    println("==========================")

    /*
    * 변수
    */
    // 변수 정의하는 방법
    // var/val 변수의 이름 : 타입

    // 4 바이트 기억공간이 마련되고 이 공간이름의 이름은 a1이다.
    var a1: Int;

    a1 = 100
    println("a1 : $a1")

    a1 = 200

    var a2: Int = 300
    var a3 = 300 // 뭐 이렇게 해도 상관없다

    var a7 : Byte = 100
    var a8 : Short = 100
    var a9: Int = 100

    var a10: Double = 11.11
    var a11: Float = 22.22F

    var a12: Char = '가'

    var a13: Boolean = true

    var a14:String = "문자열"

    // val 키워드를 이용해 선언된 변수는 값을 자유롭게 저장할 수 없다.
    val a21 = 100
    println("a21 : ${a21}")

    // val은 값이 한번 지정되면 바꿀 수 없다.
    // a21 = 200

    // null 을 허용하지 않는 변수 . ?를 붙이지 않는다.
    // val a22: Int = null << 이거 되지 않는다 null 체크가 언어에 기본으로

}