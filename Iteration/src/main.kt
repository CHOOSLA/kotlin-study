fun main(){
    val k1 = 1 .. 10

    println(k1)
    println(k1.toList())

    // 10미만
    val k2 = 1 until 10
    println(k2.toList())

    // < 넣으면 똑같음
    val k3 = 1 ..< 10
    println(k3.toList())

    val k4 = 1 .. 10 step 2
    println(k4.toList())

    val k5 = 10 downTo 1 step 2
    println(k5.toList())

    val a1 = 1 .. 10
    for(item in a1){
        println("item : $item")
    }

    println("========================")
    for(item  in 1.. 10 step 2){
        println("item : $item")
    }

    for(item in 10 downTo 1 step 2){
        println("item : $item")
    }

    // While
    var a5 = 0

    while ( a5 < 10 ){
        println("a5 : $a5")
        a5 ++
    }

    // Do-While
    var a6 = 0
    do{
        println("a5 : $a5")
        a6 ++
    }while(a6 < 0)

    println("=========================")

    println("a6 : $a6")


    var r1 = testFun1(0)
    println(r1)
    var r2 = testFun3(0)
    println(r2)

    println("=========================")

    //break
    for(item in 1 .. 10){
        if( item > 5){
            break
        }
        println("item : $item")
    }

    println("=========================")

    //continue
    for(item in 1 .. 10){
        if( item % 2 == 0){
            continue
        }
        println("item : $item")
    }


}

fun testFun1(a1: Int) : Int{
    println("testFun1")

    return a1 + 100
}

fun testFun2(a1 : Int) = a1 + 100

fun testFun3(a1: Int): Int {
    println("testFun3")

    if(a1 == 0){
        return -1
    }

    println("이부분이 실행이 될까요올?")

    return 100 / a1
}

