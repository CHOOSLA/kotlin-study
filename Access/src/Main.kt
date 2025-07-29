// 접근 제한자

fun main(){
    val superObj = SuperClass()
    println(superObj.privateMember)
}

open class SuperClass{
    private val privateMember = 100 // 외부에서 접근불가
    public val publicMemer = 200 // 어디에서나 접근 가능(기본)
    protected val protectedMember = 300 // 상속 관계에서만 가능
    internal val internalMember = 400 // 같은 모듈내에서만 가능
}

class SubClass : SuperClass(){
    fun showMembers(){
//        println("privateMember: $privateMember")
        println("publicMember: $publicMemer")
        println("protectedMember: $protectedMember")
        println("internalMember: $internalMember")
    }
}