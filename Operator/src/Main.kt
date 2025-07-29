fun main (){
    var a1 = 10
    var a2 = 20

    // 연산자 사용
    println(a1 + a2)
    println(a1.plus(a2))

    // 최우선 연산자
    // "( )" : 수학과 같이 가장 먼저 계산할 부분이 있다면 "()"로 묶는다.
    var a3 = 10 + 2 * 4
    var a4 = ( 10 + 2 ) * 4

    println("a3 : $a3")
    println("a4 : $a4")

    // 단항 연산자
    // 연산에 참여하는 값이 하나인 연산자
    // ! (not) : 참을 거짓으로 거짓을 참으로 변경하는 연산자
    // 조건식의 결과를 반대로 부정하고 싶을 떄 사용한다.
    var a5 = true;
    var a6 = !a5 // a6는 거짓
    var a7 = !a6
    println("a5 : $a5")
    println("a6 : $a6")
    println("a7 : $a7")
}