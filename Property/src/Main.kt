// 캡슐화 : 외부에서 변수에 직접 접근하는 것을 차단함으로써 데이터의 무결성을 보장
// 프로퍼티 : 캡슐화에 접근할 수 있는 메서드를 제공하는 개념
// setter : 매개변수로 들어오는 값을 변수에 담아주는 역할을 하는 메서드
// getter : 변수에 저장되어 있는 값을 반환하는 역할을 한다.

fun main(){
    val t1 = TestClass1(100, 200)
    println("t1.a1: ${t1.a1}")
    println("t1.a2: ${t1.a2}")

    t1.a1 = 1000
    println("t1.a1 : ${t1.a1}")

    val t2 = TestClass2()
    println("=====================")
    println("t2.v1 : ${t2.v1}")
    println("t2.v1 : ${t2.v2}")

    t2.v3 = 8
    println("t2.v3 : ${t2.v3}")
}

class TestClass1(var a1: Int, val a2: Int)

class TestClass2{
    var v1 = 0
    var v2 = 0

    // 커스컴 getter / setter
    var v3 = 0
        get(){
            println("getter 호출")
            return field
        }
        set(value){
            println("setter 호출")
            if(value in 1.. 10){
                field = value
            }
        }

    val v4 = 0
        get(){
            println("getter 호출")
            return field
        }
}