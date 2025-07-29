// 오버라이딩
fun main(){
    // 객체를 생성한 후에 객체 생성시 사용한 클래스 타입의 주조값을 저장한다.
    val sub1: SubClass1 = SubClass1()
    // 객체를 생성한 후에 부모 클래스 타입의 주소값을 저장한다
    val super1: SuperClass1 = SubClass1()

    println("s1 : $sub1")
    println("s2 : $super1")

    // 객체를 생성한 클래스 타입의 변수를 이용해 객체의 멤버를 사용한다.
    // 부모 영역
    println("sub1.superValue1: ${sub1.superValue1}")
    sub1.superMethod1()
    // 자신 영역
    println("sub1.subValue1: ${sub1.subValue1}")
    sub1.subMethod1()

    // 오버라이드된 메소드 호출에 관하여
    println("=========================")
    println("super1.superValue1: ${super1.superValue1}")
    super1.superMethod1()


    // 같다
    println("sub1.superValue2: ${sub1.superValue2}")
    println("super1.superValue2 : ${super1.superValue2}")

    // 부모의 것을 사용하려고 하면 super. 을 사용한다.
    sub1.subMethod2()

}

open class SuperClass1{
    val superValue1 = 100
    open val superValue2 = 300

    fun superMethod1(){
        println("SuperClass1의 메서드1")
    }

    open fun superMethod2(){
        println("SuperClass1의 메서드2")
    }
}

class SubClass1 : SuperClass1(){
    val subValue1 = 200
    override val superValue2 = 400

    fun subMethod1(){
        println("SubClass1의 메서드")
    }

    override fun superMethod2() {
        println("SubClass1의 메서드")
    }

    fun subMethod2(){
        println("super.subMethod2 : ${super.superValue2}")
        super.superMethod2()
        // 부모의 것을 사용하고자 한다면 super을 사용한다.
    }
}