fun main() {
  println("Hello World!!")

    test1()
    test2(100,11.1)
    test3()
    test3(a2 = 22.00)
    println(test4(100,200))
    test5()
    test6()
    test6(100)
    test6(100,200)
    test6(100,3.14)
    test7()
    //test8() << 이건 지역변수라 안됨
}

fun test1(){
    println("test1 호출")
    println("=============================")
}

// 매개 변수를 가지고 있는 함수
fun test2(a1: Int, a2: Double){
    println(message = "test2 호출")
    println("a1: $a1")
    println("a2: $a2")
    println("=============================")
}

// 기본값이 있는 매개변수
fun test3(a1: Int = 0, a2: Double = 0.0){
    println(message = "test3 호출")
    println("a1: $a1")
    println("a2: $a2")
    println("=============================")
}

// 반환값이 있을 경우 return 문을 사용한다
fun test4(a1: Int = 0, a2: Int) : Int{
    println(message = "test4 호출")
    println("a1: $a1")
    println("a2: $a2")
    val result = a1 + a2
    println("=============================")

    return result
}

// 반환값이 없는 경우 Unit이 생략된 것이다
fun test5() : Unit{
    println(message = "test5 호출")
    println("=============================")
}

// 함수 이름이 같지만 매개변수의 타입과 개수를 다르게 선언할 수 있다.
fun test6(){
    println(message = "test6 호출")
    println("=============================")
}

fun test6(a1: Int){
    println(message = "test6 호출")
    println("a1 : $a1")
    println("=============================")
}

fun test6(a1: Int, a2: Int){
    println(message = "test6 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("=============================")
}

fun test6(a1: Int, a2: Double){
    println(message = "test6 호출")
    println("a1 : $a1")
    println("a2 : $a2")
    println("=============================")
}


// 지역 함수
// 함수를 선언 함수 내부에서만 사용 가능하다.
fun test7(){
    println("test7 호출")

    fun test8(){
        println("test8 호출")
    }

    test8()
}

