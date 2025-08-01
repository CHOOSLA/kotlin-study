// 생성자
fun main(){
    var t1 = TestClass1()
    println("==========================")
    var t2 = TestClass2()
    println("==========================")
    var t3 = TestClass2(10,20)
    println("==========================")
    // 매개변수가 있는 생성자만 있을 경우에는 매개변수 없는
    // 생성자를 호출 할 수 없다.
    //    val t4 = TestClass3()
    val t4 = TestClass3(100, 200)
    println("==========================")

    val t6 = TestClass4(1000,2000)
    println("t6.a1: ${t6.a1}")
    println("t6.a2: ${t6.a2}")
    println("==========================")

    val t7 = TestClass4()
    println("t7.a1: ${t7.a1}")
    println("t7.a2: ${t7.a2}")
    println("==========================")

    var t8 = TestClass6(10,20,30)
    println("t8.a1: ${t8.a1}")
    println("t8.a2: ${t8.a2}")
    println("t8.a3: ${t8.a3}")
    println("==========================")

    var t9 = TestClass7(10,20,30)
    println("t9.a1: ${t9.a1}")
    println("t9.a2: ${t9.a2}")
    println("t9.a3: ${t9.a3}")
    println("==========================")

    var t10 = TestClass7(10,20)
    println("t10.a1: ${t10.a1}")
    println("t10.a2: ${t10.a2}")
    println("t10.a3: ${t10.a3}")
    println("==========================")

}

class TestClass1{
    init {
        println("TestClass1의 init 코드 블럭")
        println("객체가 생성될 떄 자동으로 동작하는 부분입니다.")
        println("Java 코드로 변경될 떄 모든 생성자 상단에 삽입되고 실행되는 코드이다.")
    }
}

class TestClass2{
    init {
        println("TestClass2의 init 코드 블럭")
    }

    // 생성자
    constructor(){
        println("TestClass2의 매개변수가 없는 생성자")
    }

    constructor(a1:Int, a2:Int){
        println("TestClass2의 매개변수가 있는 생성자")
        println("a1: $a1")
        println("a2: $a2")
    }
}

class TestClass3 {
    init{
        println("TestClass3의 init 코드 블럭")
    }
    constructor(a1: Int, a2:Int) {
        println("TestClass3의 매개변수가 있는 생성자")
        println("a1 : $a1, a2: $a2")
    }
}

class TestClass4 {
    var a1 = 0
    var a2 = 0

    constructor(a1: Int, a2: Int) {
        println("매개변수가 있는 생성자 호출")
//        println("a1: $a1, a2 : $a2")
        this.a1 = a1
        this.a2 = a2
    }

    constructor():this(100,200) {
        println("매개 변수가 없는 생성자 호출")
    }
}

// 주 생성자
class TestClass5{
    var a1 = 0
    var a2 = 0
    var a3 = 0

    constructor(a1: Int, a2: Int, a3: Int){
        this.a1 = a1
        this.a2 = a2
        this.a3 = a3
    }
}

// 축약버전
//class TestClass6 constructor(var a1: Int,var a2: Int,var a3: Int)
class TestClass6(var a1: Int,var a2: Int,var a3: Int)


class TestClass7(var a1: Int, var a2: Int){
    var a3: Int = 0

    // 다른 생성자
    constructor(a1: Int, a2: Int, a3: Int) : this(a1, a2){
        this.a3 = a3
    }
}