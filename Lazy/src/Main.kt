// 지연 초기화
fun main(){
    val t1 = TestClass1()

    t1.testMethod1()
    t1.a5 = "안녕하세요"
    t1.testMethod1()
}

class TestClass1 {
    var a1: Int = 100
    var a2 = 200

    var a3: Int
    val a6: Int

    // 프로퍼티를 정의할 때 저장할 값을 지정하지 않았지만
    // init 블럭에서 초기화를 해주는 경우 오류가 발생하지 않는다.
    constructor() {
        a3 = 300
        a6 = 600
    }

    // 지연 초기화
    // init 블럭이나 생성자에서 값을 초기화 하지 않고 메서드에서
    // 값을 저장하는 경우 사용한다.
    // var 프로퍼티만 사용 가능하다.
    // Int, Float, Double과 같은 기본자료형ㅇ는 사용할 수 없다.
    lateinit var a5: String

    fun testMethod1() {
        // lateinit 프로퍼티는 사용하기 전에 반드시 값이
        // 저장되어 있는지 확인해야 한다.
        // :: << 메타정보에 접근하는 참조자
        if(::a5.isInitialized) {
            println("a5: ${a5}")
        } else {
            println("a5는 초기화 되지 않았습니다.")
        }
    }

    // lazy를 사용하면 프로퍼티에 저장될 값을 어떠한 처리를
    // 통해 구해 저장할 수 있다.
    val a8: Int by lazy{
        println("a8 lazy 코드블럭")
        val tmp = 1 + 2 + 3
        tmp
    }

}